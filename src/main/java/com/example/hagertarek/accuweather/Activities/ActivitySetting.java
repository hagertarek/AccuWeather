package com.example.hagertarek.accuweather.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hagertarek.accuweather.R;

import java.util.Locale;

/**
 * Created by HagEr TaReK on 16/08/2017.
 */
public class ActivitySetting extends AppCompatActivity {
    TextView unitText;
    TextView langText;
    TextView title;
    TextView langtit;
    Locale myLocale;
    RadioGroup radioGroup;
    RadioGroup radioGroup_lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        unitText = (TextView)findViewById(R.id.unit_tx);
        langText = (TextView)findViewById(R.id.A_E);



    }

    public void showTempDialog(View v) {

        final Dialog dialog = new Dialog(this, R.style.CustomDialogTheme);
        dialog.setContentView(R.layout.custom);
        dialog.getWindow().setLayout(1000, 1000);
        title = (TextView) dialog.findViewById(R.id.title);
        title.setText(R.string.Temp_unit);
        radioGroup = (RadioGroup)dialog.findViewById(R.id.RG);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.RB_C) {
                    Toast.makeText(ActivitySetting.this, "C°",
                            Toast.LENGTH_SHORT).show();
                    unitText.setText("C° > ");
                } else if (checkedId == R.id.RB_F) {
                    Toast.makeText(ActivitySetting.this, "F°",
                            Toast.LENGTH_SHORT).show();
                    unitText.setText("F° > ");

                }
            }

        });


        Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
        // if button is clicked, close the custom dialog
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();



    }
    public void showLangDialog(View v) {

        final Dialog dialogLang = new Dialog(this, R.style.CustomDialogTheme);
        dialogLang.setContentView(R.layout.custom_lang);
        dialogLang.getWindow().setLayout(1000, 1000);
        langtit = (TextView) dialogLang.findViewById(R.id.t2);
        langtit.setText(R.string.lang);
        radioGroup_lang = (RadioGroup)dialogLang.findViewById(R.id.RG_lang);

        radioGroup_lang.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.RB_En) {
                    Toast.makeText(ActivitySetting.this, "En",
                            Toast.LENGTH_SHORT).show();
                    langText.setText("En > ");
                    setLocal("en");
                } else if (checkedId == R.id.RB_Ar) {
                    Toast.makeText(ActivitySetting.this, "Ar",
                            Toast.LENGTH_SHORT).show();
                    langText.setText("Ar > ");
                    setLocal("ar");


                }
            }

        });


        Button dialogButton = (Button) dialogLang.findViewById(R.id.dialogButton);
        // if button is clicked, close the custom dialog
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogLang.dismiss();
            }
        });

        dialogLang.show();

    }
    private void setLocal(String language) {
        myLocale = new Locale(language);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        conf.setLayoutDirection(myLocale);
        res.updateConfiguration(conf, dm);
        Intent intent = new Intent(this, ActivityMain.class);
        startActivity(intent);
        finish();
    }


}
