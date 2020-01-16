package com.zstao.api.mapper;

import com.zstao.api.entity.ArticleType;

import java.util.List;

public interface ArticleTypeDao {
    List<ArticleType> listArticleTypes();

    String getArticleType(Integer atypeId);  //根据id 查询 类型名

    int ArticleTypeNumber();  //查询数量

    int saveArticleType(ArticleType articleType);

    int deleteArticleType(Integer atypeId);

    int updateArticleType(ArticleType articleType);
}
