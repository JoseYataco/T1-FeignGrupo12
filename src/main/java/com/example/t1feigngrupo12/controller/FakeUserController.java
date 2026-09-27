package com.example.t1feigngrupo12.controller;

import com.example.t1feigngrupo12.placeholder.model.FakeUserDto;
import com.example.t1feigngrupo12.service.FakeUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fake-store/usuarios")
public class FakeUserController {

    private final FakeUserService fakeUserService;

    public FakeUserController(FakeUserService fakeUserService) {
        this.fakeUserService = fakeUserService;
    }

    //http://localhost:8080/api/fake-store/usuarios/solicitados
    @GetMapping("/solicitados")
    public List<FakeUserDto> obtenerUsuariosFiltrados() {
        return fakeUserService.obtenerUsuariosSolicitados();
    }
}