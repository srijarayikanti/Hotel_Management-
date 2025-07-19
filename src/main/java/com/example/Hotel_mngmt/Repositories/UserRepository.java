package com.example.Hotel_mngmt.Repositories;

import com.example.Hotel_mngmt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
