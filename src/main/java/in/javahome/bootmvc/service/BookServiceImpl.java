package in.javahome.bootmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.javahome.bootmvc.entity.Book;
import in.javahome.bootmvc.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepo;
	
	public void addBook(Book book){
		
		Book byBookName = bookRepo.findByBookName(book.getBookName());
		if(byBookName != null){
			throw new RuntimeException("Book already exists");
		}
		bookRepo.save(book);
	}
}
