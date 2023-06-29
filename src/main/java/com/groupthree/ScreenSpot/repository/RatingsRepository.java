package com.groupthree.ScreenSpot.repository;

import com.groupthree.ScreenSpot.model.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingsRepository extends JpaRepository<Ratings, String> {

    @Query(value = "SELECT * FROM screenspot.Ratings WHERE user_id = :user_id", nativeQuery = true)
    List<Ratings> findByUserId(@Param("user_id") long user_id);

    @Query(value = "SELECT * FROM screenspot.Ratings WHERE item_id = :item_id", nativeQuery = true)
    List<Ratings> findByItemId(@Param("item_id") long item_id);

}
