package com.zstao.api.mapper;

import com.zstao.api.entity.UserLike;

import java.util.List;

/**
 * 用户关注
 */
public interface UserLikeDao {
    List<UserLike> listUserLikes(); //用户关注用户

    UserLike getUserLike(Integer likeId);

    List<UserLike> listUserNotLikes(); // 用户取消关注的用户

    int saveUserLike(UserLike userLike);

    int updateUserLike(Integer likeId);  //用户取消关注

    int userLikeNumber();

    int getUserLikeNumber(Integer userId);  //用户关注的数量

    int getUserBeLikeNumber(Integer authotId);  //用户被关注的数量

    List<UserLike> listUserLikeUsers(Integer userId);  // 用户关注了哪些人

    List<UserLike> listUserBeLikeUsers(Integer authotId); //用户被哪些人关注
}
