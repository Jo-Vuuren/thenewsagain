package com.example.android.thenews;

/**
 * An {@link Article} object contains information related to a single article.
 */

public class Article {

    /**The section name of the article. */
    private String mSectionName;

    /** Title of the Article. */
    private String mWebTitle;

    /** Time that the article was published. */
    private long mWebPublicationDate;

    /** Website URL of the article */
    private String mUrl;

    /**
     * Constructs a new {@link Article} object.
     *
     * @param sectionName is the section that the article falls under.
     * @param webTitle is the name of the article.
     * @param webPublicationDate is the time when the article was published.
     * @param url is the website URL to find more details about the article.
     */
    public Article(String sectionName, String webTitle, long webPublicationDate, String url) {
        mSectionName = sectionName;
        mWebTitle = webTitle;
        mWebPublicationDate = webPublicationDate;
        mUrl = url;
    }

    /** Returns the section that the article falls under. */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the title of the article.
     */
    public String getWebTitle() {
        return mWebTitle;
    }

    /**
     * Returns the time when the article was published.
     */
    public long getWebPublicationDate() {
        return mWebPublicationDate;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() {
        return mUrl;
    }
}
