package com.example.bruce.tenis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonOnClick(View view){
        Button buttonA = (Button) view;
        EditText editarA = (EditText) findViewById(R.id.TeamAEditText);
        EditText editarB = (EditText) findViewById(R.id.TeamBEditText);
        int num1 = Integer.parseInt(editarA.getText().toString());
        int num2 = Integer.parseInt(editarB.getText().toString());

        if(num1==0){
            num1 = num1 + 15;
        } else if (num1==15){
            num1 = num1 + 15;
        } else if (num1 == 30){
            num1 = num1 + 10;
        } else if (num1 == 40){

        } else {
            if (num2 == )
            editarA.setText("El jugador A gana");
        }
        editarA.setText(Integer.toString(num1));
    }
    public void buttonOnClick2(View view){
        Button buttonB = (Button) view;
        EditText editarA = (EditText) findViewById(R.id.TeamAEditText);
        EditText editarB = (EditText) findViewById(R.id.TeamBEditText);

        int num1 = Integer.parseInt(editarA.getText().toString());
        int num2 = Integer.parseInt(editarB.getText().toString());

        if(num2==0){
            num2 = num2 + 15;
        } else if (num2==15){
            num2 = num2 + 15;
        } else if (num2 == 30){
            num2 = num2 + 10;
        } else if (num2 == 40){
            editarB.setText("Un punto para ganar");
        } else {
            editarB.setText("El jugador B gana");
        }
        editarA.setText(Integer.toString(num2));
    }
}
