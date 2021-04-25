package dz.walid.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference().child("1");
        myRef.setValue("Hellooo");

        HashMap<String,String> distanceMap = new HashMap<>();


        distanceMap.put("mm","200");
        distanceMap.put("cm","20");
        distanceMap.put("dcm","2");

        myRef.setValue(distanceMap);



    }
}
