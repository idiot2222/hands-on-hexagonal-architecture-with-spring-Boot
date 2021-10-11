package me.bogeun.service;

import lombok.RequiredArgsConstructor;
import me.bogeun.data.BookDto;
import me.bogeun.ports.api.BookServicePort;
import me.bogeun.ports.spi.BookPersistencePort;

import java.util.List;

@RequiredArgsConstructor
public class BookServiceImpl implements BookServicePort {

    private final BookPersistencePort bookPersistencePort;

    @Override
    public BookDto addBook(BookDto bookDto) {
        return bookPersistencePort.addBook(bookDto);
    }

    @Override
    public void deleteBookById(Long id) {
        bookPersistencePort.deleteBookById(id);
    }

    @Override
    public BookDto updateBook(BookDto bookDto) {
        return bookPersistencePort.updateBook(bookDto);
    }

    @Override
    public List<BookDto> getBooks() {
        return bookPersistencePort.getBooks();
    }

    @Override
    public BookDto getBookById(Long bookId) {
        return bookPersistencePort.getBookById(bookId);
    }
}
