package com.onepupil.demo.Controller;

import java.util.List;

import com.onepupil.demo.Data.UserRepo;
import com.onepupil.demo.Model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * DataController
 */
@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    UserRepo repo;

    @GetMapping("")
    public int getTotMiles(){
        List<user> iter = repo.findAll();
        int tot=0;
        for(int x=0;x<iter.size();x++){
            tot+=iter.get(x).getMiles();
        }
        return tot;

        
    }
}