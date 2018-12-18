package thanakit.ruts.ac.th.lab1_basicss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class calculate extends AppCompatActivity {
    TextView txtview7, txtview8, txtview9, txtview10, txtview11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        txtview7= (TextView)findViewById(R.id.txtview7);
        txtview8= (TextView)findViewById(R.id.txtview8);
        txtview9= (TextView)findViewById(R.id.txtview9);
        txtview11= (TextView)findViewById(R.id.txtview11);

        txtview7.setText(getIntent().getStringExtra("X"));
        txtview8.setText(getIntent().getStringExtra("Y"));
        txtview9.setText(getIntent().getStringExtra("Z"));
        txtview11.setText(getIntent().getStringExtra("CAL"));
    }

}