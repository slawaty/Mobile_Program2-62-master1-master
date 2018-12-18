package thanakit.ruts.ac.th.lab1_basicss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    Button btnsum, btndivi, btnmi, btnmuti, btnall;
    EditText crunchifyeditx, crunchifyedity, crunchifyeditall;
    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;
    String multi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btnsum = (Button)findViewById(R.id.btnsum);
        btndivi = (Button)findViewById(R.id.btndivi);
        btnmi = (Button)findViewById(R.id.btnmi);
        btnmuti = (Button)findViewById(R.id.btnmuti);
        btnall = (Button)findViewById(R.id.btnall);
        crunchifyeditall = (EditText)findViewById(R.id.editall);
        crunchifyeditx = (EditText)findViewById(R.id.editx);
        crunchifyedity = (EditText)findViewById(R.id.edity);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyeditx == null) {
                    crunchifyeditx.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyeditx.getText() + "" );
                    crunchifyAddition = true;

                }
            }
        });
        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyeditx.getText() + "");
                mSubtract = true;

            }
        });

      btnmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyeditx.getText() + "");
                crunchifyMultiplication = true;

            }
        });

        btnmuti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyeditx.getText() + "");
                crunchifyDivision = true;

            }
        });

        btnall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyedity.getText() + "");

                if (crunchifyAddition == true) {
                    crunchifyeditall.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                    Intent intent = new Intent(calculator.this, calculate.class);
                    intent.putExtra("X",crunchifyeditx.getText().toString());
                    intent.putExtra("Y",crunchifyedity.getText().toString());
                    String str = "+";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyeditall.getText().toString());
                    startActivity(intent);
                }

                if (mSubtract == true) {
                    crunchifyeditall.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                    Intent intent = new Intent(calculator.this, calculate.class);
                    intent.putExtra("X",crunchifyeditx.getText().toString());
                    intent.putExtra("Y",crunchifyedity.getText().toString());
                    String str = "-";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyeditall.getText().toString());
                    startActivity(intent);
                }

                if (crunchifyMultiplication == true) {
                    crunchifyeditall.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                    Intent intent = new Intent(calculator.this, calculate.class);
                    intent.putExtra("X",crunchifyeditx.getText().toString());
                    intent.putExtra("Y",crunchifyedity.getText().toString());
                    String str = "*";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyeditall.getText().toString());
                    startActivity(intent);
                }

                if (crunchifyDivision == true) {
                    crunchifyeditall.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                    Intent intent = new Intent(calculator.this, calculate.class);
                    intent.putExtra("X",crunchifyeditx.getText().toString());
                    intent.putExtra("Y",crunchifyedity.getText().toString());
                    String str = "/";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyeditall.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
