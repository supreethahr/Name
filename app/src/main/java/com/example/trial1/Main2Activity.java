package com.example.trial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    //Declare
    Button btml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Initialize the Button
        btml=findViewById(R.id.btml);
        btml.setOnClickListener(this);
    }


    public void onClick(View view){
        Toast.makeText(this,"This is a button click",Toast.LENGTH_SHORT).show();
    }
}
