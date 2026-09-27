package com.example.t1feigngrupo12.controller;

import com.example.t1feigngrupo12.placeholder.model.GithubEventDto;
import com.example.t1feigngrupo12.service.GithubEventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/github/events")
public class GithubEventController {

    private final GithubEventService githubEventService;

    public GithubEventController(GithubEventService githubEventService) {
        this.githubEventService = githubEventService;
    }
    //http://localhost:8080/api/github/events/solicitado
    @GetMapping("/solicitado")
    public List<GithubEventDto> obtenerEventosFiltrados() {
        return githubEventService.obtenerEventosSolicitados();
    }
}