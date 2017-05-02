package com.heri.skorbasket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ac1 extends AppCompatActivity {

    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac1);
        bt1 = (Button)findViewById(R.id.buttonNext1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ac1.this,Ac2.class);
                startActivity(i);
            }
        });
    }
}
