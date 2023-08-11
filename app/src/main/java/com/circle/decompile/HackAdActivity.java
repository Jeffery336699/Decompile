package com.circle.decompile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/**
 * 参考博客:
 * https://blog.csdn.net/lmj623565791/article/details/53370414?spm=1001.2014.3001.5502  (鸿洋)
 * 项目中的几个txt文档,归纳总结几个脚本命令 readme脚本.txt、打包密码.txt
 */
public class HackAdActivity extends AppCompatActivity {

    private Handler mHandler = new Handler(Looper.getMainLooper());

    private Runnable mCallback = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.circle.decompile",
                    "com.circle.decompile.MainActivity"));
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hack_ad);
        setTitle("HackAdActivity");
        mHandler.postDelayed(mCallback, 3000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHandler.removeCallbacks(mCallback);
    }
}