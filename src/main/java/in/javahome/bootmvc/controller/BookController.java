package in.javahome.bootmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import in.javahome.bootmvc.entity.Book;
import in.javahome.bootmvc.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookServ;
	
	@RequestMapping("/bookView")
	public String getBookView(){
		return "book";
	}
	
	@RequestMapping(value="/book", method=RequestMethod.PUT)
	@ResponseBody
	public String updateBook(){
		Book b = new Book();
		b.setBookId(1);
		b.setBookName("Spring Boot");
		b.setBookCost(700.0);
		bookServ.addBook(b);
		return "Book "+b.getBookName()+" successfully updated.....";
		
	}
	
	@RequestMapping(value="/book", method=RequestMethod.DELETE)
	@ResponseBody
	public String deleteBook(){
//		bookRepo.delete(1);
		return "Book successfully deleted.....";
		
	}
	
	@RequestMapping(value="/book", method=RequestMethod.POST)
	public String addBook(Book book, ModelMap map){
		try {
			bookServ.addBook(book);
			map.addAttribute("message", book.getBookName()+" added successfully");
		} catch (Exception e) {
			map.addAttribute("message", book.getBookName()+e.getMessage());
		}
		
		return "book";
	}
	
	@RequestMapping(value="/book", method=RequestMethod.GET)
	@ResponseBody
	public String findBookByName(){
		
//		Book book = bookRepo.findByBookName("Spring");
//		System.out.println(book.getBookName());
//		System.out.println(book.getBookCost());
		return "Book successfully added.....";
		
	}
}
