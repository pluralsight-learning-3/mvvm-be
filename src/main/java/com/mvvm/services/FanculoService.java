package com.mvvm.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FanculoService {

    public String getSfanculizzato(ArrayList<String> list) {
        int index = (int) Math.round(Math.random()*list.size());
        return list.get(index);
    }
}
