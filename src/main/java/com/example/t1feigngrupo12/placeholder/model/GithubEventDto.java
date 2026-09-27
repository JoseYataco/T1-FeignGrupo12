package com.example.t1feigngrupo12.placeholder.model;

public class GithubEventDto {

    private String id;
    private String type;
    private ActorDto actor;

    public GithubEventDto() {
    }

    public GithubEventDto(String id, String type, ActorDto actor) {
        this.id = id;
        this.type = type;
        this.actor = actor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ActorDto getActor() {
        return actor;
    }

    public void setActor(ActorDto actor) {
        this.actor = actor;
    }
}