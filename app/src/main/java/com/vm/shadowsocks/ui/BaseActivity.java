package com.vm.shadowsocks.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;

/**
 * Created by zhangkangbin on 2017/1/14.
 */

public class BaseActivity extends Activity {

    protected static  final String PERMISSION_CAMERA="android.permission.CAMERA";
    @TargetApi(Build.VERSION_CODES.M)
    /**
     * 检查是否有权限
     */
    protected boolean hasPermission(String permission) {
        if (canMakeSmores()) {
            return (checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED);
        }
        return true;
    }

    /**
     * 是否是22.0 以上的系统
     *
     * @return
     */
    private boolean canMakeSmores() {
        return (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1);
    }

}
