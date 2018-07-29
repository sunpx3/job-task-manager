package com.xxl.job.admin.service.impl;

import com.xxl.job.admin.core.model.AppArticle;
import com.xxl.job.admin.dao.ArticleCountDao;
import com.xxl.job.admin.service.ArticleCountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleCountServiceImpl implements ArticleCountService {

    @Resource
    private ArticleCountDao articleCountDao;

    @Override
    public int getArticleCountNums() {

        return articleCountDao.getArticleCountNums();
    }

    @Override
    public List<AppArticle> getArticleList() {
        return articleCountDao.getArticleList();
    }
}
