package com.BookShopManager.BookShopManager.api;

import com.BookShopManager.BookShopManager.service.AuthorService;
import com.BookShopManager.BookShopManager.dto.AuthorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/Author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @PostMapping
    public void saveAuthor( @RequestBody  AuthorDto authorDto){
        authorService.saveAuthor(authorDto);
    }
    @PutMapping
    public void updateAuthor(@RequestBody AuthorDto authorDto){
        authorService.updateAuthor(authorDto);
    }
    @DeleteMapping
    public void deleteAuthor(@RequestParam String  id){
        authorService.deleteAuthor(id);
    }
    @GetMapping("/{id}")
    public AuthorDto getAuthor(@PathVariable String  id){
        return authorService.getAuthor(id);
    }
    @GetMapping("/authorList")
    public ArrayList<AuthorDto> getAllAuthors(@RequestParam int size,
                                              @RequestParam int page,
                                              @RequestParam String searchText){
        return authorService.getAllAuthors(size,page,searchText);

    }
}
