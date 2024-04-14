package com.otrum.register;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register")
public class RegisterAPI {

    @GetMapping("/")
    public List<Person> getRegister(){
        return RegisterService.getRegister();
    }

    @PostMapping("/update/list")
    public void updateRegister(@RequestBody List<Person> persons){
        System.out.println(persons);
        RegisterService.updateRegister(persons);
    }
}
