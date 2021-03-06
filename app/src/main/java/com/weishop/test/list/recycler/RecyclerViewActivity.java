
package com.weishop.test.list.recycler;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.weishop.test.R;
import com.weishop.test.custom.view.DividerItemDecoration;
import com.weishop.test.data.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity implements View.OnClickListener {
    private List<String> mData = new ArrayList<String>();

    private RecyclerView mRecyclerView;

    private MyAdapter mAdapter;

    private LinearLayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("RecyclerViewActivity onCreate");

        setContentView(R.layout.activity_recyclerview);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL_LIST));

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);// listview功能

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
//        gridLayoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
//        mRecyclerView.setLayoutManager(mLayoutManager);//gridview 功能


//        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(4,
//                StaggeredGridLayoutManager.HORIZONTAL));

        initData();

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setData(mData);
        mAdapter.notifyDataSetChanged();
        System.out.println("RecyclerViewActivity oncreate after");

        findViewById(R.id.delete).setOnClickListener(this);
        findViewById(R.id.display).setOnClickListener(this);

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        System.out.println("attachBaseContext");
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("RecyclerViewActivity onresume");
    }

    private void initData() {
        for (int i = 0; i < 100; i++) {
            mData.add("item" + i);
        }

    }

    @Override
    public void onClick(View v) {
        if (R.id.display == v.getId()) {
            initData();
            mData.add("3q32434");
            mData.add("3q32434");
            mAdapter.notifyDataSetChanged();
//            mRecyclerView.setVisibility(View.VISIBLE);
        } else {
            mData.clear();
//            mRecyclerView.setVisibility(View.GONE);
        }

    }
}
