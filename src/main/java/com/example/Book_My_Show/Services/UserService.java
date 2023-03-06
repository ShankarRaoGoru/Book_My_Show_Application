package com.example.Book_My_Show.Services;

import com.example.Book_My_Show.Entities.UserEntity;
import com.example.Book_My_Show.EntryDtos.UserEntryDto;
import com.example.Book_My_Show.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserEntity.builder().age(userEntryDto.getAge()).name(userEntryDto.getName()).mobNo(userEntryDto.getMobNo())
                        .email(userEntryDto.getEmail()).address(userEntryDto.getAddress()).build();

        userRepository.save(userEntity);

        return "User Added successfully";

    }



}
