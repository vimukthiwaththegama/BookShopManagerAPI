package com.BookShopManager.BookShopManager.api;

import com.BookShopManager.BookShopManager.service.AuthorService;
import com.BookShopManager.BookShopManager.dto.AuthorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.coyote.http11.Constants.a;

@RestController
@RequestMapping("api/v1/Author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @PostMapping
    public void saveAuthor( @RequestBody  AuthorDto authorDto){
        authorService.saveAuthor(authorDto);
    }


}
