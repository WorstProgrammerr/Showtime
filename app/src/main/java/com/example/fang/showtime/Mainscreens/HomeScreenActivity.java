package com.example.fang.showtime.Mainscreens;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fang.showtime.Fragments.FragmentNowshowing;
import com.example.fang.showtime.Fragments.FragmentTopmovies;
import com.example.fang.showtime.Fragments.FragmentUpcoming;
import com.example.fang.showtime.R;
import com.example.fang.showtime.ViewPagerAdapter;

public class HomeScreenActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        tablayout = (TabLayout) findViewById(R.id.tablelayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //add fragments
        adapter.AddFragment(new FragmentNowshowing(),"Nowshowing");
        adapter.AddFragment(new FragmentTopmovies(),"Topmovies");
        adapter.AddFragment(new FragmentUpcoming(),"Upcoming");
        //adapter setup
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
    }
}
