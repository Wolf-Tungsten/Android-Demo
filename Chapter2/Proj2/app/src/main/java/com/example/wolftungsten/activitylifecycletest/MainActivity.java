package com.example.wolftungsten.activitylifecycletest;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","On Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG","On Restart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_dialog_activity);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });
        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });

    }
}
