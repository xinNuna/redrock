package com.xinnuna.num6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import static androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private List<Fragment> fragmentsList = new ArrayList<>();
    private List<String> fragmentTitle=new ArrayList<>();
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        fragmentsList.add(new Fragment01());
        fragmentsList.add(new Fragment02());
        fragmentsList.add(new Fragment03());
        fragmentTitle.add("推荐");
        fragmentTitle.add("热门");
        fragmentTitle.add("追番");
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), viewPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, fragmentsList,fragmentTitle);
        viewPager.setAdapter(viewPagerAdapter);

    }
}