package com.example.button_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.boom);
        i=1;
    }



    public void click(View view) {
        if (i%7==0) {
            btn.setText("Boom");
            i=i+1;


        }
        else{
            btn.setText ("This is a click number: " + i);
            i=i+1;
        }


    }
}