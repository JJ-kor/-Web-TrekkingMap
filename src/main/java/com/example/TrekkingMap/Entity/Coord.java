package com.example.TrekkingMap.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Coord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COORD_ID")
	private Long idAuto;

	private Integer seq;
	private Double lat;
	private Double lan;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MAP_ID")
	private Map map;

	public Long getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(Long idAuto) {
		this.idAuto = idAuto;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLan() {
		return lan;
	}

	public void setLan(Double lan) {
		this.lan = lan;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Coord [idAuto=" + idAuto + ", seq=" + seq + ", lat=" + lat + ", lan=" + lan + ", map=" + map + "]";
	}

}
