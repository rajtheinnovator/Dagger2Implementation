package com.enpassio.dagger2implementation;

import dagger.Component;

/**
 * Created by ABHISHEK RAJ on 9/8/2017.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}