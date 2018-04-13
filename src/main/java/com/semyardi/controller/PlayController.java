package com.semyardi.controller;

import com.semyardi.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;

@Controller
public class PlayController {
    @Autowired
    private IPlayerService IPlayerService;

    @RequestMapping("/play")
    public void play(@RequestParam File file){
        IPlayerService.play(file);
    }
}
