package dz.walid.unitconverter.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import dz.walid.unitconverter.Models.Liquid;
import dz.walid.unitconverter.Models.Weight;
import dz.walid.unitconverter.R;

public class LiquidCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquid_c);

        setupLiquid();
    }


    public void setupLiquid() {
        //Création d'un objet de type Distance
        final Liquid l = new Liquid();

        //Récupération des élements a partir de la vue
        final EditText et_ml = findViewById(R.id.et_ml);
        final EditText et_cl = findViewById(R.id.et_cl);
        final EditText et_dl = findViewById(R.id.et_dl);
        final EditText et_l = findViewById(R.id.et_l);
        final EditText et_dal = findViewById(R.id.et_dal);
        final EditText et_hl = findViewById(R.id.et_hl);
        final Button b_c = findViewById(R.id.b_c);
        final Button b_s = findViewById(R.id.b_s);
        final TextView tv_e = findViewById(R.id.tv_e);

        //Onclick
        b_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //Récupérer ce qu'il y'a dans l'Edit Text
                    String r_et_ml = et_ml.getText().toString();
                    String r_et_cl = et_cl.getText().toString();
                    String r_et_dl = et_dl.getText().toString();
                    String r_et_l = et_l.getText().toString();
                    String r_et_dal = et_dal.getText().toString();
                    String r_et_hl = et_hl.getText().toString();

                    //Faire les converssion si un seul champs est rempli
                    if(!r_et_ml.matches("") && r_et_cl.matches("") && r_et_dl.matches("") && r_et_l.matches("")
                            && r_et_dal.matches("") && r_et_hl.matches("")) {
                        l.setMl(Double.parseDouble(r_et_ml));
                        l.MlToCl(Double.parseDouble(r_et_ml));
                        l.MlToDl(Double.parseDouble(r_et_ml));
                        l.MlToL(Double.parseDouble(r_et_ml));
                        l.MlToDal(Double.parseDouble(r_et_ml));
                        l.MlToHl(Double.parseDouble(r_et_ml));

                        //Mettre le résultat dans l'édit text
                        et_ml.setText("Ml : "+l.getMl());
                        et_cl.setText("Cl : "+l.getCl());
                        et_dl.setText("Dl : "+l.getDl());
                        et_l.setText("L : "+l.getL());
                        et_dal.setText("Dal : "+l.getDal());
                        et_hl.setText("Hl : "+l.getHl());
                    }else {
                        if(r_et_ml.matches("") && !r_et_cl.matches("") && r_et_dl.matches("") && r_et_l.matches("")
                                && r_et_dal.matches("") && r_et_hl.matches("")){
                            l.setCl(Double.parseDouble(r_et_cl));
                            l.ClToMl(Double.parseDouble(r_et_cl));
                            l.ClToDl(Double.parseDouble(r_et_cl));
                            l.ClToL(Double.parseDouble(r_et_cl));
                            l.ClToDal(Double.parseDouble(r_et_cl));
                            l.ClToHl(Double.parseDouble(r_et_cl));

                            //Mettre le résultat dans l'édit text
                            et_ml.setText("Ml : "+l.getMl());
                            et_cl.setText("Cl : "+l.getCl());
                            et_dl.setText("Dl : "+l.getDl());
                            et_l.setText("L : "+l.getL());
                            et_dal.setText("Dal : "+l.getDal());
                            et_hl.setText("Hl : "+l.getHl());
                        } else {
                            if(r_et_ml.matches("") && r_et_cl.matches("") && !r_et_dl.matches("") && r_et_l.matches("")
                                    && r_et_dal.matches("") && r_et_hl.matches("")) {
                                l.setDl(Double.parseDouble(r_et_dl));
                                l.DlToMl(Double.parseDouble(r_et_dl));
                                l.DlToCl(Double.parseDouble(r_et_dl));
                                l.DlToL(Double.parseDouble(r_et_dl));
                                l.DlToDal(Double.parseDouble(r_et_dl));
                                l.DlToHl(Double.parseDouble(r_et_dl));

                                //Mettre le résultat dans l'édit text
                                et_ml.setText("Ml : "+l.getMl());
                                et_cl.setText("Cl : "+l.getCl());
                                et_dl.setText("Dl : "+l.getDl());
                                et_l.setText("L : "+l.getL());
                                et_dal.setText("Dal : "+l.getDal());
                                et_hl.setText("Hl : "+l.getHl());
                            } else {
                                if(r_et_ml.matches("") && r_et_cl.matches("") && r_et_dl.matches("") && !r_et_l.matches("")
                                        && r_et_dal.matches("") && r_et_hl.matches("")) {
                                    l.setL(Double.parseDouble(r_et_l));
                                    l.LToMl(Double.parseDouble(r_et_l));
                                    l.LToCl(Double.parseDouble(r_et_l));
                                    l.LToDl(Double.parseDouble(r_et_l));
                                    l.LToDal(Double.parseDouble(r_et_l));
                                    l.LToHl(Double.parseDouble(r_et_l));

                                    //Mettre le résultat dans l'édit text
                                    et_ml.setText("Ml : "+l.getMl());
                                    et_cl.setText("Cl : "+l.getCl());
                                    et_dl.setText("Dl : "+l.getDl());
                                    et_l.setText("L : "+l.getL());
                                    et_dal.setText("Dal : "+l.getDal());
                                    et_hl.setText("Hl : "+l.getHl());
                                } else {
                                    if(r_et_ml.matches("") && r_et_cl.matches("") && r_et_dl.matches("") && r_et_l.matches("")
                                            && !r_et_dal.matches("") && r_et_hl.matches("")) {
                                        l.setDal(Double.parseDouble(r_et_l));
                                        l.DalToMl(Double.parseDouble(r_et_l));
                                        l.DalToCl(Double.parseDouble(r_et_l));
                                        l.DalToDl(Double.parseDouble(r_et_l));
                                        l.DalToL(Double.parseDouble(r_et_l));
                                        l.DalToHl(Double.parseDouble(r_et_l));

                                        //Mettre le résultat dans l'édit text
                                        et_ml.setText("Ml : "+l.getMl());
                                        et_cl.setText("Cl : "+l.getCl());
                                        et_dl.setText("Dl : "+l.getDl());
                                        et_l.setText("L : "+l.getL());
                                        et_dal.setText("Dal : "+l.getDal());
                                        et_hl.setText("Hl : "+l.getHl());
                                    } else {
                                        if(r_et_ml.matches("") && r_et_cl.matches("") && r_et_dl.matches("") && r_et_l.matches("")
                                                && r_et_dal.matches("") && !r_et_hl.matches("")) {
                                            l.setHl(Double.parseDouble(r_et_hl));
                                            l.HlToMl(Double.parseDouble(r_et_hl));
                                            l.HlToCl(Double.parseDouble(r_et_hl));
                                            l.HlToDl(Double.parseDouble(r_et_hl));
                                            l.HlToL(Double.parseDouble(r_et_hl));
                                            l.HlToDal(Double.parseDouble(r_et_hl));

                                            //Mettre le résultat dans l'édit text
                                            et_ml.setText("Ml : "+l.getMl());
                                            et_cl.setText("Cl : "+l.getCl());
                                            et_dl.setText("Dl : "+l.getDl());
                                            et_l.setText("L : "+l.getL());
                                            et_dal.setText("Dal : "+l.getDal());
                                            et_hl.setText("Hl : "+l.getHl());
                                        } else {
                                                tv_e.setText(getText(R.string.t_e));
                                                tv_e.setTextColor(Color.RED);
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
