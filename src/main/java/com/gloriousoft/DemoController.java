package com.gloriousoft;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("demo")
public class DemoController {

    @GetMapping("400")
    public String get400() {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Demo threw 400");
    }

    @GetMapping("409")
    public String get409() {
        throw new ResponseStatusException(HttpStatus.CONFLICT, "Formula 409");
    }

}
