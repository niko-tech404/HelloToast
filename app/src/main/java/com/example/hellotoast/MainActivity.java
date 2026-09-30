package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int nCount = 0;
    private TextView nShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        nShowCount = findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        nCount++;
        if (nShowCount != null) {
            nShowCount.setText(String.valueOf(nCount));
        }
    }

    public void countDown(View view) {
        nCount--;
        if (nShowCount != null) {
            nShowCount.setText(String.valueOf(nCount));
        }
    }
}