package com.example.difusioncultural;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.difusioncultural.Tabs.TabOne;
import com.example.difusioncultural.Tabs.TabThree;
import com.example.difusioncultural.Tabs.TabTwo;

public class PageAdapter extends FragmentStatePagerAdapter {

    int countTab;

    public PageAdapter(FragmentManager fm, int countTab) {
        super(fm);
        this.countTab = countTab;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                TabOne tabOne = new TabOne();
                return tabOne;
            case 1:
                TabTwo tabTwo = new TabTwo();
                return tabTwo;
            case 2:
                TabThree tabThree = new TabThree();
                return tabThree;

                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return countTab;
    }
}
