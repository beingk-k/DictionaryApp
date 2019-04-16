package com.yuskay.dictionaryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CapitalActivity extends AppCompatActivity {

    private TextView tvCapital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);

        Bundle bundle = getIntent().getExtras();

        if (bundle!= null){
            String capital = bundle.getString("capital");
            tvCapital = findViewById(R.id.tvCapital);
            tvCapital.setText(capital);
        }
        else
        {
            Toast.makeText(this, "No Meaning", Toast.LENGTH_LONG).show();
        }
    }
}
