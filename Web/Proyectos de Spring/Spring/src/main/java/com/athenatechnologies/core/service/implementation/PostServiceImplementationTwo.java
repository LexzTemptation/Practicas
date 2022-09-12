package com.athenatechnologies.core.service.implementation;

import java.util.List;

import com.athenatechnologies.core.model.Post;
import com.athenatechnologies.core.service.PostService_interfaz;

public class PostServiceImplementationTwo implements PostService_interfaz
{
    @Override
    public List<Post> validationId(List<Post> posts)
    {
        for (Post post : posts)
        {
            if (post.getId() == 0)
            {
                throw new NullPointerException("Id Null " + "Prro");
            }
        }

        return posts;
    }
}
