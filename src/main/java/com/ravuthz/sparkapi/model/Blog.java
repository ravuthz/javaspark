package com.ravuthz.sparkapi.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by Vannaravuth Yo
 * Date : 8/16/2017, 11:19 AM
 * Email : ravuthz@gmail.com
 */

@Entity
public class Blog {
    @Id
    private ObjectId id;
    private String title;
    private String content;
    private String other;

    public Blog() {}

    public Blog(String title, String content, String other) {
        this.title = title;
        this.content = content;
        this.other = other;
    }
}
