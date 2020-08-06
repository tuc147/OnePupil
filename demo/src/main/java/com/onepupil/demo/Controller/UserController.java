package com.onepupil.demo.Controller;

import java.util.List;
import java.util.Optional;
import com.onepupil.demo.Model.*;
import com.onepupil.demo.Data.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class UserController {
    @Autowired
    UserRepo repo;


    @GetMapping("/users")
    public List<user> getAll(){
        return repo.findAll();
    }


    @GetMapping("/users/{email}")
    public Optional<user> findUser(@PathVariable String email){
        Optional<user> user = repo.findByEmail(email);
        Optional<user> empty = Optional.empty();
        if(!user.isPresent()){
            return empty;
        }
        else{
            return user;
        }
    }


    @PostMapping("/users")
    public Object newUser(@RequestBody user newUser){
        newUser.setMiles(0);
        return repo.save(newUser);
    }
    
    
    @PatchMapping("/users/{email}")
    public user addMiles(@PathVariable String email, @RequestBody user newMiles){
        Optional<user> update = repo.findByEmail(email);
        user miles = update.get();
        miles.addMiles(newMiles.getMiles());
        System.out.print(newMiles.getMiles());
        if(repo.findByEmail(miles.getEmail()).isPresent()){
            repo.deleteByEmail(email);
            repo.save(miles);
        }
        return miles;


    }
        

}