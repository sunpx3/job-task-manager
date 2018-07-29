package com.xxl.job.admin.core.model;

public class AppArticle {
    private String id;
    private String title;
    private String url;
    private String readNums;
    private String commentNums;
    private String articleTitleHash;
    private String timeStamp;

    private String appId;

    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReadNums() {
        return readNums;
    }

    public void setReadNums(String readNums) {
        this.readNums = readNums;
    }

    public String getCommentNums() {
        return commentNums;
    }

    public void setCommentNums(String commentNums) {
        this.commentNums = commentNums;
    }

    public String getArticleTitleHash() {
        return articleTitleHash;
    }

    public void setArticleTitleHash(String articleTitleHash) {
        this.articleTitleHash = articleTitleHash;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

}
