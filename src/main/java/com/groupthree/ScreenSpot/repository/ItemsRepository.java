package com.groupthree.ScreenSpot.repository;

import com.groupthree.ScreenSpot.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Items, String> {
    @Query(value = "SELECT * FROM screenspot.Items WHERE id = :id", nativeQuery = true)
    List<Items> findById(@Param("id") long id);

    @Query(value = "SELECT * FROM screenspot.Items WHERE title = :title", nativeQuery = true)
    List<Items> findByTitle(@Param("title") String title);

    @Query(value = "SELECT * FROM screenspot.Items WHERE genre = :genre", nativeQuery = true)
    List<Items> findGenre(@Param("genre") String genre);

}
