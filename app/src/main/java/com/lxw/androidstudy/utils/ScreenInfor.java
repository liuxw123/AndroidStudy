package com.lxw.androidstudy.utils;

import android.content.Context;

public class ScreenInfor {

    public static int dp2px(Context context, float dpValue) {

        // 获取手机像素密度
        final float scale = context.getResources().getDisplayMetrics().density;

        return (int)(dpValue*scale+0.5f);
    }

    public static int px2dp(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;

        return (int)(pxValue/scale+0.5f);
    }
}
