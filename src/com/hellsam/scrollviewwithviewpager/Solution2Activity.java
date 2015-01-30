package com.hellsam.scrollviewwithviewpager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;

public class Solution2Activity extends FragmentActivity {
	private ViewPager viewPager;
	
	private ViewPagerFragmentAdapter adapter;
	private MyListener listener;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_solution2);
		
		viewPager = (ViewPager) findViewById(R.id.viewPager);
		adapter = new ViewPagerFragmentAdapter(getSupportFragmentManager());
		adapter.addFragment(new Content1Fragment());
		adapter.addFragment(new Content2Fragment());
		adapter.addFragment(new Content3Fragment());
		viewPager.setOnPageChangeListener(listener);
		viewPager.setAdapter(adapter);
		
	}
	
	public class MyListener implements OnPageChangeListener {

		@Override
		public void onPageScrollStateChanged(int arg0) {

		}

		@Override
		public void onPageScrolled(int position, float positionOffset,
				int positionOffsetPixels) {
			
		}

		@Override
		public void onPageSelected(int position) {
			switch (position) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			}
		}
	}
}
