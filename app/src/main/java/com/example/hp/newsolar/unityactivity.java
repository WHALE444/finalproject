package com.example.hp.newsolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

public class unityactivity extends UnityPlayerActivity {

    private LinearLayout mLlUnityContainer;
    private Button mBtnRotate;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_unityactivity);
        initView();
    }

    private void initView() {
        mLlUnityContainer = (LinearLayout) findViewById(R.id.ll_unity_container);

        //将Unity的View添加到布局里
        View scene = mUnityPlayer.getView();
        mLlUnityContainer.addView(scene);

        }
}