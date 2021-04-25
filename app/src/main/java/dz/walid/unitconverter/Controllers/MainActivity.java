package dz.walid.unitconverter.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import dz.walid.unitconverter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b_s = findViewById(R.id.b_s);

        b_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ServiceActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });




       /* FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference().child("1");
        myRef.setValue("Hellooo");

        HashMap<String,String> distanceMap = new HashMap<>();


        distanceMap.put("mm","200");
        distanceMap.put("cm","20");
        distanceMap.put("dcm","2");

        myRef.setValue(distanceMap);*/
    }
}
