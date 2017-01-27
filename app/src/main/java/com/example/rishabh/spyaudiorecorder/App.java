package com.example.rishabh.spyaudiorecorder;

import android.app.Application;
import android.content.Intent;

/**
 * Created by Rishabh on 27-01-2017.
 */
public class App extends Application {


        @Override
        public void onCreate() {
            super.onCreate();

            startService(new Intent(this, YourService.class));
        }
    }

