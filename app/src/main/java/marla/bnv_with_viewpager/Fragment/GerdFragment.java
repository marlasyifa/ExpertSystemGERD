package marla.bnv_with_viewpager.Fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import marla.bnv_with_viewpager.LembarAdapter;
import marla.bnv_with_viewpager.R;


public class GerdFragment extends Fragment {

    FragmentPagerAdapter adapterViewPager;



    public GerdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gerd, container, false);
        ViewPager vpPager = (ViewPager) view.findViewById(R.id.pager);
        PagerTabStrip pagerTabStrip = (PagerTabStrip) view.findViewById(R.id.pager_tab_strip);
        pagerTabStrip.setDrawFullUnderline(false);
        pagerTabStrip.setTabIndicatorColor(Color.DKGRAY);
        vpPager.setAdapter(buildAdapter());

        return view;
    }

    private PagerAdapter buildAdapter() {
        return(new LembarAdapter(getActivity(), getChildFragmentManager()));
    }
}
