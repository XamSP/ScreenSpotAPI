package com.groupthree.ScreenSpot.repository;

import com.groupthree.ScreenSpot.model.Movie;
import com.groupthree.ScreenSpot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
    @Query(value = "SELECT * FROM screenspot.Movie WHERE id = :id", nativeQuery = true)
    List<Movie> findById(@Param("id") long id);

    @Query(value = "SELECT * FROM screenspot.Movie WHERE title = :title", nativeQuery = true)
    List<Movie> findByTitle(@Param("title") String title);

    @Query(value = "SELECT * FROM screenspot.Movie WHERE genre = :genre", nativeQuery = true)
    List<Movie> findGenre(@Param("genre") String genre);

}
