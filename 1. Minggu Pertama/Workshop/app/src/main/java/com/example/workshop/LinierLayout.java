package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LinierLayout extends AppCompatActivity {

    EditText Pada, Subject, Pesan;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linier_layout);

        Pada = findViewById(R.id.Pada);
        Subject = findViewById(R.id.Subject);
        Pesan = findViewById(R.id.Pesan);
        Submit = findViewById(R.id.Submit);
    }
}