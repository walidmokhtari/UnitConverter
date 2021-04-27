package dz.walid.unitconverter.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import dz.walid.unitconverter.Models.Liquid;
import dz.walid.unitconverter.Models.Time;
import dz.walid.unitconverter.R;

public class TimeCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_c);

        setupTime();
    }

    public void setupTime() {
        //Création d'un objet de type Distance
        final Time t = new Time();

        //Récupération des élements a partir de la vue
        final EditText et_s = findViewById(R.id.et_s);
        final EditText et_min = findViewById(R.id.et_min);
        final EditText et_h = findViewById(R.id.et_h);
        final Button b_c = findViewById(R.id.b_c);
        final Button b_s = findViewById(R.id.b_s);
        final TextView tv_e = findViewById(R.id.tv_e);

        //Onclick
        b_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //Récupérer ce qu'il y'a dans l'Edit Text
                    String r_et_s = et_s.getText().toString();
                    String r_et_min = et_min.getText().toString();
                    String r_et_h = et_h.getText().toString();

                    //Faire les converssion si un seul champs est rempli
                    if (!r_et_s.matches("") && r_et_min.matches("") && r_et_h.matches("")) {
                        t.setSeconde(Double.parseDouble(r_et_s));
                        t.SToM(Double.parseDouble(r_et_s));
                        t.SToH(Double.parseDouble(r_et_s));

                        //Mettre le résultat dans l'édit text
                        et_s.setText("S : "+t.getSeconde());
                        et_min.setText("Min : "+t.getMinute());
                        et_h.setText("H : "+t.getHeure());
                    } else {
                        if (r_et_s.matches("") && !r_et_min.matches("") && r_et_h.matches("")) {
                            t.setMinute(Double.parseDouble(r_et_min));
                            t.MToS(Double.parseDouble(r_et_min));
                            t.MToH(Double.parseDouble(r_et_min));

                            //Mettre le résultat dans l'édit text
                            et_s.setText("S : "+t.getSeconde());
                            et_min.setText("Min : "+t.getMinute());
                            et_h.setText("H : "+t.getHeure());
                        } else {
                            if (r_et_s.matches("") && r_et_min.matches("") && !r_et_h.matches("")) {
                                t.setHeure(Double.parseDouble(r_et_h));
                                t.HToS(Double.parseDouble(r_et_h));
                                t.HToM(Double.parseDouble(r_et_h));

                                //Mettre le résultat dans l'édit text
                                et_s.setText("S : "+t.getSeconde());
                                et_min.setText("Min : "+t.getMinute());
                                et_h.setText("H : "+t.getHeure());
                            } else {
                                tv_e.setText(getText(R.string.t_e));
                                tv_e.setTextColor(Color.RED);
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


    }
}
