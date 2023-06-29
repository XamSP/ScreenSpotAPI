package com.groupthree.ScreenSpot.repository;

import com.groupthree.ScreenSpot.model.Band;
import com.groupthree.ScreenSpot.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BandRepository extends JpaRepository<Band, String> {

    @Query(value = "SELECT * FROM screenspot.Band WHERE id = :id", nativeQuery = true)
    List<Band> findById(@Param("id") long id);

    @Query(value = "SELECT * FROM screenspot.Band WHERE name = :name", nativeQuery = true)
    List<Band> findByName(@Param("name") String name);

    @Query(value = "SELECT * FROM screenspot.Band WHERE genre = :genre", nativeQuery = true)
    List<Band> findGenre(@Param("genre") String genre);
}
