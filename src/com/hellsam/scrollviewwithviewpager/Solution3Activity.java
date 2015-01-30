package com.hellsam.scrollviewwithviewpager;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class Solution3Activity extends FragmentActivity {
	private ViewPager viewPager;

	private ViewPagerFragmentAdapter adapter;
	private MyListener listener = new MyListener();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_solution3);

		viewPager = (ViewPager) findViewById(R.id.viewPager);
		adapter = new ViewPagerFragmentAdapter(getSupportFragmentManager());
		adapter.addFragment(new Content1Fragment());
		adapter.addFragment(new Content2Fragment());
		adapter.addFragment(new Content3Fragment());
		viewPager.setOffscreenPageLimit(3);
		viewPager.setOnPageChangeListener(listener);
		viewPager.setAdapter(adapter);

		// 模拟网络请求完成之后重置ViewPager高度
		new myAsyncTask().execute();
	}

	/**
	 * 重新设置viewPager高度
	 * 
	 * @param position
	 */
	public void resetViewPagerHeight(int position) {
		View child = viewPager.getChildAt(position);
		if (child != null) {
			child.measure(0, 0);
			int h = child.getMeasuredHeight();
			LinearLayout.LayoutParams params = (LayoutParams) viewPager
					.getLayoutParams();
			params.height = h + 50;
			viewPager.setLayoutParams(params);
		}
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
			// 页面切换后重置ViewPager高度
			resetViewPagerHeight(position);
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

	public class myAsyncTask extends AsyncTask<Void, Void, Void> {
		@Override
		protected Void doInBackground(Void... params) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			resetViewPagerHeight(0);
		}

	}
}
