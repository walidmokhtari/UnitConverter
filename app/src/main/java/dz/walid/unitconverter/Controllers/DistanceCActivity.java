package dz.walid.unitconverter.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import dz.walid.unitconverter.Models.Distance;
import dz.walid.unitconverter.R;

public class DistanceCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_c);
    }

    public void setupDistance() {
        //Création d'un objet de type Distance
        Distance d = new Distance();

        //Récupération des élements a partir de la vue
        final EditText et_mm = findViewById(R.id.et_mm);
        final EditText et_cm = findViewById(R.id.et_cm);
        final EditText et_dm = findViewById(R.id.et_dm);
        final EditText et_m = findViewById(R.id.et_m);
        final EditText et_dam = findViewById(R.id.et_dam);
        final EditText et_hm = findViewById(R.id.et_hm);
        final EditText et_km = findViewById(R.id.et_km);
        final Button b_c = findViewById(R.id.b_c);
        final Button b_s = findViewById(R.id.b_s);


    }
}
