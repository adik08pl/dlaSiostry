package com.example.dlasiostry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6,button8;
    private boolean czyKlikniete1=true,czyKlikniete2=true,czyKlikniete3=true,czyKlikniete4=true,czyKlikniete5=true,czyKlikniete6=true;
    private List<String> listaEnglish = new ArrayList<>();
    private List<String> listaPolish = new ArrayList<>();
    private SecondActivity this2=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        dodajDoListy("Oczy","ƧƎYƎ");
        dodajDoListy("Węch","⅃⅃ƎMƧ");
        dodajDoListy("Wzrok","ƎƎƧ");
        dodajDoListy("Słuch","ЯAƎH");
        dodajDoListy("Smak","ƎTƧAT");
        dodajDoListy("Dotyk","HƆUOT");
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button8=(Button) findViewById(R.id.button8);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(czyKlikniete1){
                    button1.setText(listaEnglish.get(0));
                }
                else{
                    button1.setText(listaPolish.get(0));
                }
                button1.animate().rotationY(button1.getRotationY()-180);
                czyKlikniete1=!czyKlikniete1;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(czyKlikniete2){
                    button2.setText(listaEnglish.get(1));
                }
                else{
                    button2.setText(listaPolish.get(1));
                }
                button2.animate().rotationY(button2.getRotationY()-180);
                czyKlikniete2=!czyKlikniete2;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(czyKlikniete3){
                    button3.setText(listaEnglish.get(2));
                }
                else{
                    button3.setText(listaPolish.get(2));
                }
                button3.animate().rotationY(button3.getRotationY()-180);
                czyKlikniete3=!czyKlikniete3;
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(czyKlikniete4){
                    button4.setText(listaEnglish.get(3));
                }
                else{
                    button4.setText(listaPolish.get(3));
                }
                button4.animate().rotationY(button4.getRotationY()-180);
                czyKlikniete4=!czyKlikniete4;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(czyKlikniete5){
                    button5.setText(listaEnglish.get(4));
                }
                else{
                    button5.setText(listaPolish.get(4));
                }
                button5.animate().rotationY(button5.getRotationY()-180);
                czyKlikniete5=!czyKlikniete5;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(czyKlikniete6){
                    button6.setText(listaEnglish.get(5));
                }
                else{
                    button6.setText(listaPolish.get(5));
                }
                button6.animate().rotationY(button6.getRotationY()-180);
                czyKlikniete6=!czyKlikniete6;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myActivity = new Intent(this2, MainActivity.class);
                startActivity(myActivity);
            }
        });
    }

    private void dodajDoListy(String poPolsku, String poAngielsku) {
        listaPolish.add(poPolsku);
        listaEnglish.add(poAngielsku);
    }
}