package com.mydating.dating.repostory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mydating.dating.entity.User;
import com.mydating.dating.util.UserGender;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	//Method name convention
	List<User> findByGender(UserGender male);
	
	@Query("select u from User u where u.name like ?1")
	List<User> searchByName(String letters);

}
