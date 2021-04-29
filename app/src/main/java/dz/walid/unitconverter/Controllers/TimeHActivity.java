package dz.walid.unitconverter.Controllers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import dz.walid.unitconverter.Models.Time;
import dz.walid.unitconverter.R;

public class TimeHActivity extends AppCompatActivity {

    private RecyclerView rv;
    //Faire un lien avec la base de données
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference r_t = db.getReference().child("Time");
    //Addapter
    private MyAdapter adapter;
    //Liste
    private ArrayList<Time> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_h);

        //Récupérer le recyclerView a partir de la vue
        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        //Intancier la liste
        list = new ArrayList<>();
        //Instancier l'addapter
        adapter = new MyAdapter(this, list);

        rv.setAdapter(adapter);

        r_t.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds: snapshot.getChildren()) {
                    Time t = ds.getValue(Time.class);
                    list.add(t);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }


}
