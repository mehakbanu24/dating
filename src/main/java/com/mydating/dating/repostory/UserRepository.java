package com.mydating.dating.repostory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydating.dating.entity.User;
import com.mydating.dating.util.UserGender;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	//Method name convention
	List<User> findByGender(UserGender male);

}
