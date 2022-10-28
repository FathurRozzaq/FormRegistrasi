package com.example.formregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txt1 = findViewById(R.id.hasilnama);
        txt1 = findViewById(R.id.hasilttl);

        String nama =getIntent().getExtras().getString("nama");
        String TTL =getIntent().getExtras().getString("TTL");

        txt1.setText("nama : "+nama);
        txt2.setText("TTL : "+TTL);
    }
}