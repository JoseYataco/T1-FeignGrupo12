package com.example.t1feigngrupo12.placeholder.model;

import java.util.Objects;


public class AlbumsPlaceHolder {

    private Long userId;
    private Long id;
    private String title;

    public AlbumsPlaceHolder() {
    }

    public AlbumsPlaceHolder(Long userId, Long id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof AlbumsPlaceHolder album)) {
            return false;
        }
        return Objects.equals(userId, album.userId)
                && Objects.equals(id, album.id)
                && Objects.equals(title, album.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, id, title);
    }

    @Override
    public String toString() {
        return "AlbumsPlaceHolder{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
