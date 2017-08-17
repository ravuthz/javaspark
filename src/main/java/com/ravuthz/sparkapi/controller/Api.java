package com.ravuthz.sparkapi.controller;

import com.google.gson.Gson;
import com.ravuthz.sparkapi.model.Blog;
import com.ravuthz.sparkapi.service.BlogService;

import static spark.Spark.post;

/**
 * Created by Vannaravuth Yo
 * Date : 8/16/2017, 11:35 AM
 * Email : ravuthz@gmail.com
 */
public class Api {
    private static BlogService blogService = new BlogService();

    public static void main(String[] args) {
        final Gson gson = new Gson();

        post("/posts", (req, res) -> {
            Blog blog = gson.fromJson(res.body(), Blog.class);
            return blogService.addPost(blog);
        }, gson::toJson);

        //TODO: Install MongoDB

    }


}
