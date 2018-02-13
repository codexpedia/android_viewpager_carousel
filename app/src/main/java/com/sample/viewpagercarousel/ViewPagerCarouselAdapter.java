package com.sample.viewpagercarousel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created on 2/24/16.
 * This adapter gets the individual fragment into the carousel view
 */
public class ViewPagerCarouselAdapter extends FragmentStatePagerAdapter {
    private int[] imageResourceIds;

    public ViewPagerCarouselAdapter(FragmentManager fm, int[] imageResourceIds) {
        super(fm);
        this.imageResourceIds = imageResourceIds;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt(ViewPagerCarouselFragment.IMAGE_RESOURCE_ID, imageResourceIds[position]);
        ViewPagerCarouselFragment frag = new ViewPagerCarouselFragment();
        frag.setArguments(bundle);

        return frag;
    }

    @Override
    public int getCount() {
        return (imageResourceIds == null) ? 0: imageResourceIds.length;
    }

}