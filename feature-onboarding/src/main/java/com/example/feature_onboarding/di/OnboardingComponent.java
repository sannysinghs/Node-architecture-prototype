package com.example.feature_onboarding.di;

import com.example.feature_onboarding.OnboardingActivity;
import com.example.feature_onboarding.OnboardingView;
import com.example.feature_onboarding.login.LoginInteractor;

import dagger.Component;

/**
 * Created by lev.novikov
 * Date: 22/11/17.
 */

@OnboardingScope
@Component(modules = { ActivityModule.class, OnboardingModule.class })
public interface OnboardingComponent {

    OnboardingView provideView();
    OnboardingComponent provideComponent();
    LoginInteractor.LogInListener provideLogInListener();
    LoginInteractor.StartSignUpListener provideStartSignUpListener();

    void inject(OnboardingActivity onboardingActivity);
}
