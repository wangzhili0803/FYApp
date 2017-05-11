package com.jerry.zhoupro.fragment;


import com.jerry.zhoupro.R;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class TitleBaseFragment extends BaseFragment {

    @BindView(R.id.back)
    TextView titleBack;
    @BindView(R.id.iv_close)
    ImageView titleClose;
    @BindView(R.id.tv_title)
    TextView titleText;
    @BindView(R.id.iv_more)
    ImageView titleMore;
    @BindView(R.id.tv_right)
    TextView titleRight;

    @Override
    public void initView(final View view) {
        super.initView(view);
        titleText.setText(getTitleText());
    }

    protected void setGone(View view) {
        view.setVisibility(View.GONE);
    }

    protected void setVisible(View view) {
        view.setVisibility(View.VISIBLE);
    }

    protected void setInvisible(View view) {
        view.setVisibility(View.INVISIBLE);
    }

    protected abstract String getTitleText();

}
