package com.example.TrekkingMap.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Map {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAP_ID")
	private Long idAuto;

	private String name;
	private String start;
	private String dest;
	private Double distance;

	@OneToMany(mappedBy = "member", fetch = FetchType.EAGER)
	private List<MemberMap> memberMaps;

	@OneToMany(mappedBy = "map", fetch = FetchType.EAGER)
	private Set<Coord> coords = new HashSet<>();

	@OneToMany(mappedBy = "map", fetch = FetchType.EAGER)
	private Set<Photo> photos = new HashSet<>();

	private Boolean isCompleted;

	public Long getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(Long idAuto) {
		this.idAuto = idAuto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public List<MemberMap> getMemberMaps() {
		return memberMaps;
	}

	public void setMemberMaps(List<MemberMap> memberMaps) {
		this.memberMaps = memberMaps;
	}

	public Set<Coord> getCoords() {
		return coords;
	}

	public void setCoords(Set<Coord> coords) {
		this.coords = coords;
	}

	public Set<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(Set<Photo> photos) {
		this.photos = photos;
	}

	public Boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

}
