package com.example.springbootexample.controller;

import com.example.springbootexample.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping(value ="/board/write.do")
    public String openBoardWrite(Model model){
        return "board/write";
    }
}
