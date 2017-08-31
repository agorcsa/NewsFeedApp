package com.example.android.newsfeedapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by ILEANA on 8/30/2017.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {

        /**
         * Query URL
         */
        private String mUrl;

        /**
         * Constructs a new {@link NewsLoader}.
         *
         * @param context of the activity
         * @param url     to load data from
         */
        public NewsLoader(Context context, String url) {
            super(context);
            mUrl = url;
        }

        @Override
        protected void onStartLoading() {
            forceLoad();
        }

        @Override
        public List<News> loadInBackground() {
            if (mUrl == null) {
                return null;
            }

            // Perform the network request, parse the response, and extract a list of earthquakes.
            List<News> newses = QueryUtils.fetchNewsData(mUrl);
            return newses;
        }
    }

