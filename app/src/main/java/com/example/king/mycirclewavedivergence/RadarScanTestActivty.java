package com.example.king.mycirclewavedivergence;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * 类功能描述：</br>
 * 仿雷达扫描测试类
 * 博客地址：http://blog.csdn.net/androidstarjack
 * 公众号：终端研发部
 * @author yuyahao
 * @version 1.0 </p> 修改时间：</br> 修改备注：</br>
 */

public class RadarScanTestActivty extends Activity implements OnClickListener{
    private CircleWaveDivergenceView search_device_view;
    private Button btn_continue,btn_pause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_radarscantest);
        search_device_view = (CircleWaveDivergenceView) findViewById(R.id.search_device_view);
        btn_continue = (Button)  findViewById(R.id.btn_continue);
        btn_pause = (Button)  findViewById(R.id.btn_pause);
        search_device_view.setWillNotDraw(false);

        btn_pause.setOnClickListener(this);
        btn_continue.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_continue:
                search_device_view.setSearching(true);
                break;
            case R.id.btn_pause:
                search_device_view.setSearching(false);
                break;
        }
    }
}
