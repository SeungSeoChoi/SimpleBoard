package com.example.springbootexample.service;

import com.example.springbootexample.domain.BoardDTO;

import java.util.List;

public interface BoardService {
    public boolean registerBoard(BoardDTO params);
    public BoardDTO getBoardDetail(Long idx);
    public boolean deleteBoard(Long idx);
    public List<BoardDTO> getBoardList();
}