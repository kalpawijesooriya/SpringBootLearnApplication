package com.rst.Services;

import com.rst.domain.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserServices {


  List<UserDTO> findAllUsers();
  String SaveUser(UserDTO userData) ;
  List<UserDTO> isUser(String email);
}
