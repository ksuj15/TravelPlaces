package com.math.android.topcitiestovisit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_estonia= (Button) findViewById(R.id.button_estonia);
        Button button_hochi= (Button) findViewById(R.id.button_hochi);
        Button button_eastafrica= (Button) findViewById(R.id.button_eastafrica);
        Button button_newmexico= (Button) findViewById(R.id.button_newmexico);
        Button button_bosnia= (Button) findViewById(R.id.button_bosnia);

        button_estonia.setOnClickListener(this);
        button_hochi.setOnClickListener(this);
        button_eastafrica.setOnClickListener(this);
        button_newmexico.setOnClickListener(this);
        button_bosnia.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_estonia:
                Intent int1=new Intent(getApplicationContext(),Activity_Estonia.class);
                startActivity(int1);
                break;
            case R.id.button_hochi:
                Intent int2=new Intent(getApplicationContext(),Activity_Hochi.class);
                startActivity(int2);
                break;
            case R.id.button_eastafrica:
                Intent int3=new Intent(getApplicationContext(),Activity_Eastafrica.class);
                startActivity(int3);
                break;
            case R.id.button_newmexico:
                Intent int4=new Intent(getApplicationContext(),Activity_Newmexico.class);
                startActivity(int4);
                break;
            case R.id.button_bosnia:
                Intent int5=new Intent(getApplicationContext(),Activity_Bosnia.class);
                startActivity(int5);
                break;

        }
    }
}