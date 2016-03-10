package com.math.android.topcitiestovisit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Activity_Hochi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hochi);

        TextView t1=(TextView)findViewById(R.id.textView);
        t1.setMovementMethod(new ScrollingMovementMethod());
        t1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
