package com.xys.designpattern;

import android.os.Bundle;
import android.view.View;

import com.xys.designpattern.dependencyinjection.dagger2.CarWithDagger;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_button).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                CarWithDagger carWithDagger = new CarWithDagger();
            }
        });
    }
}
