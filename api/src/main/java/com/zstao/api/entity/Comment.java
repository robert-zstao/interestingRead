package com.zstao.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * comment
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment implements Serializable {
    private Integer cid;

    private String articleId;

    private String cMain;

    private String userId;

    private Date createDate;

    private Integer status;

    private static final long serialVersionUID = 1L;

}