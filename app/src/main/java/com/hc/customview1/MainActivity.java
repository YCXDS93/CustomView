package com.hc.customview1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private CustomTitleBar customTitleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customTitleBar = (CustomTitleBar) findViewById(R.id.custom);
        customTitleBar.getTitleBarLeftBtn().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"左边按钮",Toast.LENGTH_LONG).show();
            }
        });
        customTitleBar.getTitleBarTitle().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"标题",Toast.LENGTH_LONG).show();
            }
        });
        customTitleBar.getTitleBarRightBtn().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"右边项目",Toast.LENGTH_LONG).show();
            }
        });
    }
}
