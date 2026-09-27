package com.example.t1feigngrupo12.placeholder.client;

import com.example.t1feigngrupo12.placeholder.model.FakeUserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@FeignClient(
        name = "fakeUserClient",
        url = "${clients.fake-store.url}"
)
public interface FakeUserClient {

    @GetMapping("/users")
    List<FakeUserDto> obtenerUsuarios();
}
