package com.example.danielletolentino.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.danielletolentino.minhabiblioteca.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToast customToast = new CustomToast();
        if(BuildConfig.REPORT_CRASH)
            customToast.showToast(this, "Report crash");
        else
            customToast.showToast(this, "No report crash");

        customToast.showToast(this, "Mensagem");
    }
}
