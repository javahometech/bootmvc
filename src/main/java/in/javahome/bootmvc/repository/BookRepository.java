package in.javahome.bootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.javahome.bootmvc.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
