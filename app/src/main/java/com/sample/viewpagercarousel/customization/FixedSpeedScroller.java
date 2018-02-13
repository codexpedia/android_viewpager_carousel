package com.sample.viewpagercarousel.customization;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/**
 * Created by peng on 2/24/16.
 */

/**
 * Usage:
 try {
 Field mScroller;
 mScroller = ViewPager.class.getDeclaredField("mScroller");
 mScroller.setAccessible(true);
 FixedSpeedScroller scroller = new FixedSpeedScroller(vpCarousel.getContext());
 //             scroller.setFixedDuration(5000);
 mScroller.set(vpCarousel, scroller);
 } catch (NoSuchFieldException e) {
 } catch (IllegalArgumentException e) {
 } catch (IllegalAccessException e) {
 }
 */
public class FixedSpeedScroller extends Scroller {

    private int mDuration = 5000;

    public FixedSpeedScroller(Context context) {
        super(context);
    }

    public FixedSpeedScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public FixedSpeedScroller(Context context, Interpolator interpolator, boolean flywheel) {
        super(context, interpolator, flywheel);
    }


    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        // Ignore received duration, use fixed one instead
        super.startScroll(startX, startY, dx, dy, mDuration);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy) {
        // Ignore received duration, use fixed one instead
        super.startScroll(startX, startY, dx, dy, mDuration);
    }
}
