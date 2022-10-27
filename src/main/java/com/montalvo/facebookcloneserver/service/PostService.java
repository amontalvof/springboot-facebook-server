package com.montalvo.facebookcloneserver.service;

import com.montalvo.facebookcloneserver.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
