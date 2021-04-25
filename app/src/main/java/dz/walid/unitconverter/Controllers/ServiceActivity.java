package dz.walid.unitconverter.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import dz.walid.unitconverter.R;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        final Button b_d = findViewById(R.id.b_d);
        final Button b_w = findViewById(R.id.b_w);
        final Button b_t = findViewById(R.id.b_t);
        final Button b_lp = findViewById(R.id.b_lp);

        b_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceActivity.this, DistanceActivity.class);
                startActivity(intent);
            }
        });

        b_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceActivity.this, WeightActivity.class);
                startActivity(intent);
            }
        });

        b_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceActivity.this, TimeActivity.class);
                startActivity(intent);
            }
        });

        b_lp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceActivity.this, LiquidActivity.class);
                startActivity(intent);
            }
        });
    }
}
