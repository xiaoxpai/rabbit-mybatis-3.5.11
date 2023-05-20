package org.apache.ibatis.domain.blog.mappers;

import org.apache.ibatis.domain.blog.Post;
import org.apache.ibatis.domain.blog.PostLite;

import java.util.List;

/**
 * @author Alex
 */
public interface PostMapper {

    PostLite selectPostLite();


    List<Post> findPost(Post post);

    List<Post> selectPostIn(List<Integer> ids);

    List<Post> selectOddPostsIn(Integer id);

    List<Post> selectOddPostsInKeysList();

    /**
     * 可选择性更新数据
     */
    void updateSelective(Post post);


    /**
     * 级联更新数据
     * TODO 待完善
     */
    void updateCascade(Post post);

    /**
     * 模糊查询&条件查询
     */
    List<Post> selectPostLikeList(Post post);
}
