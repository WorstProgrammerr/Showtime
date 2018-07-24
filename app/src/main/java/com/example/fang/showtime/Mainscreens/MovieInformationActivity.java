package com.example.fang.showtime.Mainscreens;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fang.showtime.Fragments.FragmentInformation;
import com.example.fang.showtime.Fragments.FragmentReviews;
import com.example.fang.showtime.R;
import com.example.fang.showtime.ViewPagerAdapter;

public class MovieInformationActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_information);
        tablayout = (TabLayout) findViewById(R.id.tablelayout_id2);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid2);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id2);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //add fragments
        adapter.AddFragment(new FragmentInformation(),"Info");
        adapter.AddFragment(new FragmentReviews(),"Reviews");
        //adapter setup
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
    }
}