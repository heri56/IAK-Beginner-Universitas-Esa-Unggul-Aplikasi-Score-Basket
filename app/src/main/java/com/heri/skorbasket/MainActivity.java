package com.heri.skorbasket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText namaTim1,namaTim2;
    Button buttonSubmit;
    String nama1,nama2;
    CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namaTim1 = (EditText)findViewById(R.id.namaTim1);
        namaTim2 = (EditText)findViewById(R.id.namaTim2);
        buttonSubmit = (Button)findViewById(R.id.buttonSubmit);
        check = (CheckBox)findViewById(R.id.checkBox);
    }

    public void buttonTekan(View v){
        if(check.isChecked()){
            nama1 = namaTim1.getText().toString();
            nama2 = namaTim2.getText().toString();

            if(nama1.equals("")||nama2.equals("")){
                Toast.makeText(this,"Mohon Isi Secara Lengkap",Toast.LENGTH_LONG).show();
            }else{
                Intent bukaSkor = new Intent(MainActivity.this,SkorActivity.class);
                bukaSkor.putExtra("stringTim1",nama1);
                bukaSkor.putExtra("stringTim2",nama2);

                startActivity(bukaSkor);

                finish();
            }
        }else{
            Toast.makeText(this,"Mohon Centang Boxnya",Toast.LENGTH_LONG).show();
        }
    }
}
