package com.example.t1feigngrupo12.service;

import com.example.t1feigngrupo12.placeholder.client.AlbumClient;
import com.example.t1feigngrupo12.placeholder.model.AlbumsPlaceHolder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AlbumService {

    private final AlbumClient albumClient;

    public AlbumService(AlbumClient albumClient) {
        this.albumClient = albumClient;
    }


    public List<AlbumsPlaceHolder> obtenerAlbumsSolicitados() {
        List<AlbumsPlaceHolder> albums = albumClient.obtenerAlbums();

        if (albums == null || albums.isEmpty()) {
            return Collections.emptyList();
        }

        return albums.stream()
                .filter(this::tieneIdentificadores)
                .filter(album -> esPar(album.getUserId()))
                .filter(album -> esImpar(album.getId()))
                .toList();
    }

    private boolean tieneIdentificadores(AlbumsPlaceHolder album) {
        return album != null && album.getUserId() != null && album.getId() != null;
    }

    private boolean esPar(long numero) {
        return numero % 2 == 0;
    }

    private boolean esImpar(long numero) {
        return numero % 2 != 0;
    }
}
