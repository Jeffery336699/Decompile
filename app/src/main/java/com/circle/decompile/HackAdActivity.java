package com.circle.decompile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

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