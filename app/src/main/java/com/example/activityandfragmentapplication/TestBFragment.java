package com.example.activityandfragmentapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/*
 * 创建人： Created by  on 2020/9/8.
 * 创建时间：Created by  on 2020/9/8.
 * 页面说明：
 * 可关注公众号：我的大前端生涯   获取最新技术分享
 * 可关注网易云课堂：https://study.163.com/instructor/1021406098.htm
 * 可关注博客：https://blog.csdn.net/zl18603543572
 */

//代码清单 1-3
public class TestBFragment extends Fragment {
	
	
	//监听回调
	FragmentCallBack mFragmentCallBack;
	
	
	///onAttach 当 Fragment 与 Activity 绑定时调用
	@Override
	public void onAttach(Context context) {
		super.onAttach(context);
		///获取绑定的监听
		if (context instanceof FragmentCallBack) {
			mFragmentCallBack = (FragmentCallBack) context;
		}
	}
	///onDetach 当 Fragment 与 Activity 解除绑定时调用
	@Override
	public void onDetach() {
		super.onDetach();
		mFragmentCallBack = null;
	}
	
	
	
	/**
	 * @param title 参数
	 * @return  Fragment 实例
	 */
	public static TestBFragment newInstance(String title) {
		//创建 Fragment 实例
		TestBFragment fragment = new TestBFragment();
		//创建 Bundle
		Bundle lBundle = new Bundle();
		lBundle.putString("title", title);
		fragment.setArguments(lBundle);
		return fragment;
	}
	
	
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_first,container,false);
		TextView textView = (TextView)view.findViewById(R.id.tv_firster_content);
		
		//获取Bundle 然后获取数据
		Bundle bundle =this.getArguments();//得到从Activity传来的数据
		String title = null;
		if(bundle!=null){
			title = bundle.getString("title");
		}
		textView.setText(title);
		return view;
	}
	
	
	
	void test(){
		//key-"sff",通过key得到value-"value值"(String型)
		//得到bundle对象
		Bundle bundle = new Bundle();
		//String 类型
		bundle.putString("testString", "value值");
		// Int类型
		bundle.putInt("testInt", 175);
	}
	
	
	void  test2 (){
		
		///消息回调到 Activity
		if (mFragmentCallBack != null) {
			mFragmentCallBack.test(111);
		}
	}
	
	

	
}
