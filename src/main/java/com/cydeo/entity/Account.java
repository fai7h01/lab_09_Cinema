package com.cydeo.entity;

import com.cydeo.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account_details")
@Data
@NoArgsConstructor
public class Account extends BaseEntity{

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private String age;
    private String postalCode;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @OneToOne(mappedBy = "account")
    private User user;
}
