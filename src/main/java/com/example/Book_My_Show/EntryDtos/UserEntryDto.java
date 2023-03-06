package com.example.Book_My_Show.EntryDtos;

import javax.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Data
public class UserEntryDto {


    private String name;

    private int age;

    private String email;

    private String mobNo;

    private String address;
}