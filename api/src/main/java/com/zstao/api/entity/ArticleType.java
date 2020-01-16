package com.zstao.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * article_type
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleType implements Serializable {
    private Integer atypeId;

    private String typeName;

    private Date createTime;

    private Integer status;

}