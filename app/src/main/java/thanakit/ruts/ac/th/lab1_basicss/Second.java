package thanakit.ruts.ac.th.lab1_basicss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Second extends AppCompatActivity {

    ImageButton btnh, btnn;
    Button btnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnh = (ImageButton)findViewById(R.id.imgbtnh);
        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, Profile.class);
                startActivity(intent);
            }
        });
        btnn = (ImageButton)findViewById(R.id.imgbtnn);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, Third.class);
                startActivity(intent);
            }
        });

        btnt = (Button)findViewById(R.id.btntemp);
        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, Temp.class);
                startActivity(intent);
            }
        });

    }
}
