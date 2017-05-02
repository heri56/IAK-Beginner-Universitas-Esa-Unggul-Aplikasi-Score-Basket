package com.heri.skorbasket;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SkorActivity extends AppCompatActivity {

    TextView namaTim1,namaTim2,textSkorTim1,textSkorTim2;
    String strNamaTim1,strNamaTim2;
    Button buttonPlus3Tim1,buttonPlus2Tim1,buttonPlus1Tim1;
    Button buttonPlus3Tim2,buttonPlus2Tim2,buttonPlus1Tim2;
    Button buttonReset;
    MediaPlayer putarMusik;

    int skorTim1 = 0;
    int skorTim2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);
        namaTim1 = (TextView)findViewById(R.id.textTim1);
        namaTim2 = (TextView)findViewById(R.id.textTim2);

        textSkorTim1 = (TextView)findViewById(R.id.textScoreTim1);
        textSkorTim2 = (TextView)findViewById(R.id.textScoreTim2);

        textSkorTim1.setText(Integer.toString(skorTim1));
        textSkorTim2.setText(Integer.toString(skorTim2));

        buttonPlus3Tim1 = (Button)findViewById(R.id.buttonPlus3Tim1);
        buttonPlus2Tim1 = (Button)findViewById(R.id.buttonPlus2Tim1);
        buttonPlus1Tim1 = (Button)findViewById(R.id.buttonPlus1Tim1);

        buttonPlus3Tim2 = (Button)findViewById(R.id.buttonPlus3Tim2);
        buttonPlus2Tim2 = (Button)findViewById(R.id.buttonPlus2Tim2);
        buttonPlus1Tim2 = (Button)findViewById(R.id.buttonPlus1Tim2);

        buttonReset = (Button)findViewById(R.id.buttonReset);
        strNamaTim1 = getIntent().getStringExtra("stringTim1");
        strNamaTim2 = getIntent().getStringExtra("stringTim2");

        namaTim1.setText(strNamaTim1);
        namaTim2.setText(strNamaTim2);
    }

    public void tambah3PoinTim1(View v){
        skorTim1+=3;
        textSkorTim1.setText(Integer.toString(skorTim1));
    }

    public void tambah2PoinTim1(View v){
        skorTim1+=2;
        textSkorTim1.setText(Integer.toString(skorTim1));
    }

    public void tambah1PoinTim1(View v){
        skorTim1+=1;
        textSkorTim1.setText(Integer.toString(skorTim1));
    }

    public void tambah3PoinTim2(View v){
        skorTim2+=3;
        textSkorTim2.setText(Integer.toString(skorTim2));
    }

    public void tambah2PoinTim2(View v){
        skorTim2+=2;
        textSkorTim2.setText(Integer.toString(skorTim2));
    }

    public void tambah1PoinTim2(View v){
        skorTim2+=1;
        textSkorTim2.setText(Integer.toString(skorTim2));
    }

    public void resetSkor(View v){
        skorTim1 = 0;
        skorTim2 = 0;
        textSkorTim1.setText(Integer.toString(skorTim1));
        textSkorTim2.setText(Integer.toString(skorTim2));

        putarMusik = MediaPlayer.create(this,R.raw.suara);
        putarMusik.start();

    }

}
