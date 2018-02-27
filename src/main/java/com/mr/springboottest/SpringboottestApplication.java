package com.mr.springboottest;

import com.mr.springboottest.pojo.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@SpringBootApplication
public class SpringboottestApplication {
	@Resource
	private Book book;

	public static void main(String[] args) {
		SpringApplication.run(SpringboottestApplication.class, args);
	}
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	public String index(){
		return "hello Spring Boot!";
	}
	@RequestMapping("/index2")
	public String index2(){
		return "hello Spring Boot2!";
	}
	@RequestMapping("/book")
	public String book(){
		return "this book is "+book.getName()+";this author is "+book.getAuthor()+";this price is "+book.getPrice();
	}
}
