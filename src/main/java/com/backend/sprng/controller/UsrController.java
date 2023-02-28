package com.backend.sprng.controller;

import com.backend.sprng.domain.Usr;
import com.backend.sprng.repo.UsrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UsrController {

    @Autowired
    private UsrRepository usrRepository;

    @GetMapping
    public List<Usr> getAll() {
        return usrRepository.findAll();
    }

    @PostMapping
    public Usr create(@RequestBody Usr usr) {
        return usrRepository.save(usr);
    }
}
