package in.javahome.bootmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import in.javahome.bootmvc.entity.Book;
import in.javahome.bootmvc.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository bookRepo;
	
	@RequestMapping(value="/book", method=RequestMethod.GET)
	@ResponseBody
	public String addBook(){
		Book b = new Book();
		b.setBookName("Spring");
		b.setBookCost(600.0);
		bookRepo.save(b);
		return "Book "+b.getBookName()+" successfully added.....";
		
	}
}
