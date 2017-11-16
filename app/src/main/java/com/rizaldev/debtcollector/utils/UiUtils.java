package com.rizaldev.debtcollector.utils;

import android.view.View;

import timber.log.Timber;
import android.support.design.widget.Snackbar;
/**
 * Created by devel on 22/10/2017.
 */

public class UiUtils {
    public static void handleThrowable(Throwable throwable) {
        Timber.e(throwable, throwable.toString());
    }

    public static void showSnackbar(View view, String message, int length) {
        Snackbar.make(view, message, length).setAction("Action", null).show();
    }

}
