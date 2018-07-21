package io.mapwize.mapwizesimpleapplication;

import android.app.Application;

import io.mapwize.mapwizeformapbox.AccountManager;

public class MapwizeSimpleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AccountManager.start(this, "076d935377676d924d09788fad57d043");
    }

}
