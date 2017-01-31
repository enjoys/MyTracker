package com.akexorcist.googledirection.sample;

import android.content.Context;
import android.os.AsyncTask;

import java.lang.reflect.Constructor;

/**
 * Created by unchalee.ru on 31/1/2560.
 */

public class MySynchronize extends AsyncTask<String, Void, String>{
    //Explicit
    private Context context;
    public MySynchronize(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {
        return null;
    }
} //Main Class
