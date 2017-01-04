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
	
	@RequestMapping("/bootWelcome")
	public String welcome(){
		return "forward:welcome123.jsp";
	}
	
	@RequestMapping(value="/book", method=RequestMethod.PUT)
	@ResponseBody
	public String updateBook(){
		Book b = new Book();
		b.setBookId(1);
		b.setBookName("Spring Boot");
		b.setBookCost(700.0);
		bookRepo.save(b);
		return "Book "+b.getBookName()+" successfully updated.....";
		
	}
	
	@RequestMapping(value="/book", method=RequestMethod.DELETE)
	@ResponseBody
	public String deleteBook(){
		bookRepo.delete(1);
		return "Book successfully deleted.....";
		
	}
	
	@RequestMapping(value="/book", method=RequestMethod.POST)
	@ResponseBody
	public String addBook(){
		Book b = new Book();
		b.setBookName("Spring");
		b.setBookCost(600.0);
		bookRepo.save(b);
		return "Book "+b.getBookName()+" successfully added.....";
		
	}
	
	@RequestMapping(value="/book", method=RequestMethod.GET)
	@ResponseBody
	public String findBookByName(){
		
		Book book = bookRepo.findByBookName("Spring");
		System.out.println(book.getBookName());
		System.out.println(book.getBookCost());
		return "Book successfully added.....";
		
	}
}
