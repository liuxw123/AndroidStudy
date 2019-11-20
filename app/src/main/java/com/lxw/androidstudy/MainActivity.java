package com.lxw.androidstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnTv;
    private Button mBtnCal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBtnTv = findViewById(R.id.btn_tv);
        mBtnCal = findViewById(R.id.btn_cal);

        setOnClick();
    }

    private void setOnClick() {
        mBtnTv.setOnClickListener(this);
        mBtnCal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = null;

        switch (v.getId()) {
            case R.id.btn_tv:
                intent = new Intent(MainActivity.this, TextViewActivity.class);
                break;
            case R.id.btn_cal:
                intent = new Intent(MainActivity.this, CalculatorActivity.class);
        }

        startActivity(intent);
    }
}
