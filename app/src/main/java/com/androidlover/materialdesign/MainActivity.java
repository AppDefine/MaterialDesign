package com.androidlover.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FAB(View view) {
        Toast.makeText(MainActivity.this,"FloatingActionButton",Toast.LENGTH_SHORT).show();
    }

    public void FACEBOOK1(View view) {
        Toast.makeText(MainActivity.this,"FACEBOOK 1",Toast.LENGTH_SHORT).show();
    }

    public void FACEBOOK2(View view) {
        Toast.makeText(MainActivity.this,"FACEBOOK 2",Toast.LENGTH_SHORT).show();
    }
}