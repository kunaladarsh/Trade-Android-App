package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login_Activity extends AppCompatActivity {
    private EditText userEdt, passEdt;

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        userEdt = findViewById(R.id.editTextTextPersonName);
        passEdt = findViewById(R.id.editTextTextPassword);
    }


    }
