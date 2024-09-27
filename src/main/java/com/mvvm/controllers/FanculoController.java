package com.mvvm.controllers;

import com.mvvm.dto.Request;
import com.mvvm.dto.Response;
import com.mvvm.services.FanculoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/persone")
@AllArgsConstructor
public class FanculoController {

    private FanculoService fanculoService;

    @GetMapping
    public Response<String> testCors() {
        return new Response<>("Allowed");
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    public Response<String> getPerson(@RequestBody Request<ArrayList<String>> request) {
        String person = fanculoService.getSfanculizzato(request.getData());
        return new Response<>(person);
    }

}
