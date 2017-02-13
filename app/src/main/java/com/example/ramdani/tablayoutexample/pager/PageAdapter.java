package com.example.ramdani.tablayoutexample.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ramdani.tablayoutexample.fragment.TabDua;
import com.example.ramdani.tablayoutexample.fragment.TabSatu;

/**
 * Created by ramdani on 13/02/17.
 */

public class PageAdapter extends FragmentStatePagerAdapter {

    // tab titles
    private String[] tabTitles = new String[]{"Tab Satu", "Tab Dua"};

    //jumlah tab
    //int tabCount;

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    /*public PageAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
        //mFragmentTitle.add(title);
    }*/

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TabSatu();

            case 1:
                return new TabDua();
        }
        return null;
    }


    public CharSequence getPageTitle(int position) {
         return tabTitles[position];
    }

    /*
    //with icon
    @Override
    public CharSequence getPageTitle(int position) {
        Drawable image = ContextCompat.getDrawable(MainActivity.this, images[position]);
        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
        SpannableString sb = new SpannableString(" " + titles[position]);
        ImageSpan imageSpan = new ImageSpan(image);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;
    }
     */

    @Override
    public int getCount() {
        return tabTitles.length;
    }
}
