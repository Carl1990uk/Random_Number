package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int n;
    public void generate(){
        Random rand = new Random();
        n = rand.nextInt(20) + 1;
    }
    public void guess(View view){
        EditText editText = (EditText) findViewById(R.id.myGuess);
        int guessValue = Integer.parseInt(editText.getText().toString());
        //if else statement for the value:

        if(guessValue < n){
            Toast.makeText(this, "You need to guess higher", Toast.LENGTH_SHORT).show();
        }
        else if(guessValue > n) {
            Toast.makeText(this, "You need to guess lower", Toast.LENGTH_SHORT).show();
        }
        else if(guessValue == n){
            Toast.makeText(this, "Congrats, you did it!. Have another go!", Toast.LENGTH_SHORT).show();
            generate();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generate();
    }
}