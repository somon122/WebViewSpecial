package com.world_tech_point.rialtobd_app;

import android.app.Application;
import com.onesignal.OneSignal;

public class RialtoBD_App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();

    }
}
