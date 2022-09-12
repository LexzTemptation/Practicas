package com.athenatechnologies.core.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.athenatechnologies.core.model.Post;
import com.athenatechnologies.core.service.PostService_interfaz;

@Service
public class PostServiceImplementation implements PostService_interfaz
{

    @Override
    public List<Post> validationId(List<Post> posts)
    {
        for (Post post : posts)
        {
            if (post.getTitle() == null)
            {
                throw new NullPointerException("Title Null " + "Prro");
            }
        }

        return posts;
    }

}
