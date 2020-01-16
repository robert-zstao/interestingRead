package com.zstao.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * user_like
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLike implements Serializable {
    private Integer likeId;

    private String userId;

    private String authotId;

    private Date createDate;

    private Integer status;

    private static final long serialVersionUID = 1L;

}