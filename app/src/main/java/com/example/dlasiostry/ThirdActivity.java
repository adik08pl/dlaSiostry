package com.example.dlasiostry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {
        private Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
        private boolean czyKlikniete=true,czyKlikniete1=true,czyKlikniete2=true,czyKlikniete3=true,czyKlikniete4=true,czyKlikniete5=true,czyKlikniete6=true,czyKlikniete7=true;
        private final List<String> listaEnglish = new ArrayList<>();
        private final List<String> listaPolish = new ArrayList<>();
        private final com.example.dlasiostry.ThirdActivity this2=this;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_third);
            dodajDoListy("Głowa","ꓷAƎH");
            dodajDoListy("Usta","HTUOM");
            dodajDoListy("Nos","ƎƧOИ");
            dodajDoListy("Ciało","YꓷOꓭ");
            dodajDoListy("Uszy","ƧЯAƎ");
            dodajDoListy("Ręce","ƧMЯA");
            dodajDoListy("Nogi","ƧӘƎ⅃");
            dodajDoListy("Oczy","ƧƎYƎ");
            button1= findViewById(R.id.button1);
            button2= findViewById(R.id.button2);
            button3= findViewById(R.id.button3);
            button4= findViewById(R.id.button4);
            button5= findViewById(R.id.button5);
            button6= findViewById(R.id.button6);
            button7= findViewById(R.id.button7);
            button8= findViewById(R.id.button8);
            button9= findViewById(R.id.button9);
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
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(czyKlikniete7){
                        button7.setText(listaEnglish.get(6));
                    }
                    else{
                        button7.setText(listaPolish.get(6));
                    }
                    button7.animate().rotationY(button7.getRotationY()-180);
                    czyKlikniete7=!czyKlikniete7;
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myActivity = new Intent(this2, MainActivity.class);
                    startActivity(myActivity);
                }
            });
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(czyKlikniete){
                        button9.setText(listaEnglish.get(7));
                    }
                    else{
                        button9.setText(listaPolish.get(7));
                    }
                    button9.animate().rotationY(button9.getRotationY()-180);
                    czyKlikniete=!czyKlikniete;
                }
            });
        }

        private void dodajDoListy(String poPolsku, String poAngielsku) {
            listaPolish.add(poPolsku);
            listaEnglish.add(poAngielsku);
        }
    }