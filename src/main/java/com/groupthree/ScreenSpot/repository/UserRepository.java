package com.groupthree.ScreenSpot.repository;

import com.groupthree.ScreenSpot.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "SELECT * FROM screenspot.User WHERE id = :id", nativeQuery = true)
    List<User> findById(@Param("id") long id);

    @Query(value = "SELECT * FROM screenspot.User", nativeQuery = true)
    List<User> findAllUsers();
}
