package com.example.api.Services;import com.example.api.DTO.PostRequestDTO;import com.example.api.Entity.Post;import java.util.List;public interface BlogPostService {    PostRequestDTO updatePost(PostRequestDTO postRequestDTO, Long id,String email);    List<Post> getAllPost();    PostRequestDTO addPost(PostRequestDTO postDTO, String email);    void deletePost(Long id,String email);}