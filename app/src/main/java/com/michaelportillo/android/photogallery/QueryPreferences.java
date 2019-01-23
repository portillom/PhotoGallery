package com.michaelportillo.android.photogallery;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by USER on 1/20/19.
 */

/**
 * This class will serve as a convenient interface for reading and writing the query to and from
 * shared preferences.
 */
public class QueryPreferences {
    private static final String PREF_SEARCH_QUERY = "searchQuery";
    private static final String PREF_LAST_RESULT_ID = "LastResulted";

    public static String getStoredQuery(Context context){
        //Method below returns an instance with a default name and private permissions.
        //(so that the preferences are only available from within the application)
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(PREF_SEARCH_QUERY, null);
    }

    public static void setStoredQuery(Context context, String query){
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(PREF_SEARCH_QUERY, query)
                .apply();
    }

    public static String getPrefLastResultId(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(PREF_LAST_RESULT_ID, null);
    }

    public static void setPrefLastResultId(Context context, String lastResultedId) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(PREF_LAST_RESULT_ID, lastResultedId)
                .apply();
    }
}
