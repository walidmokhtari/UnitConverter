package dz.walid.unitconverter.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import dz.walid.unitconverter.Models.Distance;
import dz.walid.unitconverter.Models.Weight;
import dz.walid.unitconverter.R;

public class WeightCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_c);

        setupWeight();
    }


    public void setupWeight() {
        //Création d'un objet de type Distance
        final Weight w = new Weight();

        //Récupération des élements a partir de la vue
        final EditText et_mg = findViewById(R.id.et_mg);
        final EditText et_cg = findViewById(R.id.et_cg);
        final EditText et_dg = findViewById(R.id.et_dg);
        final EditText et_g = findViewById(R.id.et_g);
        final EditText et_dag = findViewById(R.id.et_dag);
        final EditText et_hg = findViewById(R.id.et_hg);
        final EditText et_kg = findViewById(R.id.et_kg);
        final Button b_c = findViewById(R.id.b_c);
        final Button b_s = findViewById(R.id.b_s);
        final TextView tv_e = findViewById(R.id.tv_e);

        //Onclick
        b_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //Récupérer ce qu'il y'a dans l'Edit Text
                    String r_et_mg = et_mg.getText().toString();
                    String r_et_cg = et_cg.getText().toString();
                    String r_et_dg = et_dg.getText().toString();
                    String r_et_g = et_g.getText().toString();
                    String r_et_dag = et_dag.getText().toString();
                    String r_et_hg = et_hg.getText().toString();
                    String r_et_kg = et_kg.getText().toString();

                   //Faire les converssion si un seul champs est rempli
                    if(!r_et_mg.matches("") && r_et_cg.matches("") && r_et_dg.matches("") && r_et_g.matches("")
                            && r_et_dag.matches("") && r_et_hg.matches("") && r_et_kg.matches("")) {
                        w.setMg(Double.parseDouble(r_et_mg));
                        w.MgToCg(Double.parseDouble(r_et_mg));
                        w.MgToDg(Double.parseDouble(r_et_mg));
                        w.MgToG(Double.parseDouble(r_et_mg));
                        w.MgToDag(Double.parseDouble(r_et_mg));
                        w.MgToHg(Double.parseDouble(r_et_mg));
                        w.MgToKg(Double.parseDouble(r_et_mg));

                        //Mettre le résultat dans l'édit text
                        et_mg.setText("Mg : "+w.getMg());
                        et_cg.setText("Cg : "+w.getCg());
                        et_dg.setText("Dg : "+w.getDg());
                        et_g.setText("G : "+w.getG());
                        et_dag.setText("Dag : "+w.getDag());
                        et_hg.setText("Hg : "+w.getHg());
                        et_kg.setText("Kg : "+w.getKg());
                    }else {
                        if(r_et_mg.matches("") && !r_et_cg.matches("") && r_et_dg.matches("") && r_et_g.matches("")
                                && r_et_dag.matches("") && r_et_hg.matches("") && r_et_kg.matches("")){
                            w.setCg(Double.parseDouble(r_et_cg));
                            w.CgToMg(Double.parseDouble(r_et_cg));
                            w.CgToDg(Double.parseDouble(r_et_cg));
                            w.CgToG(Double.parseDouble(r_et_cg));
                            w.CgToDag(Double.parseDouble(r_et_cg));
                            w.CgToHg(Double.parseDouble(r_et_cg));
                            w.CgToKg(Double.parseDouble(r_et_cg));

                            //Mettre le résultat dans l'édit text
                            et_mg.setText("Mg : "+w.getMg());
                            et_cg.setText("Cg : "+w.getCg());
                            et_dg.setText("Dg : "+w.getDg());
                            et_g.setText("G : "+w.getG());
                            et_dag.setText("Dag : "+w.getDag());
                            et_hg.setText("Hg : "+w.getHg());
                            et_kg.setText("Kg : "+w.getKg());
                        } else {
                            if(r_et_mg.matches("") && r_et_cg.matches("") && !r_et_dg.matches("") && r_et_g.matches("")
                                    && r_et_dag.matches("") && r_et_hg.matches("") && r_et_kg.matches("")) {
                                w.setDg(Double.parseDouble(r_et_dg));
                                w.DgToMg(Double.parseDouble(r_et_dg));
                                w.DgToCg(Double.parseDouble(r_et_dg));
                                w.DgToG(Double.parseDouble(r_et_dg));
                                w.DgToDag(Double.parseDouble(r_et_dg));
                                w.DgToHg(Double.parseDouble(r_et_dg));
                                w.DgToKg(Double.parseDouble(r_et_dg));

                                //Mettre le résultat dans l'édit text
                                et_mg.setText("Mg : "+w.getMg());
                                et_cg.setText("Cg : "+w.getCg());
                                et_dg.setText("Dg : "+w.getDg());
                                et_g.setText("G : "+w.getG());
                                et_dag.setText("Dag : "+w.getDag());
                                et_hg.setText("Hg : "+w.getHg());
                                et_kg.setText("Kg : "+w.getKg());
                            } else {
                                if(r_et_mg.matches("") && r_et_cg.matches("") && r_et_dg.matches("") && !r_et_g.matches("")
                                        && r_et_dag.matches("") && r_et_hg.matches("") && r_et_kg.matches("")) {
                                    w.setG(Double.parseDouble(r_et_g));
                                    w.GToMg(Double.parseDouble(r_et_g));
                                    w.GToCg(Double.parseDouble(r_et_g));
                                    w.GToDg(Double.parseDouble(r_et_g));
                                    w.GToDag(Double.parseDouble(r_et_g));
                                    w.GToHg(Double.parseDouble(r_et_g));
                                    w.GToKg(Double.parseDouble(r_et_g));

                                    //Mettre le résultat dans l'édit text
                                    et_mg.setText("Mg : "+w.getMg());
                                    et_cg.setText("Cg : "+w.getCg());
                                    et_dg.setText("Dg : "+w.getDg());
                                    et_g.setText("G : "+w.getG());
                                    et_dag.setText("Dag : "+w.getDag());
                                    et_hg.setText("Hg : "+w.getHg());
                                    et_kg.setText("Kg : "+w.getKg());
                                } else {
                                    if(r_et_mg.matches("") && r_et_cg.matches("") && r_et_dg.matches("") && r_et_g.matches("")
                                            && !r_et_dag.matches("") && r_et_hg.matches("") && r_et_kg.matches("")) {
                                        w.setDag(Double.parseDouble(r_et_dag));
                                        w.DagToMg(Double.parseDouble(r_et_dag));
                                        w.DagToCg(Double.parseDouble(r_et_dag));
                                        w.DagToDg(Double.parseDouble(r_et_dag));
                                        w.DagToG(Double.parseDouble(r_et_dag));
                                        w.DagToHg(Double.parseDouble(r_et_dag));
                                        w.DagToKg(Double.parseDouble(r_et_dag));

                                        //Mettre le résultat dans l'édit text
                                        et_mg.setText("Mg : "+w.getMg());
                                        et_cg.setText("Cg : "+w.getCg());
                                        et_dg.setText("Dg : "+w.getDg());
                                        et_g.setText("G : "+w.getG());
                                        et_dag.setText("Dag : "+w.getDag());
                                        et_hg.setText("Hg : "+w.getHg());
                                        et_kg.setText("Kg : "+w.getKg());
                                    } else {
                                        if(r_et_mg.matches("") && r_et_cg.matches("") && r_et_dg.matches("") && r_et_g.matches("")
                                                && r_et_dag.matches("") && !r_et_hg.matches("") && r_et_kg.matches("")) {
                                            w.setHg(Double.parseDouble(r_et_hg));
                                            w.HgToMg(Double.parseDouble(r_et_hg));
                                            w.HgToCg(Double.parseDouble(r_et_hg));
                                            w.HgToDg(Double.parseDouble(r_et_hg));
                                            w.HgToG(Double.parseDouble(r_et_hg));
                                            w.HgToDag(Double.parseDouble(r_et_hg));
                                            w.HgToKg(Double.parseDouble(r_et_hg));

                                            //Mettre le résultat dans l'édit text
                                            et_mg.setText("Mg : "+w.getMg());
                                            et_cg.setText("Cg : "+w.getCg());
                                            et_dg.setText("Dg : "+w.getDg());
                                            et_g.setText("G : "+w.getG());
                                            et_dag.setText("Dag : "+w.getDag());
                                            et_hg.setText("Hg : "+w.getHg());
                                            et_kg.setText("Kg : "+w.getKg());
                                        } else {
                                            if(r_et_mg.matches("") && r_et_cg.matches("") && r_et_dg.matches("") && r_et_g.matches("")
                                                    && r_et_dag.matches("") && r_et_hg.matches("") && !r_et_kg.matches("")) {
                                                w.setKg(Double.parseDouble(r_et_kg));
                                                w.KgToMg(Double.parseDouble(r_et_kg));
                                                w.KgToCg(Double.parseDouble(r_et_kg));
                                                w.KgToDg(Double.parseDouble(r_et_kg));
                                                w.KgToG(Double.parseDouble(r_et_kg));
                                                w.KgToDag(Double.parseDouble(r_et_kg));
                                                w.KgToHg(Double.parseDouble(r_et_kg));

                                                //Mettre le résultat dans l'édit text
                                                et_mg.setText("Mg : "+w.getMg());
                                                et_cg.setText("Cg : "+w.getCg());
                                                et_dg.setText("Dg : "+w.getDg());
                                                et_g.setText("G : "+w.getG());
                                                et_dag.setText("Dag : "+w.getDag());
                                                et_hg.setText("Hg : "+w.getHg());
                                                et_kg.setText("Kg : "+w.getKg());
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


    }
}
