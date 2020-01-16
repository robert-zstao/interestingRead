package com.zstao.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * article_collect
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleCollect implements Serializable {
    private Integer collectId;

    private String articleId;

    private String uId;

    private Date createDate;

    private Integer status;

    private static final long serialVersionUID = 1L;

}