package com.example.TrekkingMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TrekkingMap.Entity.MemberMap;

@Repository
public interface MemberMapRepository extends JpaRepository<MemberMap, Long>{

}
