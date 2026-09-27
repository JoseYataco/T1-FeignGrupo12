package com.example.t1feigngrupo12.service;

import com.example.t1feigngrupo12.placeholder.client.GithubEventClient;
import com.example.t1feigngrupo12.placeholder.model.GithubEventDto;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class GithubEventService {

    private static final String TIPO_REQUERIDO = "PushEvent";

    private final GithubEventClient githubEventClient;

    public GithubEventService(GithubEventClient githubEventClient) {
        this.githubEventClient = githubEventClient;
    }


    public List<GithubEventDto> obtenerEventosSolicitados() {
        List<GithubEventDto> eventos = githubEventClient.obtenerEventos();

        if (eventos == null || eventos.isEmpty()) {
            return Collections.emptyList();
        }

        return eventos.stream()
                .filter(this::tieneActorConId)
                .filter(evento -> TIPO_REQUERIDO.equals(evento.getType()))
                .filter(evento -> esImpar(evento.getActor().getId()))
                .toList();
    }

    private boolean tieneActorConId(GithubEventDto evento) {
        return evento != null
                && evento.getActor() != null
                && evento.getActor().getId() != null;
    }

    private boolean esImpar(long numero) {
        return numero % 2 != 0;
    }
}