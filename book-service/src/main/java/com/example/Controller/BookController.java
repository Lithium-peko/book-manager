package com.example.Controller;

import com.example.Service.BookService;
import com.example.entity.Book;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Resource
    BookService service;

    @RequestMapping("book/{bid}")
    public Book findBookById(@PathVariable("bid") int bid, HttpServletRequest request) {
        System.out.println(request.getHeader("Test"));
        return service.getBookById(bid);
    }
}
