package com.hellsam.scrollviewwithviewpager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.problemBtn).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, ProblemActivity.class);
				startActivity(intent);
			}
		});
        
        findViewById(R.id.solution1Btn).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Solution1Activity.class);
				startActivity(intent);
			}
		});
        
        findViewById(R.id.solution2Btn).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Solution2Activity.class);
				startActivity(intent);
			}
		});
        
        findViewById(R.id.solution3Btn).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Solution3Activity.class);
				startActivity(intent);
			}
		});
    }
}
