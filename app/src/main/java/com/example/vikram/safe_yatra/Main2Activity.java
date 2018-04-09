package com.example.vikram.safe_yatra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

//import static com.example.vikram.safe_yatra.R.id.audio;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b1 = (Button) findViewById(R.id.emergency);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this, emergency.class);
                startActivity(i);
            }
        });
        ImageButton b2 = (ImageButton) findViewById(R.id.ImageButton);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this, call.class);
                startActivity(i);
            }
        });
        Button b3 = (Button) findViewById(R.id.help);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main2Activity.this, help.class);
                startActivity(intent1);
            }
            });
        Button b4 = (Button) findViewById(R.id.about);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main2Activity.this, about.class);
                startActivity(intent1);
            }
        });
        ImageButton button=(ImageButton) findViewById(R.id.xyz);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent(Main2Activity.this, audio.class);
                startActivity(i);
            }
        });

    }
}
