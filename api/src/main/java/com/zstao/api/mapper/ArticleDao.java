package com.zstao.api.mapper;

import com.zstao.api.entity.Article;

import java.util.List;

/**
 * 文章接口
 */
public interface ArticleDao {
    List<Article> lsitArticles();

    Article getArticle(Integer id);

    int saveArticle(Article article);

    int deleteArticle(Integer id);

    int updateArticle(Article article);

    int ArticleNumber();


}
