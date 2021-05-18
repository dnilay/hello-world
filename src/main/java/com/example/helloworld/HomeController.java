package com.example.helloworld;

import com.example.helloworld.model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String helloWorld()
    {
        return "hello world";
    }

    @GetMapping("/accounts")
    public ResponseEntity<Account> getAccount()
    {
        return ResponseEntity.ok(Account.builder().accountNumber(100).accountName("John Doe").build());
    }


}
