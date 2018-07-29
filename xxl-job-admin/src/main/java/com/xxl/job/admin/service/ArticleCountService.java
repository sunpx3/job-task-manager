package com.xxl.job.admin.service;

import com.xxl.job.admin.core.model.AppArticle;

import java.util.List;

public interface ArticleCountService {

    public int getArticleCountNums();

    public List<AppArticle> getArticleList();
}
