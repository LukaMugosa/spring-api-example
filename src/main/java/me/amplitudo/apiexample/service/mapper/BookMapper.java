package me.amplitudo.apiexample.service.mapper;


import me.amplitudo.apiexample.domain.*;
import me.amplitudo.apiexample.service.dto.BookDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Book} and its DTO {@link BookDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BookMapper extends EntityMapper<BookDTO, Book> {



    default Book fromId(Long id) {
        if (id == null) {
            return null;
        }
        Book book = new Book();
        book.setId(id);
        return book;
    }
}