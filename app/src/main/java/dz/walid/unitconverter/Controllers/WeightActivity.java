package dz.walid.unitconverter.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import dz.walid.unitconverter.R;

public class WeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        final Button b_wc = findViewById(R.id.b_wc);
        final Button b_wh = findViewById(R.id.b_wh);

        b_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeightActivity.this, WeightCActivity.class);
                startActivity(intent);
            }
        });

        b_wh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeightActivity.this, WeightHActivity.class);
                startActivity(intent);
            }
        });
    }
}
