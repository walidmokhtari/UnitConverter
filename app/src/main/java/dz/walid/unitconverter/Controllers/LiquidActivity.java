package dz.walid.unitconverter.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import dz.walid.unitconverter.R;

public class LiquidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquid);

        final Button b_lc = findViewById(R.id.b_lc);
        final Button b_lh = findViewById(R.id.b_lh);

        b_lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiquidActivity.this, LiquidCActivity.class);
                startActivity(intent);
            }
        });

        b_lh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiquidActivity.this, LiquidHActivity.class);
                startActivity(intent);
            }
        });
    }
}
