package net.hermlon.froodygo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import net.hermlon.froodygo.fragments.FilterFragment;

/**
 * Created by hermlon on 28.09.17.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
            case 0: return new FilterFragment();
            case 1: return new FilterFragment();
            case 2: return new FilterFragment();
            default: return new FilterFragment();
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

    public int getIcon(int position) {
        switch (position) {
            case 0: return R.drawable.ic_map_white_24dp;
            case 1: return R.drawable.ic_list_white_24dp;
            case 2: return R.drawable.ic_filter_list_white_24dp;
            default: return R.mipmap.ic_launcher;
        }
    }
}