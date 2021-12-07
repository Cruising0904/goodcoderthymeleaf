package com.goodcoder.service;

import com.goodcoder.model.Board;
import com.goodcoder.model.User;
import com.goodcoder.repository.BoardRepository;
import com.goodcoder.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    
    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;
    
    public Board save(String username, Board board){
       User user = userRepository .findByUsername(username);
       board.setUser(user);
       return boardRepository.save(board);
    }
}
