package mobile.myfirstprojectonintern;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Manoj Budha Ayer on 8/30/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {


    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position) {

            case 0:
                fragment = new Tab1();
            break;
            case 1:
                fragment = new Tab2();
                break;

            case 2:
                fragment = new Tab3();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
