package com.example.wolftungsten.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button2 = (Button) findViewById(R.id.button_2);
           button2.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent();
                   intent.putExtra("Data return", "Hello FirstActivity");
                   setResult(RESULT_OK, intent);
                   finish();
               }
           });
    }
}
