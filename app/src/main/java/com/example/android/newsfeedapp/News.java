package com.example.android.newsfeedapp;

/**
 * Created by ILEANA on 8/30/2017.
 */

public class News {

    //The title of the article
    private String mArticleTitle;

    //The selection to which the article belongs
    private String mSectionName;

    // The name of the author who wrote the article
    private String mAuthorName;

    //The date when the article was published
    private String mDatePublished;

    //The url of the news (while the news item is clicked, the url opens)
    private String mUrl;


    /**
     * Constructs a new {@link News} object.
     *
     * @param articleTitle  is the title of the article
     * @param selectionName is the name of the selection
     * @param authorName    is the author's name
     * @param datePublished is the date when it was published
     * @param url           is the url of the news
     */
    public News(String articleTitle, String selectionName, String authorName, String datePublished, String url) {

        mArticleTitle = articleTitle;
        mSectionName = selectionName;
        mAuthorName = authorName;
        mDatePublished = datePublished;
        mUrl = url;
    }

    public String getArticleTitle() {
        return mArticleTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getAuthorName() {
        return mAuthorName;
    }

    public String getDatePublished() {
        return mDatePublished;
    }

    public String getUrl() {
        return mUrl;
    }
}
