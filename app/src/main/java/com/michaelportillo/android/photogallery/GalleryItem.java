package com.michaelportillo.android.photogallery;

import android.net.Uri;

/**
 * Created by USER on 1/8/19.
 */

public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;
    private String mOwner;

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getCaption() {
        return mCaption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public Uri getPhotoPageUri() {
        return Uri.parse("http://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }




    @Override
    public String toString(){
        return mCaption;
    }
}
