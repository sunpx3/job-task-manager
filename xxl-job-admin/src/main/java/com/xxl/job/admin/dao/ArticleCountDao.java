package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.AppArticle;

import java.util.List;

public interface ArticleCountDao {
    public int getArticleCountNums();
    public List<AppArticle> getArticleList();
}
