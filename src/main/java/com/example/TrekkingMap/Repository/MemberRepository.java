package com.example.TrekkingMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TrekkingMap.Entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

}
