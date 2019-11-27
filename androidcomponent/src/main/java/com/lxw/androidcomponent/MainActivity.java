package com.lxw.androidcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, CompoundButton.OnCheckedChangeListener {

    private Button buttonLeft;
    private Button buttonRight;
    private Switch aSwitch;
    private TextView tvLR;
    private TextView tvOC;
    private RadioGroup radioGroup;
    private ImageView imageView;
    private SeekBar seekBar;

    private int seekBarStartNum;
    private int seekBarEndNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLeft = findViewById(R.id.button);
        buttonRight = findViewById(R.id.button2);
        aSwitch = findViewById(R.id.switch1);

        tvLR = findViewById(R.id.textView);
        tvOC = findViewById(R.id.textView2);

        radioGroup = findViewById(R.id.radio_group);
        imageView = findViewById(R.id.imageView);

        seekBar = findViewById(R.id.seekBar);

        setListener();
    }

    private void setListener() {
        buttonLeft.setOnClickListener(this);
        buttonRight.setOnClickListener(this);
        aSwitch.setOnCheckedChangeListener(this);
        radioGroup.setOnCheckedChangeListener(this);
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:tvLR.setText("左");break;
            case R.id.button2:tvLR.setText("右");break;
            // case R.id.switch1:
            //     String info = aSwitch.isChecked()?"开":"关";
            //     tvOC.setText(info);
            //     break;
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        Bitmap image = null;

        switch (checkedId) {
            case R.id.radioButton:
                // Toast.makeText(this, "华中科技大学", Toast.LENGTH_SHORT).show();
                image = BitmapFactory.decodeResource(getResources(), R.drawable.neu);

                break;
            case R.id.radioButton2:
                // Toast.makeText(this, "东北大学", Toast.LENGTH_SHORT).show();
                image = BitmapFactory.decodeResource(getResources(), R.drawable.hust);
                break;
        }

        imageView.setImageBitmap(image);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        // Toast.makeText(this, ""+progress, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        seekBarStartNum = seekBar.getProgress();

        // Toast.makeText(this, ""+seekBarStartNum, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        seekBarEndNum = seekBar.getProgress();

        Toast.makeText(this, ""+seekBarEndNum, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) tvOC.setText("开");
        else tvOC.setText("关");
    }
}
