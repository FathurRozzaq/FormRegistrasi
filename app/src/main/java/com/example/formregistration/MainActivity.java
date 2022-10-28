package com.example.formregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText etnm;
EditText etem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inputan
        etnm = findViewById(R.id.etnm);
        etem = findViewById(R.id.etem);
    }

    public void kirimdata(View view) {
        Intent i1 = new Intent(this, HasilActivity.class);
        i1.putExtra("nama",etnm.getText().toString());
        i1.putExtra("TTL",etem.getText().toString());
        startActivity(i1);
    }
}