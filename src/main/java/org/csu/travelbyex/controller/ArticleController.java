package org.csu.travelbyex.controller;


import io.swagger.annotations.ApiOperation;
import org.csu.travelbyex.core.Result;
import org.csu.travelbyex.core.ResultGenerator;
import org.csu.travelbyex.domain.Article;
import org.csu.travelbyex.domain.Comment;
import org.csu.travelbyex.domain.Reply;
import org.csu.travelbyex.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @ApiOperation(value = "发布一篇文章", notes = "/")
    @PostMapping("/articles")
    public Result insertArticle(@RequestBody Article article)
    {
        try
        {
            articleService.insertArticle(article);
            return ResultGenerator.success("发布成功");
        }catch (Exception e)
        {
            return ResultGenerator.fail("发布失败");
        }
    }


    @ApiOperation(value = "修改文章")
    @PutMapping("/articles")
    public Result updateArticle(@RequestBody Article article)
    {
        try{
            articleService.updateArticle(article);
            return ResultGenerator.success("更新成功");
        }catch (Exception e)
        {
            return ResultGenerator.fail("更新失败");
        }
    }


    @ApiOperation(value = "根据articleId查询文章")
    @GetMapping("/articles")
    public Result getArticleByArticleId(@RequestParam(value = "articleId") Integer articleId)
    {
        Article article = articleService.getArticleById(articleId);
        if (article == null) return ResultGenerator.fail("文章不存在");
        List<Comment> comments = articleService.getCommentsByArticleId(articleId);
        List<Reply> replies = articleService.getRepliesByCommentId(articleId);
        Map message = new LinkedHashMap();
        message.put("article", article);
        message.put("comments", comments);
        message.put("replies", replies);
        return ResultGenerator.success(message);
    }


    // 还需测试有评论和回复的情况
    @ApiOperation(value = "根据articleId删除文章")
    @DeleteMapping("/articles")
    public Result deleteArticleByArticleId(@RequestParam(value = "articleId") Integer articleId)
    {
        try{
            articleService.deleteArticleById(articleId);
            return ResultGenerator.success("删除成功");
        }catch (Exception e)
        {
            return ResultGenerator.fail("删除失败");
        }
    }


    @ApiOperation(value = "查询某一用户的所有文章")
    @GetMapping("/articles/author")
    public Result getArticlesByAuthorId(@RequestParam(value = "authorId") String authorId)
    {
        List<Article> articles = articleService.getArticlesByAuthorId(authorId);
        return ResultGenerator.success(articles);

    }





}
