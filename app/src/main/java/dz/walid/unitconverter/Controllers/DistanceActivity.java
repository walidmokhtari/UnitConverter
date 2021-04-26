package dz.walid.unitconverter.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import dz.walid.unitconverter.R;

public class DistanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        final Button b_dc = findViewById(R.id.b_dc);
        final Button b_dh = findViewById(R.id.b_dh);

        b_dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DistanceActivity.this, DistanceCActivity.class);
                startActivity(intent);
            }
        });

        b_dh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DistanceActivity.this, DistanceHActivity.class);
                startActivity(intent);
            }
        });
    }

}
