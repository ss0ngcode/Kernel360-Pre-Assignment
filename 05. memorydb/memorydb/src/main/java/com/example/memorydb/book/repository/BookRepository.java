package com.example.memorydb.book.repository;

import com.example.memorydb.book.entity.BookEntity;
import com.example.memorydb.db.SimpleDataRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class BookRepository extends SimpleDataRepository<BookEntity, Long> {

}
