package com.bean.beanvalidation.controller;



import jakarta.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Student {


    @Min(value = 1,message = "Id not less than 1")
    @Max(value = 20,message = "Id not greater than 20")
    private int id;
    @NotEmpty
    @Size(min=3,message = "Name Should be greater than 4 character")
    private String name;

    @Size(min=5,max=20,message = "Address must be between 5-20 character")
    @NotEmpty
    private String address;

    @Min(value = 18,message = "Age at least 18 ")
    @Max(value = 100,message = "Age Should not be greater than 100")
    private int age;
    @Email
    @Pattern(regexp ="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$",
            message = "Email not Valid...")
    private String email;

}
