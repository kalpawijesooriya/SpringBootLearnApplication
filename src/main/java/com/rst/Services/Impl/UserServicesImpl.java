package com.rst.Services.Impl;

import com.rst.Services.UserServices;
import com.rst.domain.UserDTO;
import com.rst.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserDTO> findAllUsers() {
       List<UserDTO> allUsers= userRepository.findAll();
        return allUsers;
    }
    @Override
    public String SaveUser(UserDTO userData) {
        userRepository.save(userData);
        return "Saved Data";
    }

    @Override
    public  List<UserDTO> isUser(String email)
    {
        List<UserDTO> allUsers= userRepository.findAll();
        return allUsers;
    }


}
