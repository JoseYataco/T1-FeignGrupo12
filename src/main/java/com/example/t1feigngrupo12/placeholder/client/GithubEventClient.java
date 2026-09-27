package com.example.t1feigngrupo12.placeholder.client;

import com.example.t1feigngrupo12.placeholder.model.GithubEventDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@FeignClient(
        name = "githubEventClient",
        url = "${clients.github.url}"
)
public interface GithubEventClient {

    @GetMapping(
            value = "/events",
            headers = {
                    "Accept=application/vnd.github+json",
                    "X-GitHub-Api-Version=2022-11-28",
                    "User-Agent=T1-FeignGrupo1"
            }
    )
    List<GithubEventDto> obtenerEventos();
}
