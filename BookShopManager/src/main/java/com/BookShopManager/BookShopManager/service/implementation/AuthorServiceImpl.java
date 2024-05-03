package com.BookShopManager.BookShopManager.service.implementation;

import com.BookShopManager.BookShopManager.dto.AuthorDto;
import com.BookShopManager.BookShopManager.repo.AuthorRepository;
import com.BookShopManager.BookShopManager.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void saveAuthor(AuthorDto authorDto) {

    }

    @Override
    public void updateAuthor(AuthorDto authorDto) {

    }

    @Override
    public void deleteAuthor(String authorId) {

    }

    @Override
    public AuthorDto getCustomer(String authorId) {
        return null;
    }

    @Override
    public ArrayList<AuthorDto> getAllAuthors(int size, int page, String searchText) {
        return null;
    }
}
