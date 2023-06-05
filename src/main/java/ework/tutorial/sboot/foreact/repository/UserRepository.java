package ework.tutorial.sboot.foreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ework.tutorial.sboot.foreact.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
