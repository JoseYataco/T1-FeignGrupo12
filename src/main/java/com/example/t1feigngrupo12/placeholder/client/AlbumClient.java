package com.example.t1feigngrupo12.placeholder.client;

import com.example.t1feigngrupo12.placeholder.model.AlbumsPlaceHolder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@FeignClient(
        name = "albumClient",
        url = "${clients.json-placeholder.url}"
)
public interface AlbumClient {

    @GetMapping("/albums")
    List<AlbumsPlaceHolder> obtenerAlbums();
}