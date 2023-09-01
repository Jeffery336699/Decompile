package com.circle.decompile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 郭霖博客反编译:
 * https://guolin.blog.csdn.net/article/details/49738023?spm=1001.2014.3001.5502
 */
public class GuolinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guolin);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GuolinActivity.this, "you clicked button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}