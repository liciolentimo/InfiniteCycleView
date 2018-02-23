package com.lentimosystems.infinitecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

public class MainActivity extends AppCompatActivity {

    List<Integer> lstImages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initData();

        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstImages,getBaseContext());
        pager.setAdapter(adapter);
    }


    private void initData() {
        lstImages.add(R.drawable.restaurant);
        lstImages.add(R.drawable.shop1);
        lstImages.add(R.drawable.shop2);
    }
}
