package com.busu.library.daorepository;

import com.busu.library.model.BooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bookRepository")
public interface MyBookRepository extends JpaRepository<BooksEntity, Integer> {

    BooksEntity findByBookName(String bookName);
}
