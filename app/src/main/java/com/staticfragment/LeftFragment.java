package com.staticfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/3/10.
 */

public class LeftFragment extends Fragment {
    private ListView listView;
    private ArrayList<String> dataList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.left_fragment,null);
        listView = (ListView) view.findViewById(R.id.listView);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        // 设置数据适配器
        listView.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, dataList));
    }

    private void initData() {
        dataList = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            dataList.add("LeftFragment数据" + i);
        }
    }
}
