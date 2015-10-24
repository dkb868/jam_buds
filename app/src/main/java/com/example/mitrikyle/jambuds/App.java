package com.example.mitrikyle.jambuds;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

/**
 * Created by mitrikyle on 10/24/2015.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "bs1oekMx2YpaWZbHpp1nTiUtsPCasuN7FmeFZPQV", "hqSfH2MshfA7iakDRVYY4JdCgGwKuM9AY7mLrMjG");
    }
}
