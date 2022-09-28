package com.example.TrekkingMap;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.TrekkingMap.Entity.Coord;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@SpringBootTest
class TrekkingMapApplicationTests {

	@Test
	public void gsonTest() {
		String example = "[{seq=0, lat=37.773212, lan=126.9728421, isPhotoZone=false, name=null, path=null, address=null}, {seq=1, lat=37.5492598, lan=127.0318936, isPhotoZone=false, name=null, path=null, address=null}]";

		Gson gson = new Gson();
		List<Coord> coords = gson.fromJson(example, new TypeToken<List<Coord>>() {
		}.getType());
		System.out.println(coords);
	}

}
