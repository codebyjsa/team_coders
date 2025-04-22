package com.codespace.junit_rest_api;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBookRecords(){
        return bookRepository.findAll();
    }

    @GetMapping(value = "{bookId}")
    public Book getBookById(@PathVariable(value = "bookId") Long bookId){
        return bookRepository.findById(bookId).get();
    }

    @PostMapping
    public Book createBookRecord(@RequestBody @Valid Book bookRecord){
        return bookRepository.save(bookRecord);
    }

    @PutMapping
    public Book updateBookRecord(@RequestBody @Valid Book bookRecord) {
        if (bookRecord==null || bookRecord.getBookId()==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BookRecord or ID must not be null.");
        }
        Optional<Book> optionalBook = bookRepository.findById(bookRecord.getBookId());
        if (!optionalBook.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book with ID: "+bookRecord.getBookId()+" does not exist.");
        }

        Book existingBookRecord = optionalBook.get();
        existingBookRecord.setName(bookRecord.getName());
        existingBookRecord.setSummary(bookRecord.getSummary());
        existingBookRecord.setRating(bookRecord.getRating());

        return bookRepository.save(existingBookRecord);

    }

    // TODO: WRITE DELETE METHOD TOO.
    @DeleteMapping(value = "/{bookId}")
    public void deleteBookById(@PathVariable(value = "bookId") Long bookId)  {
        if (!bookRepository.findById(bookId).isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"BookId " + bookId + " not present");
        }
        bookRepository.deleteById(bookId);
    }


}
