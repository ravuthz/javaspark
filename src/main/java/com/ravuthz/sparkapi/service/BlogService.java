package com.ravuthz.sparkapi.service;

import com.mongodb.MongoClient;
import com.ravuthz.sparkapi.model.Blog;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.List;

/**
 * Created by Vannaravuth Yo
 * Date : 8/16/2017, 11:24 AM
 * Email : ravuthz@gmail.com
 */
public class BlogService {
    MongoClient client = new MongoClient("localhost", 27007);
    Datastore datastore = new Morphia().createDatastore(client, "blog");

    public boolean addPost(Blog blog) {
        datastore.save(blog);
        return true;
    }

    public List<Blog> listPost() {
        return datastore.find(Blog.class).asList();
    }
}
