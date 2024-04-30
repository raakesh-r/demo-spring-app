package com.example.test.demo.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class UserDetails {
    @Id
    public Long id;
    public String userName;
    public String address;
}
