package com.lxw.androidstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnNum0;
    private Button mBtnNum1;
    private Button mBtnNum2;
    private Button mBtnNum3;
    private Button mBtnNum4;
    private Button mBtnNum5;
    private Button mBtnNum6;
    private Button mBtnNum7;
    private Button mBtnNum8;
    private Button mBtnNum9;
    private Button mBtnPlus;
    private Button mBtnMinus;
    private Button mBtnMulti;
    private Button mBtnDivide;
    private Button mBtnEquals;
    private Button mBtnDot;

    private TextView mTvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        mBtnNum0 = findViewById(R.id.num_0);
        mBtnNum1 = findViewById(R.id.num_1);
        mBtnNum2 = findViewById(R.id.num_2);
        mBtnNum3 = findViewById(R.id.num_3);
        mBtnNum4 = findViewById(R.id.num_4);
        mBtnNum5 = findViewById(R.id.num_5);
        mBtnNum6 = findViewById(R.id.num_6);
        mBtnNum7 = findViewById(R.id.num_7);
        mBtnNum8 = findViewById(R.id.num_8);
        mBtnNum9 = findViewById(R.id.num_9);
        mBtnPlus = findViewById(R.id.plus);
        mBtnMinus = findViewById(R.id.minus);
        mBtnMulti = findViewById(R.id.multi);
        mBtnDivide = findViewById(R.id.divide);
        mBtnEquals = findViewById(R.id.equals);
        mBtnDot = findViewById(R.id.dot);

        mTvShow = findViewById(R.id.show_result);

        setOnClick();

    }

    private void setOnClick() {
        mBtnNum0.setOnClickListener(this);
        mBtnNum1.setOnClickListener(this);
        mBtnNum2.setOnClickListener(this);
        mBtnNum3.setOnClickListener(this);
        mBtnNum4.setOnClickListener(this);
        mBtnNum5.setOnClickListener(this);
        mBtnNum6.setOnClickListener(this);
        mBtnNum7.setOnClickListener(this);
        mBtnNum8.setOnClickListener(this);
        mBtnNum9.setOnClickListener(this);
        mBtnPlus.setOnClickListener(this);
        mBtnMinus.setOnClickListener(this);
        mBtnMulti.setOnClickListener(this);
        mBtnDivide.setOnClickListener(this);
        mBtnEquals.setOnClickListener(this);
        mBtnDot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        mTvShow.setText(mTvShow.getText() + String.valueOf(((TextView)v).getText()));
    }
}
