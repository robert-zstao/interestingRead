package com.zstao.api.mapper;

import com.zstao.api.entity.ArticleCollect;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * 文章收藏dao层
 */
public interface ArticleCollectDao {
    List<ArticleCollect> listArticleCollects();

    ArticleCollect getArticleCollect(Integer collectId);

    int saveArticleCollect(ArticleCollect articleCollect);

    int deleteArticleCollect(Integer id); // 用户取消收藏 修改状态

    int updateArticleCollect(ArticleCollect articleCollect);

    int ArticleCollectNumber();  //数据总数

    //文章被收藏
    List<ArticleCollect> listArticleBeCollects(Integer articleId);

    // 用户收藏了哪些文章
    List<ArticleCollect> listUserCollectArticles(Integer uid);


}
