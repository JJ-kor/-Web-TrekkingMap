package com.example.TrekkingMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TrekkingMap.Entity.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long>{

}
