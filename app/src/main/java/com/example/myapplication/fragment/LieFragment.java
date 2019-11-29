package com.example.myapplication.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.base.BaseFragment;

public class LieFragment extends BaseFragment {

    private Button button;

    @Override
    protected void initView(View inflate) {
        button = inflate.findViewById(R.id.butt);
    }

    @Override
    protected int LayoutId() {
        return R.layout.lie_fragment;
    }

    @Override
    protected void initData() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.jump();
            }
        });
    }
}
