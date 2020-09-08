package com.example.activityandfragmentapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements FragmentCallBack{
	
	/// Fragment 消息回调的方法
	@Override
	public void test(int flag) {
	
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView testSendTextView = findViewById(R.id.bt_test_send);
		testSendTextView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				sendTestFunction();
			}
		});
	}
	
	//代码清单 1-1
	//传递数据
	private void sendTestFunction() {
		//创建 Fragment 实例
		TestAFragment fragment = new TestAFragment();
		
		//构建 Bundle
		Bundle bundle = new Bundle();
		//设置数据
		bundle.putString("title", "传递到的数据");
		//绑定 Fragment
		fragment.setArguments(bundle);
		
		
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		fragmentTransaction.replace(R.id.framelayout, fragment);
		fragmentTransaction.commit();
		
	}
	
	//代码清单 1-3
	//传递数据
	private void sendTestBFunction() {
		//创建 Fragment 实例
		// 通过静态方法来创建并绑定数据
		TestBFragment fragment = TestBFragment.newInstance("测试数据");
		
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		fragmentTransaction.replace(R.id.framelayout, fragment);
		fragmentTransaction.commit();
		
	}

}