package com.example.activityandfragmentapplication;

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

//代码清单 1-2
public class TestAFragment extends Fragment {
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		
		/// Fragment 所使用的 View
		View view = inflater.inflate(R.layout.fragment_first, container, false);
		///一个文本 组件
		TextView textView = (TextView) view.findViewById(R.id.tv_firster_content);
		
		//获取Bundle 然后获取数据
		Bundle bundle = this.getArguments();//得到从Activity传来的数据
		String title = null;
		if (bundle != null) {
			title = bundle.getString("title");
		}
		///设置显示数据
		textView.setText(title);
		return view;
	}
	
}
