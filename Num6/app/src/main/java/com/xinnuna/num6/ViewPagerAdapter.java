package com.xinnuna.num6;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentsList;
    private List<String> fragmentsTitle;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior, List<Fragment> fragmentsList,List<String> fragmentsTitle) {
        super(fm, behavior);
        this.fragmentsList = fragmentsList;
        this.fragmentsTitle=fragmentsTitle;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }


    public CharSequence getPageTitle(int position) {
        return fragmentsTitle.get(position);

    }
}