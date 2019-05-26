package com.pressure.blood.blood_pressure;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText read1,read2;
    Button checkIn,measurement;
    Calendar sCalendar;
    String dayLongName;
    String allReads;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        read1=(EditText)findViewById(R.id.tex1);
        read2=(EditText)findViewById(R.id.tex2);
        checkIn=(Button)findViewById(R.id.button);
        measurement=(Button)findViewById(R.id.button2);
        checkIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sCalendar = Calendar.getInstance();
                SimpleDateFormat simpledateformat = new SimpleDateFormat("EEEE");
                dayLongName = sCalendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
               // Toast.makeText(MainActivity.this,  dayLongName , Toast.LENGTH_SHORT).show();
                String a1 = read1.getText().toString();
                String a2 = read2.getText().toString();
                int a3 = Integer.parseInt(a1);
                int a4 = Integer.parseInt(a2);
                if (a3 == 180 && a4 == 70) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("My Mesurement")
                            .setMessage("Normal pressure"+"\n"+"\n"+ dayLongName)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            }).setNegativeButton("No", null).show();
                } else if (a3 < 180 && a4 < 70) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("My Mesurement")
                            .setMessage("Low pressure"+"\n"+"\n"+ dayLongName )
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            }).setNegativeButton("No", null).show();
                } else if (a3 > 180 && a4 > 70) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("My Mesurement")
                            .setMessage("High pressure"+"\n"+"\n"+ dayLongName )
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) { }
                            }).setNegativeButton("No", null).show();}
                final String firstRead = read1.getText().toString();
                final String secandRead = read2.getText().toString();
                allReads = firstRead + "/" + secandRead; }});
        measurement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, ""+getData(dayLongName)+"\n \n"+allReads, Toast.LENGTH_SHORT).show();

                Intent goToSecand=new Intent(MainActivity.this,Main2Activity.class);
                goToSecand.putExtra("dayLongName",dayLongName);
                goToSecand.putExtra("allReads",allReads);
                startActivity(goToSecand); }}); }

           public String saveData(String dayLongName, String finalValues) {
       sharedPreferences = this.getSharedPreferences("Blood pressure measurements", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(dayLongName, finalValues);
        editor.commit();
        return finalValues; }

    public String getData( String sundayValue) {
 sharedPreferences =this.getSharedPreferences("Blood pressure measurements", Context.MODE_PRIVATE);
     if( sharedPreferences.contains("Saturday")) {
            sundayValue = sharedPreferences.getString("Saturday",""); }
       else if ( sharedPreferences.contains("Sunday")) {
           sundayValue = sharedPreferences.getString("Sunday",""); }
       else if ( sharedPreferences.contains("Monday")) {
             sundayValue = sharedPreferences.getString("Monday",""); }
       else if( sharedPreferences.contains("Tuesday")) {
            sundayValue = sharedPreferences.getString("Tuesday","");
        }

        else if ( sharedPreferences.contains("Wednesday")) {
            sundayValue = sharedPreferences.getString("Wednesday","");
        }

        else if ( sharedPreferences.contains("Thursday")) {
            sundayValue = sharedPreferences.getString("Thursday","");
        }
     else if ( sharedPreferences.contains("Friday")) {
         sundayValue = sharedPreferences.getString("Friday","");
     }

return   sundayValue;
}

}