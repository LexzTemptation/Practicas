package com.athenatechnologies.core.entity;

import java.util.Date;

public class Post
{
    private int id;
    private String description, urlImg, title;
    private Date fecha;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getUrlImg()
    {
        return urlImg;
    }

    public void setUrlImg(String urlImg)
    {
        this.urlImg = urlImg;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Date getFecha()
    {
        return fecha;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    public Post(int id, String description, String urlImg, String title, java.util.Date date)
    {
        this.id = id;
        this.description = description;
        this.urlImg = urlImg;
        this.title = title;
        this.fecha = date;
    }

    public Post()
    {

    }

}