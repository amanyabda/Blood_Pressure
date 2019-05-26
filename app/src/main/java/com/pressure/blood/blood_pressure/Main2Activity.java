package com.pressure.blood.blood_pressure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button btn;
    TextView textView;
    TextView textView1;
    String AllReads,dayOfWeek ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=(TextView)findViewById(R.id.t4);
        textView1=(TextView)findViewById(R.id.t);

        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();

                AllReads = intent.getStringExtra("dayLongName");
                dayOfWeek = intent.getStringExtra("allReads");
                final String ALL = AllReads + dayOfWeek;
                textView.setText(ALL);
            }  });

         // int avg= Integer.parseInt(dayOfWeek)/7;
        //textView1.setText(""+avg);

    }



}
