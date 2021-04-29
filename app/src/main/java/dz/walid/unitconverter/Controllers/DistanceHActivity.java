package dz.walid.unitconverter.Controllers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import dz.walid.unitconverter.Models.Distance;
import dz.walid.unitconverter.Models.Weight;
import dz.walid.unitconverter.R;

public class DistanceHActivity extends AppCompatActivity {

    private RecyclerView rv;
    //Faire un lien avec la base de données
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference r_d = db.getReference().child("Distance");
    //Addapter
    private MyAdapterD adapter;
    //Liste
    private ArrayList<Distance> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_h);

        //Récupérer le recyclerView a partir de la vue
        rv = findViewById(R.id.rv_d);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        //Intancier la liste
        list = new ArrayList<>();
        //Instancier l'addapter
        adapter = new MyAdapterD(this, list);

        rv.setAdapter(adapter);

        r_d.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds: snapshot.getChildren()) {
                    Distance d = ds.getValue(Distance.class);
                    list.add(d);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });


    }
}
