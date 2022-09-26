package com.example.TrekkingMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TrekkingMap.Entity.Coord;

@Repository
public interface CoordRepository extends JpaRepository<Coord, Long>  {

}
