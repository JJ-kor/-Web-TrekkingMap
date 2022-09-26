package com.example.TrekkingMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TrekkingMap.Entity.Map;

@Repository
public interface MapRepository extends JpaRepository<Map, Long>{

}
