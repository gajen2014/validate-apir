package com.validate.repository;

import com.validate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



public interface UserRepository extends JpaRepository<User,Long> {







}
