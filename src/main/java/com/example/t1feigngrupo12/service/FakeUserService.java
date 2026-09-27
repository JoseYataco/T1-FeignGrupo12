package com.example.t1feigngrupo12.service;

import com.example.t1feigngrupo12.placeholder.client.FakeUserClient;
import com.example.t1feigngrupo12.placeholder.model.FakeUserDto;
import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.List;

@Service
public class FakeUserService {

    private static final int LONGITUD_MINIMA_USERNAME = 6;

    private final FakeUserClient fakeUserClient;

    public FakeUserService(FakeUserClient fakeUserClient) {
        this.fakeUserClient = fakeUserClient;
    }


    public List<FakeUserDto> obtenerUsuariosSolicitados() {
        List<FakeUserDto> usuarios = fakeUserClient.obtenerUsuarios();

        if (usuarios == null || usuarios.isEmpty()) {
            return Collections.emptyList();
        }

        return usuarios.stream()
                .filter(this::tieneDatosRequeridos)
                .filter(usuario -> esPar(usuario.getId()))
                .filter(usuario -> usuario.getUsername().length() > LONGITUD_MINIMA_USERNAME)
                .toList();
    }

    private boolean tieneDatosRequeridos(FakeUserDto usuario) {
        return usuario != null
                && usuario.getId() != null
                && usuario.getUsername() != null;
    }

    private boolean esPar(long numero) {
        return numero % 2 == 0;
    }
}