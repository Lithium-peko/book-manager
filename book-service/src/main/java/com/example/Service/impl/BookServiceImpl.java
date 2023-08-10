package com.example.Service.impl;

import com.example.Mapper.BookMapper;
import com.example.Service.BookService;
import com.example.entity.Book;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}
