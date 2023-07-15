package com.example.naqcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageActivity extends AppCompatActivity {
    Button buyButton;
    Button genButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        buyButton = findViewById(R.id.buyButton);
        genButton = findViewById(R.id.genRepButton);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), BuyActivity.class);
                startActivity(i);
            }
        });

        genButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ReportActivity.class);
                startActivity(i);
            }
        });
    }
}