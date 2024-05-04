package com.BookShopManager.BookShopManager.service.implementation;

import com.BookShopManager.BookShopManager.dto.AuthorDto;
import com.BookShopManager.BookShopManager.entity.Author;
import com.BookShopManager.BookShopManager.repo.AuthorRepository;
import com.BookShopManager.BookShopManager.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void saveAuthor(AuthorDto authorDto) {
        authorRepository.save(new Author(authorDto.getAuthorId(),authorDto.getAuthorName(),authorDto.getBooks()));
    }

    @Override
    public void updateAuthor(AuthorDto authorDto) {
        Optional<Author> tempAuthor = authorRepository.findById(authorDto.getAuthorId());
        if(tempAuthor.isPresent()){
            tempAuthor.get().setAuthorName(authorDto.getAuthorName());
            tempAuthor.get().setBooks(authorDto.getBooks());
        }
    }

    @Override
    public void deleteAuthor(String authorId) {
        Optional<Author> tempAuthor =authorRepository.findById(authorId);
        if (tempAuthor.isPresent()){
        authorRepository.delete(tempAuthor.get());
        }
    }

    @Override
    public AuthorDto getCustomer(String authorId) {
        Optional<Author> authorData = authorRepository.findById(authorId);
        if(authorData.isPresent()){
            return new AuthorDto(
            authorData.get().getAuthorId(),
            authorData.get().getAuthorName(),
            authorData.get().getBooks());
        }else{
            return null;
        }
    }
    @Override
    public ArrayList<AuthorDto> getAllAuthors(int size, int page, String searchText) {
        List<Author> allAuthors =authorRepository.findAll();
        ArrayList<AuthorDto> authorDtos=new ArrayList<>();
        for(Author author:allAuthors){
            authorDtos.add(new AuthorDto(author.getAuthorId(),author.getAuthorName(),author.getBooks()));
        }
        return authorDtos;
    }
}
