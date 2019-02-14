package com.rst.repository;

import com.rst.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.xml.stream.events.DTD;
import java.util.List;

public interface UserRepository extends JpaRepository<UserDTO,Integer>  {


}
