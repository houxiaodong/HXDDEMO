package com.sccin.bjexpert.hxddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.sccin.bjexpert.hxddemo.Adapter.SimpleAdapter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewById(R.id.id_recyclerView)
    RecyclerView mRecyclerView;
    private List<String> mDatas;
    private SimpleAdapter mAdapter;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        initDatas();
//        initViews();
        mAdapter = new SimpleAdapter(this, mDatas);


    }


    private void initDatas() {
        mDatas = new ArrayList<String>();

        for (int i = 'A'; i <= 'z'; i++) {
            mDatas.add("" + (char) i);
        }

    }

    @AfterViews
    public void SetView() {
        mRecyclerView.setAdapter(mAdapter);
//设置RecyclerView的布局管理
        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(lm);
// 设置Recylerview的Item的分割线

    }


//    private void initViews() {
//        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerView);
//
//    }


}
