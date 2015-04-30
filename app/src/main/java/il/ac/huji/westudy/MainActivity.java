package il.ac.huji.westudy;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;

public class MainActivity extends FragmentActivity {

    private final Handler handler = new Handler();

    private PagerSlidingTabStrip tabs;
    private ViewPager pager;
    private MyPagerAdapter adapter;

    private Drawable oldBackground = null;
    private int currentColor = 0xFF666666;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        //tabs.sett
        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new MyPagerAdapter(getSupportFragmentManager());

        pager.setAdapter(adapter);



        tabs.setViewPager(pager);


    }




    public void onColorClicked(View v) {

        int color = Color.parseColor(v.getTag().toString());


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("currentColor", currentColor);
    }


    private Drawable.Callback drawableCallback = new Drawable.Callback() {
        @Override
        public void invalidateDrawable(Drawable who) {
            getActionBar().setBackgroundDrawable(who);
        }

        @Override
        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            handler.postAtTime(what, when);
        }

        @Override
        public void unscheduleDrawable(Drawable who, Runnable what) {
            handler.removeCallbacks(what);
        }
    };

    public class MyPagerAdapter extends FragmentPagerAdapter {

        private static final int COURSES_ACTIVITY_PAGE = 0;
        CoursesFragment courseFragment;
        GroupsFragment groupsFragment;
        private final String[] TITLES = { "Categories", "Home"};

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
            courseFragment = new CoursesFragment();
            groupsFragment = new GroupsFragment();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }

        @Override
        public int getCount() {
            return TITLES.length;
        }

        @Override
        public Fragment getItem(int position) {
            if(position == COURSES_ACTIVITY_PAGE){
                return courseFragment;
            }
            return groupsFragment;
        }




    }

}