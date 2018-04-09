package com.example.vikram.safe_yatra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "TOUCH ANYWHERE TO PROCEED", Toast.LENGTH_SHORT).show();
    }
    public void navigate(View view)
    {
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);
    }

}
