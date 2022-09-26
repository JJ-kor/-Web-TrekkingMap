package com.example.TrekkingMap.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.TrekkingMap.Entity.Coord;
import com.example.TrekkingMap.Repository.CoordRepository;


@Service
@Transactional
public class CoordService {

	@Autowired
	CoordRepository coordRepository;
	
	public void saveDictionary(Coord coord) {
		coordRepository.save(coord);
	}
}
