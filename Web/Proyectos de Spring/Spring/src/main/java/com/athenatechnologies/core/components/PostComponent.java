package com.athenatechnologies.core.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.athenatechnologies.core.model.Post;

@Component("com.athenatechnologies.core.components.PostComponent")
/*Un componente es para auxiliarse a lo que es la parte de la aplicación*/
public class PostComponent
{
    public List<Post> getPosts()
    {
        ArrayList<Post> post = new ArrayList<>();

        post.add(new Post(1, "Lorem ipsum dolor sit, amet consectetur adipisicing elit.",
                "http://localhost:8080/img/aqua.jpg",
                "Desarrollo web", new Date()));

        post.add(new Post(2, "Lorem ipsum dolor sit, amet consectetur adipisicing elit.",
                "http://localhost:8080/img/aqua.jpg",
                "Desarrollo web", new Date()));

        post.add(new Post(3, "Lorem ipsum dolor sit, amet consectetur adipisicing elit.",
                "http://localhost:8080/img/aqua.jpg",
                "Desarrollo web", new Date()));

        post.add(new Post(4, "Lorem ipsum dolor sit, amet consectetur adipisicing elit.",
                "http://localhost:8080/img/aqua.jpg",
                "Desarrollo web Vro", new Date()));

        /* */

        return post;
    }
}
