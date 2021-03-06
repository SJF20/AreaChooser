package com.shijingfeng.area_chooser.util;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;

/**
 * Window 工具类
 */
public class WindowUtil {

    /**
     * 设置窗口外部背景透明度
     * @param context Activity
     * @param bgAlpha 透明度 (从0.0 到 1.0, 逐渐变得不透明)
     */
    public static void setWindowOutsideBackground(@NonNull Activity context, float bgAlpha) {
        Window window = context.getWindow();

        window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);

        WindowManager.LayoutParams params = window.getAttributes();
        params.alpha = bgAlpha;

        window.setAttributes(params);
    }

}
