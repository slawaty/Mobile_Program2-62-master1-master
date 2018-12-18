package thanakit.ruts.ac.th.lab1_basicss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Temp extends AppCompatActivity {

    private Button Home, Cal;
    private EditText editt;
    private RadioGroup Group;
    private String strTemp,strTempRadio="Celsius",strAnswer;
    private double douAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        editt = (EditText)findViewById(R.id.edittemp);
        Group = (RadioGroup)findViewById(R.id.radioGroup);

        Home = (Button) findViewById(R.id.btnhome);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Temp.this, Profile.class);
                startActivity(intent);
            }
        });

        Cal = (Button) findViewById(R.id.btnresult);
        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    strTemp = editt.getText().toString().trim();
                    if (strTemp.equals("")) {
                        Log.d("Space", "It Have space in Blank");

                    } else if (strTempRadio=="Clsius"){

                        Intent intent = new Intent(Temp.this, Tempcal.class);
                        startActivity(intent);
                        Log.d("Press", "It Have space in Data");

                    } else if (strTempRadio=="Fahrenheit"){

                    Intent intent = new Intent(Temp.this, Tempcal.class);
                    startActivity(intent);
                    Log.d("Press", "It Have space in Data");

                     } else if (strTempRadio=="Kalvin"){


                        Intent intent = new Intent(Temp.this, Tempcal.class);
                        startActivity(intent);
                        Log.d("Pass", "It Have space in Data");
            }



                } catch (Exception e) {

                }
            }

        });

        Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioCe:
                        strTempRadio="Celsius";
                    case  R.id.radioFa:
                        strTempRadio="Fahrenheit";
                    case R.id.radiokvl:
                        strTempRadio="Kalvin";




                }
            }
        });

    }
  }


