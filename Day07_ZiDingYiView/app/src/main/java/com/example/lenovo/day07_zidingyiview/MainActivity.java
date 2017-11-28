package com.example.lenovo.day07_zidingyiview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private DingYiView dingYiView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    int i =50;
    private void initView() {
        dingYiView= (DingYiView) findViewById(R.id.dingyiView);
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
            if(i>0){
                i-=10;
                dingYiView.setTops(i--);

            }
            }
        };
        Timer timer=new Timer();
        timer.schedule(task,500,500);

    }
}
