package com.rizaldev.debtcollector.screens.splash.core;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.rizaldev.debtcollector.R;
import com.rizaldev.debtcollector.screens.splash.SplashActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by devel on 23/10/2017.
 */

public class SplashView {

    private View view;

    @BindView(R.id.image_splash_logo)
    ImageView imageViewLogo;
    @BindView(R.id.text_tittle)
    TextView textViewTittle;
    @BindView(R.id.text_motto)
    TextView textViewMotto;

    public SplashView(SplashActivity context) {
        context.requestWindowFeature(Window.FEATURE_NO_TITLE);
        context.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        FrameLayout parent = new FrameLayout(context);
        parent.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        view = LayoutInflater.from(context).inflate(R.layout.activity_splash, parent, true);
        ButterKnife.bind(this, view);
    }

    public View constructView() {
        return view;
    }

    public void showAnimation(int length) {
        Animation fadeInLogoTittle = new AlphaAnimation(0, 1);
        fadeInLogoTittle.setInterpolator(new DecelerateInterpolator());
        fadeInLogoTittle.setDuration(length);

        Animation fadeInTextMotto = new AlphaAnimation(0, 1);
        fadeInTextMotto.setInterpolator(new DecelerateInterpolator());
        fadeInTextMotto.setStartOffset(500);
        fadeInTextMotto.setDuration(length);

        AnimationSet animationLogoTittle = new AnimationSet(false);
        animationLogoTittle.addAnimation(fadeInLogoTittle);
        imageViewLogo.setAnimation(animationLogoTittle);
        textViewTittle.setAnimation(animationLogoTittle);

        AnimationSet animationTextMotto = new AnimationSet(false);
        animationTextMotto.addAnimation(fadeInTextMotto);
        textViewMotto.setAnimation(animationTextMotto);
    }
}
