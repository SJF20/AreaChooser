package com.wicep.library.util;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Window 工具类
 */
public class WindowUtil {

    /**
     * 设置窗口外部背景透明度
     */
    public static void setWindowOutsideBackground(@NonNull Activity context, float bgAlpha) {
        Window window = context.getWindow();

        window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);

        WindowManager.LayoutParams params = window.getAttributes();
        params.alpha = bgAlpha;

        window.setAttributes(params);
    }

}
