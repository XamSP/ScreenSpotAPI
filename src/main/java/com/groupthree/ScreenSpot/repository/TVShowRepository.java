package com.groupthree.ScreenSpot.repository;

import com.groupthree.ScreenSpot.model.Band;
import com.groupthree.ScreenSpot.model.Movie;
import com.groupthree.ScreenSpot.model.TVShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TVShowRepository extends JpaRepository<TVShow, String> {

    @Query(value = "SELECT * FROM screenspot.TVShow WHERE id = :id", nativeQuery = true)
    List<TVShow> findById(@Param("id") long id);

    @Query(value = "SELECT * FROM screenspot.TVShow WHERE title = :title", nativeQuery = true)
    List<TVShow> findByTitle(@Param("title") String title);

    @Query(value = "SELECT * FROM screenspot.TVShow WHERE genre = :genre", nativeQuery = true)
    List<TVShow> findGenre(@Param("genre") String genre);
}
