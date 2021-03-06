package com.github.brunodles.picpicker;

import android.app.Activity;
import android.content.Intent;

import com.github.brunodles.picpicker.listener.ActivityStarter;

/**
 * Created by bruno on 31/01/16.
 */
class Activity_ActivityStarter implements ActivityStarter {

    private Activity activity;

    public Activity_ActivityStarter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        activity.startActivityForResult(intent, requestCode);
    }
}
