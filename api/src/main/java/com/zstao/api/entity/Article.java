package com.zstao.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * article
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article implements Serializable {
    private Integer aid;

    private String title;

    private String userId;

    private String atypeId;

    private Integer viewNumber;

    private Date createDate;

    private String aMain;

    private Integer status;

}