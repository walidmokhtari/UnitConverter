package dz.walid.unitconverter.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

import dz.walid.unitconverter.Models.Distance;
import dz.walid.unitconverter.R;

public class DistanceCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_c);

        setupDistance();
    }

    public void setupDistance() {
        //Création d'un objet de type Distance
        final Distance d = new Distance();

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
        final TextView tv_e = findViewById(R.id.tv_e);

        //Onclick
        b_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //Récupérer ce qu'il y'a dans l'Edit Text
                    String r_et_mm = et_mm.getText().toString();
                    String r_et_cm = et_cm.getText().toString();
                    String r_et_dm = et_dm.getText().toString();
                    String r_et_m = et_m.getText().toString();
                    String r_et_dam = et_dam.getText().toString();
                    String r_et_hm = et_hm.getText().toString();
                    String r_et_km = et_km.getText().toString();

                    //Faire les converssion si un seul champs est rempli
                    if(!r_et_mm.matches("") && r_et_cm.matches("") && r_et_dm.matches("") && r_et_m.matches("")
                        && r_et_dam.matches("") && r_et_hm.matches("") && r_et_km.matches("")) {
                        d.setMm(Double.parseDouble(r_et_mm));
                        d.MmToCm(Double.parseDouble(r_et_mm));
                        d.MmToDm(Double.parseDouble(r_et_mm));
                        d.MmToM(Double.parseDouble(r_et_mm));
                        d.MmToDam(Double.parseDouble(r_et_mm));
                        d.MmToHm(Double.parseDouble(r_et_mm));
                        d.MmToKm(Double.parseDouble(r_et_mm));

                        //Mettre le résultat dans l'édit text
                        et_mm.setText("Mm : "+d.getMm());
                        et_cm.setText("Cm : "+d.getCm());
                        et_dm.setText("Dm : "+d.getDm());
                        et_m.setText("M : "+d.getM());
                        et_dam.setText("Dam : "+d.getDam());
                        et_hm.setText("Hm : "+d.getHm());
                        et_km.setText("Km : "+d.getKm());

                        //Désactiver la modification des EditText
                        et_mm.setEnabled(false);
                        et_cm.setEnabled(false);
                        et_dm.setEnabled(false);
                        et_m.setEnabled(false);
                        et_dam.setEnabled(false);
                        et_hm.setEnabled(false);
                        et_km.setEnabled(false);
                    }else {
                        if(r_et_mm.matches("") && !r_et_cm.matches("") && r_et_dm.matches("") && r_et_m.matches("")
                                && r_et_dam.matches("") && r_et_hm.matches("") && r_et_km.matches("")){
                            d.setCm(Double.parseDouble(r_et_cm));
                            d.CmToMm(Double.parseDouble(r_et_cm));
                            d.CmToDm(Double.parseDouble(r_et_cm));
                            d.CmToM(Double.parseDouble(r_et_cm));
                            d.CmToDam(Double.parseDouble(r_et_cm));
                            d.CmToHm(Double.parseDouble(r_et_cm));
                            d.CmToKm(Double.parseDouble(r_et_cm));

                            //Mettre le résultat dans l'édit text
                            et_mm.setText("Mm : "+d.getMm());
                            et_cm.setText("Cm : "+d.getCm());
                            et_dm.setText("Dm : "+d.getDm());
                            et_m.setText("M : "+d.getM());
                            et_dam.setText("Dam : "+d.getDam());
                            et_hm.setText("Hm : "+d.getHm());
                            et_km.setText("Km : "+d.getKm());
                        } else {
                            if(r_et_mm.matches("") && r_et_cm.matches("") && !r_et_dm.matches("") && r_et_m.matches("")
                                    && r_et_dam.matches("") && r_et_hm.matches("") && r_et_km.matches("")) {
                                d.setDm(Double.parseDouble(r_et_dm));
                                d.DmToMm(Double.parseDouble(r_et_dm));
                                d.DmToCm(Double.parseDouble(r_et_dm));
                                d.DmToM(Double.parseDouble(r_et_dm));
                                d.DmToDam(Double.parseDouble(r_et_dm));
                                d.DmToHm(Double.parseDouble(r_et_dm));
                                d.DmToKm(Double.parseDouble(r_et_dm));

                                //Mettre le résultat dans l'édit text
                                et_mm.setText("Mm : "+d.getMm());
                                et_cm.setText("Cm : "+d.getCm());
                                et_dm.setText("Dm : "+d.getDm());
                                et_m.setText("M : "+d.getM());
                                et_dam.setText("Dam : "+d.getDam());
                                et_hm.setText("Hm : "+d.getHm());
                                et_km.setText("Km : "+d.getKm());

                                //Désactiver la modification des EditText
                                et_mm.setEnabled(false);
                                et_cm.setEnabled(false);
                                et_dm.setEnabled(false);
                                et_m.setEnabled(false);
                                et_dam.setEnabled(false);
                                et_hm.setEnabled(false);
                                et_km.setEnabled(false);
                            } else {
                                if(r_et_mm.matches("") && r_et_cm.matches("") && r_et_dm.matches("") && !r_et_m.matches("")
                                        && r_et_dam.matches("") && r_et_hm.matches("") && r_et_km.matches("")) {
                                    d.setM(Double.parseDouble(r_et_m));
                                    d.MToMm(Double.parseDouble(r_et_m));
                                    d.MToCm(Double.parseDouble(r_et_m));
                                    d.MToDm(Double.parseDouble(r_et_m));
                                    d.MToDam(Double.parseDouble(r_et_m));
                                    d.MToHm(Double.parseDouble(r_et_m));
                                    d.MToKm(Double.parseDouble(r_et_m));

                                    //Mettre le résultat dans l'édit text
                                    et_mm.setText("Mm : "+d.getMm());
                                    et_cm.setText("Cm : "+d.getCm());
                                    et_dm.setText("Dm : "+d.getDm());
                                    et_m.setText("M : "+d.getM());
                                    et_dam.setText("Dam : "+d.getDam());
                                    et_hm.setText("Hm : "+d.getHm());
                                    et_km.setText("Km : "+d.getKm());

                                    //Désactiver la modification des EditText
                                    et_mm.setEnabled(false);
                                    et_cm.setEnabled(false);
                                    et_dm.setEnabled(false);
                                    et_m.setEnabled(false);
                                    et_dam.setEnabled(false);
                                    et_hm.setEnabled(false);
                                    et_km.setEnabled(false);
                                } else {
                                    if(r_et_mm.matches("") && r_et_cm.matches("") && r_et_dm.matches("") && r_et_m.matches("")
                                            && !r_et_dam.matches("") && r_et_hm.matches("") && r_et_km.matches("")) {
                                        d.setDam(Double.parseDouble(r_et_dam));
                                        d.DamToMm(Double.parseDouble(r_et_dam));
                                        d.DamToCm(Double.parseDouble(r_et_dam));
                                        d.DamToDm(Double.parseDouble(r_et_dam));
                                        d.DamToM(Double.parseDouble(r_et_dam));
                                        d.DamToHm(Double.parseDouble(r_et_dam));
                                        d.DamToKm(Double.parseDouble(r_et_dam));

                                        //Mettre le résultat dans l'édit text
                                        et_mm.setText("Mm : "+d.getMm());
                                        et_cm.setText("Cm : "+d.getCm());
                                        et_dm.setText("Dm : "+d.getDm());
                                        et_m.setText("M : "+d.getM());
                                        et_dam.setText("Dam : "+d.getDam());
                                        et_hm.setText("Hm : "+d.getHm());
                                        et_km.setText("Km : "+d.getKm());

                                        //Désactiver la modification des EditText
                                        et_mm.setEnabled(false);
                                        et_cm.setEnabled(false);
                                        et_dm.setEnabled(false);
                                        et_m.setEnabled(false);
                                        et_dam.setEnabled(false);
                                        et_hm.setEnabled(false);
                                        et_km.setEnabled(false);
                                    } else {
                                        if(r_et_mm.matches("") && r_et_cm.matches("") && r_et_dm.matches("") && r_et_m.matches("")
                                                && r_et_dam.matches("") && !r_et_hm.matches("") && r_et_km.matches("")) {
                                            d.setHm(Double.parseDouble(r_et_hm));
                                            d.HmToMm(Double.parseDouble(r_et_hm));
                                            d.HmToCm(Double.parseDouble(r_et_hm));
                                            d.HmToDm(Double.parseDouble(r_et_hm));
                                            d.HmToM(Double.parseDouble(r_et_hm));
                                            d.HmToDam(Double.parseDouble(r_et_hm));
                                            d.HmToKm(Double.parseDouble(r_et_hm));

                                            //Mettre le résultat dans l'édit text
                                            et_mm.setText("Mm : "+d.getMm());
                                            et_cm.setText("Cm : "+d.getCm());
                                            et_dm.setText("Dm : "+d.getDm());
                                            et_m.setText("M : "+d.getM());
                                            et_dam.setText("Dam : "+d.getDam());
                                            et_hm.setText("Hm : "+d.getHm());
                                            et_km.setText("Km : "+d.getKm());

                                            //Désactiver la modification des EditText
                                            et_mm.setEnabled(false);
                                            et_cm.setEnabled(false);
                                            et_dm.setEnabled(false);
                                            et_m.setEnabled(false);
                                            et_dam.setEnabled(false);
                                            et_hm.setEnabled(false);
                                            et_km.setEnabled(false);
                                        } else {
                                            if(r_et_mm.matches("") && r_et_cm.matches("") && r_et_dm.matches("") && r_et_m.matches("")
                                                    && r_et_dam.matches("") && r_et_hm.matches("") && !r_et_km.matches("")) {
                                                d.setKm(Double.parseDouble(r_et_km));
                                                d.KmToMm(Double.parseDouble(r_et_km));
                                                d.KmToCm(Double.parseDouble(r_et_km));
                                                d.KmToDm(Double.parseDouble(r_et_km));
                                                d.KmToM(Double.parseDouble(r_et_km));
                                                d.KmToDam(Double.parseDouble(r_et_km));
                                                d.KmToHm(Double.parseDouble(r_et_km));

                                                //Mettre le résultat dans l'édit text
                                                et_mm.setText("Mm : "+d.getMm());
                                                et_cm.setText("Cm : "+d.getCm());
                                                et_dm.setText("Dm : "+d.getDm());
                                                et_m.setText("M : "+d.getM());
                                                et_dam.setText("Dam : "+d.getDam());
                                                et_hm.setText("Hm : "+d.getHm());
                                                et_km.setText("Km : "+d.getKm());

                                                //Désactiver la modification des EditText
                                                et_mm.setEnabled(false);
                                                et_cm.setEnabled(false);
                                                et_dm.setEnabled(false);
                                                et_m.setEnabled(false);
                                                et_dam.setEnabled(false);
                                                et_hm.setEnabled(false);
                                                et_km.setEnabled(false);
                                            } else {
                                                tv_e.setText(getText(R.string.t_e));
                                                tv_e.setTextColor(Color.RED);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    //En cas d'erreur
                    tv_e.setText(getText(R.string.t_e));
                    tv_e.setTextColor(Color.RED);
                }
            }
        });

        //Faire un lien avec la base de données
        final FirebaseDatabase db = FirebaseDatabase.getInstance();
        final DatabaseReference r_d = db.getReference().child("Distance");

        //Onclick Save
        b_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //Récupérer ce qu'il y'a dans l'Edit Text
                    String r_et_mm = et_mm.getText().toString();
                    String r_et_cm = et_cm.getText().toString();
                    String r_et_dm = et_dm.getText().toString();
                    String r_et_m = et_m.getText().toString();
                    String r_et_dam = et_dam.getText().toString();
                    String r_et_hm = et_hm.getText().toString();
                    String r_et_km = et_km.getText().toString();
                    if (!r_et_mm.matches("") && !r_et_cm.matches("") && !r_et_dm.matches("") && !r_et_m.matches("")
                            && !r_et_dam.matches("") && !r_et_hm.matches("")) {
                        //Sauvegarder les données dans la base de données
                        HashMap<String, String> timeMap = new HashMap<>();
                        timeMap.put("mm",r_et_mm);
                        timeMap.put("cm",r_et_cm);
                        timeMap.put("dm",r_et_dm);
                        timeMap.put("m",r_et_m);
                        timeMap.put("dam",r_et_dam);
                        timeMap.put("hm",r_et_hm);
                        timeMap.put("km",r_et_km);

                        r_d.push().setValue(timeMap);
                        tv_e.setText(getText(R.string.t_s));
                        tv_e.setTextColor(Color.GREEN);
                    } else {
                        tv_e.setText(getText(R.string.t_ebd));
                        tv_e.setTextColor(Color.RED);
                    }

                } catch (Exception e) {
                    //En cas d'erreur
                    tv_e.setText(getText(R.string.t_ebd));
                    tv_e.setTextColor(Color.RED);
                }
            }
        });


    }
}
