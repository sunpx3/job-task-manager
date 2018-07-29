<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>百家号文章列表</title>
    <link rel="stylesheet" href="${request.contextPath}/static/plugins/layui/css/layui.css"  media="all">
    <style>
        a:hover {
            color: blue;
        }
        #title{
            margin-top: 15px;
        }
        blockquote, body, button, dd, div, dl, dt, form, h1, h2, h3, h4, h5, h6, input, li, ol, p, pre, td, textarea, th, ul{
            margin: 0;
            padding: 0;
            -webkit-tap-highlight-color: rgba(0,0,0,0);
            margin: 0 auto;
        }
    </style>
</head>
<body>
    <h2>文章总数:${articleCountNums}</h2>

    <div style="width:80%">
        <h2  style="text-align:center" id="title">文章列表</h2>
        <div id="aritcle_list">

            <table class="layui-table" align="center" valign="center">
                <tr>
                    <th>编号</th>
                    <th>标题</th>
                    <th>作者</th>
                    <th>阅读数</th>
                    <th>评论数</th>
                    <th>时间</th>
                </tr>

                <#list appArticleList as appArticle>
                    <tr>
                        <td>${appArticle_index + 1}</td>
                        <td>
                            <a target="_blank" href="${appArticle.url}">${appArticle.title}</a>
                        </td>
                        <td>${appArticle.authorName}</td>
                        <td>${appArticle.readNums}</td>
                        <td>${appArticle.commentNums}</td>
                        <td>${appArticle.timeStamp}</td>
                    </tr>
                </#list>
            </table>
        </div>

    </div>
</body>
</html>