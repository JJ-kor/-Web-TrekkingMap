package com.example.TrekkingMap.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.TrekkingMap.Repository.MemberRepository;

@Service
@Transactional
public class MemberService {

	@Autowired
	MemberRepository memberRepository;
}
