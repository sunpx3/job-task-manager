package com.xxl.job.admin.controller;

import com.xxl.job.admin.core.model.AppArticle;
import com.xxl.job.admin.service.ArticleCountService;
import com.xxl.job.baidupan.cookies.GetBaiduCloudRealURL;
import com.xxl.job.core.biz.model.ReturnT;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class ArticleCountController {


    @Resource
    private ArticleCountService articleCountService;

    @RequestMapping("/toArticleCount")
    public String toArticleCount(Model model){

        int articleCountNums = articleCountService.getArticleCountNums();
        List<AppArticle> appArticleList = articleCountService.getArticleList();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (AppArticle appArticle : appArticleList){
            String formatDate = sdf.format(Long.valueOf(appArticle.getTimeStamp()));
            appArticle.setTimeStamp(formatDate);
        }

        model.addAttribute("appArticleList",appArticleList);
        model.addAttribute("articleCountNums",articleCountNums);

        return "article/count";
    }

    @RequestMapping("/getArticleCountNums")
    @ResponseBody
    public ReturnT<Integer> getArticleCountNums(){
        int articleCountNums = articleCountService.getArticleCountNums();

        ReturnT<Integer> returnT = new ReturnT(ReturnT.SUCCESS_CODE);
        returnT.setContent(articleCountNums);
        return returnT;
    }


    @RequestMapping("/getBaiDuRealFilePath")
    @ResponseBody
    public ReturnT<String> getBaiDuRealFilePath(HttpServletRequest request){

        String url = request.getParameter("url");
        ReturnT<String> returnT = new ReturnT(ReturnT.SUCCESS_CODE);

        String realUrl = GetBaiduCloudRealURL.getBaiduRealFilePath(url);

        returnT.setContent(realUrl);
        return returnT;
    }


}
