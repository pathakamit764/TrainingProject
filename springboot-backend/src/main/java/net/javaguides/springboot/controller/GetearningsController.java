package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Getbookingsbyemail;
import net.javaguides.springboot.model.Getearnings;
import net.javaguides.springboot.model.Movie;
import net.javaguides.springboot.repository.GetbookingsbyemailRepository;
import net.javaguides.springboot.repository.GetearningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GetearningsController {

    @Autowired
    private GetearningRepository getearningRepository;


    @GetMapping("/getearnings")
    public List<Getearnings> getAllShow(){
        return getearningRepository.findAll();
    }


}
