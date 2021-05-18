package com.example.helloworld.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Account {
    private String accountName;
    private Integer accountNumber;
}
