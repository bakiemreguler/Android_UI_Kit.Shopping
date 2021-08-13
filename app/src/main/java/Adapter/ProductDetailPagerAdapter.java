package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.FifthFragment;
import fragment.FirstFragment;
import fragment.FourthFragment;
import fragment.SecondFragment;
import fragment.ThirdFragment;


public class ProductDetailPagerAdapter extends FragmentStatePagerAdapter {



    public ProductDetailPagerAdapter(FragmentManager fm) {
        super(fm);

    }



    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FirstFragment tab1 = new FirstFragment();
                return tab1;

            case 1:
                SecondFragment tab6 = new SecondFragment();
                return tab6;


            case 2:
                ThirdFragment tab2 = new ThirdFragment();
                return tab2;

            case 3:
                FourthFragment tab3 = new FourthFragment();
                return tab3;


            case 4:
                FifthFragment tab4 = new FifthFragment();
                return tab4;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}