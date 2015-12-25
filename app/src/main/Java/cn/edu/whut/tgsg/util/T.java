package cn.edu.whut.tgsg.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast工具类
 * <p/>
 * Created by xwh on 2015/11/30.
 */
public class T {

    private static Toast toast;

    /**
     * 显示Toast(短时间)
     *
     * @param context
     * @param message
     */
    public static void show(Context context, CharSequence message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * Toast工具类优化
     *
     * @param context
     * @param text
     * @param duration
     */
    public static void showToast(Context context, CharSequence text, int duration) {
        if (toast == null) {
            toast = Toast.makeText(context, text, duration);
        } else {
            toast.setText(text);
            toast.setDuration(duration);
        }
        toast.show();
    }

    /**
     * Toast工具类优化
     *
     * @param context
     * @param text
     */
    public static void showToast(Context context, CharSequence text) {
        if (toast == null) {
            toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
            toast.setDuration(Toast.LENGTH_SHORT);
        }
        toast.show();
    }


}
