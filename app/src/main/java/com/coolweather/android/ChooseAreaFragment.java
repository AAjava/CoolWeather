package com.coolweather.android;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.coolweather.android.db.City;
import com.coolweather.android.db.County;
import com.coolweather.android.db.Province;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/21.
 */
public class ChooseAreaFragment extends Fragment {
    public static final int LEVEL_PROVINCE=0;
    public static final int LEVEL_CITY=1;
    public static final int LEVEL_COUNTY=2;
    private ProgressDialog progressdialog;
    private TextView titleText;
    private Button backButton;
    private ListView listView;
    private List<String> dataList=new ArrayList<>();
    private ArrayAdapter<String> adapter;
    /***
     * 省列表
     */
    private List<Province> provinceList;
    /***
     * 市列表
     */
    private List<City> cityList;
    /***
     * 县列表
     */
    private List<County> countyList;
    /***
     * 选中的省份
     */
    private Province selectedProvice;
    /***
     * 选中的城市
     */
    private City selectedCity;
    /**
     * 当前选中的级别
     */
    private int currentLevel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.choose_area,container,false);
        titleText= (TextView) view.findViewById(R.id.title_text);
        backButton= (Button) view.findViewById(R.id.back_btn);
        listView= (ListView) view.findViewById(R.id.list_view);
        adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,dataList);
        listView.setAdapter(adapter);
        return view;
    }
}
