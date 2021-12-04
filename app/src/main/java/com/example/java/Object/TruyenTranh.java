package com.example.java.Object;

public class TruyenTranh {
    private String NameComic,NumberChapter,LinkPicture;

    public TruyenTranh(String nameComic, String numberChapter, String linkPicture) {
        NameComic = nameComic;
        NumberChapter = numberChapter;
        LinkPicture = linkPicture;
    }
    public TruyenTranh(){}

    public String getNameComic() {
        return NameComic;
    }

    public void setNameComic(String nameComic) {
        NameComic = nameComic;
    }

    public String getNumberChapter() {
        return NumberChapter;
    }

    public void setNumberChapter(String numberChapter) {
        NumberChapter = numberChapter;
    }

    public String getLinkPicture() {
        return LinkPicture;
    }

    public void setLinkPicture(String linkPicture) {
        LinkPicture = linkPicture;
    }
}
