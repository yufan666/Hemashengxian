package com.example.administrator.hemashengxian.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.administrator.hemashengxian.R;
import com.vondear.rxtool.RxBarTool;
import com.vondear.rxui.activity.AndroidBug5497Workaround;
import com.vondear.rxui.view.RxTitle;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * @author vondear
 */
public class ActivityFoundAct extends ActivityBase {

    @BindView(R.id.rx_title)
    RxTitle mRxTitle;
//    @BindView(R.id.logo)
//    ImageView mLogo;
//    @BindView(R.id.et_mobile)
//    EditText mEtMobile;
//    @BindView(R.id.iv_clean_phone)
//    ImageView mIvCleanPhone;
//    @BindView(R.id.et_password)
//    EditText mEtPassword;
//    @BindView(R.id.clean_password)
//    ImageView mCleanPassword;
//    @BindView(R.id.iv_show_pwd)
//    ImageView mIvShowPwd;
//    @BindView(R.id.btn_login)
//    Button mBtnLogin;
//    @BindView(R.id.regist)
//    TextView mRegist;
//    @BindView(R.id.forget_password)
//    TextView mForgetPassword;
//    @BindView(R.id.content)
//    LinearLayout mContent;
//    @BindView(R.id.scrollView)
//    NestedScrollView mScrollView;
//    @BindView(R.id.service)
//    LinearLayout mService;
//    @BindView(R.id.root)
//    RelativeLayout mRoot;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found_act);
        RxBarTool.setTransparentStatusBar(this);//状态栏透明化
        RxBarTool.StatusBarLightMode(mContext);
        ButterKnife.bind(this);

        if (isFullScreen(this)) {
            AndroidBug5497Workaround.assistActivity(this);
        }
        initView();
        initEvent();
    }

    private void initView() {
        mRxTitle.setLeftFinish(mContext);
//        screenHeight = this.getResources().getDisplayMetrics().heightPixels; //获取屏幕高度
//        keyHeight = screenHeight / 3;//弹起高度为屏幕高度的1/3
    }

    private void initEvent() {

    }

    public boolean isFullScreen(Activity activity) {
        return (activity.getWindow().getAttributes().flags &
                WindowManager.LayoutParams.FLAG_FULLSCREEN) == WindowManager.LayoutParams.FLAG_FULLSCREEN;
    }

//    @OnClick({R.id.iv_clean_phone, R.id.clean_password, R.id.iv_show_pwd})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.iv_clean_phone:
//                mEtMobile.setText("");
//                break;
//            case R.id.clean_password:
//                mEtPassword.setText("");
//                break;
//            case R.id.iv_show_pwd:
//                if (mEtPassword.getInputType() != InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
//                    mEtPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
//                    mIvShowPwd.setImageResource(R.drawable.pass_visuable);
//                } else {
//                    mEtPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
//                    mIvShowPwd.setImageResource(R.drawable.pass_gone);
//                }
//                String pwd = mEtPassword.getText().toString();
//                if (!TextUtils.isEmpty(pwd))
//                    mEtPassword.setSelection(pwd.length());
//                break;
//        }
//    }
}
