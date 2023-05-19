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
}
