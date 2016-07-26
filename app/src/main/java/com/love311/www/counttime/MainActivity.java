package com.love311.www.counttime;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mCountTime;
    private CountDownTimerUtils mCountDownTimerUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCountTime = (Button) findViewById(R.id.cout_time);
        mCountDownTimerUtils = new CountDownTimerUtils(mCountTime, 60000, 1000);
        mCountTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCountDownTimerUtils.start();
                //底部弹出Snackbar测试
//                Snackbar.make(view,"删除数据",Snackbar.LENGTH_LONG).setAction("确定",new View.OnClickListener()
//                {
//
//                    @Override
//                    public void onClick(View view) {
//                        Utils.showToast(MainActivity.this,"删除成功！");
//                    }
//                }).show();
            }
        });
    }
}
