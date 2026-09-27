package com.example.t1feigngrupo12.controller;

import com.example.t1feigngrupo12.placeholder.model.AlbumsPlaceHolder;
import com.example.t1feigngrupo12.service.AlbumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/filtrados")
    public List<AlbumsPlaceHolder> obtenerAlbumsFiltrados() {
        return albumService.obtenerAlbumsSolicitados();
    }
}