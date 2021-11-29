package com.goodcoder.controller;

import java.util.List;

import com.goodcoder.model.Board;
import com.goodcoder.repository.BoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardRepository boardRepository;
    
    @GetMapping("/list")
    public String list(Model model){
        List<Board> boards = boardRepository.findAll();
        model.addAttribute("boards", boards);
        System.out.println(boards);
        return "board/list";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
