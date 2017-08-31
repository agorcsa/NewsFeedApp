package com.example.android.newsfeedapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ILEANA on 8/30/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

        public NewsAdapter(Context context, List<News> newses) {
            super(context, 0, newses);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.news_list_item, parent, false);
            }

            // Find the news at the given position in the list of news
            News currentNews = getItem(position);

            //Find the TextView with the ID "articleTitle"
            TextView articleTitle = (TextView) listItemView.findViewById(R.id.articleTitle);
            String formattedArticleTitle = currentNews.getArticleTitle();
            articleTitle.setText(formattedArticleTitle);

            //Find the TextView with the ID "sectionName"
            TextView sectionName = (TextView) listItemView.findViewById(R.id.sectionName);
            String formattedSectionName = currentNews.getSectionName();
            sectionName.setText(formattedSectionName);

            //Find the TextView with the ID "authorName"
            TextView authorName = (TextView) listItemView.findViewById(R.id.authorName);
            String formattedAuthorName = currentNews.getAuthorName();
            authorName.setText(formattedAuthorName);

            //Find the TextView with the ID "datePublished"
            TextView datePublished = (TextView) listItemView.findViewById(R.id.datePublished);
            String formattedDatePublished = currentNews.getDatePublished();
            datePublished.setText(formattedDatePublished);

            //Find the TextView with the ID "url"???
            TextView url = (TextView)listItemView.findViewById(R.id.url);
            String formattedUrl = currentNews.getUrl();
            url.setText(formattedUrl);

            // Return the list item view that is now showing the appropriate data
            return listItemView;
        }
    }

