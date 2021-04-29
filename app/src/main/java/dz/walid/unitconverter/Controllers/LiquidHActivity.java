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

import dz.walid.unitconverter.Models.Liquid;
import dz.walid.unitconverter.Models.Time;
import dz.walid.unitconverter.R;

public class LiquidHActivity extends AppCompatActivity {
    private RecyclerView rv;
    //Faire un lien avec la base de données
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference r_l = db.getReference().child("Liquid");
    //Addapter
    private MyAdapterL adapter;
    //Liste
    private ArrayList<Liquid> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquid_h);

        //Récupérer le recyclerView a partir de la vue
        rv = findViewById(R.id.rv_l);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        //Intancier la liste
        list = new ArrayList<>();
        //Instancier l'addapter
        adapter = new MyAdapterL(this, list);

        rv.setAdapter(adapter);

        r_l.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds: snapshot.getChildren()) {
                    Liquid l = ds.getValue(Liquid.class);
                    list.add(l);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
