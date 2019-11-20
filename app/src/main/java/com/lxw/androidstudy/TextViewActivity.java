package com.lxw.androidstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.lxw.androidstudy.utils.ScreenInfor;

public class TextViewActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        tv = findViewById(R.id.tv);

        tv.setText("屏幕分辨率:"+ ScreenInfor.getScreenWidth(this)+"*"+ScreenInfor.getScreenHeight(this)+" 像素密度:"+ScreenInfor.getScreenDensity(this));
    }
}
