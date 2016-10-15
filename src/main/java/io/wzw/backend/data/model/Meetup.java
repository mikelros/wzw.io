package io.wzw.backend.data.model;

import java.util.Date;

public class Meetup {
	private Integer id;
	private String name;
	private String description;
	private Date since;
	private Date meetup_date;
	private Integer open;
	private Float latitude;
	private Float languitude;
	private Integer idUser;
	
	public Meetup() {
	}

	public Meetup(Integer id, String name, String description, Date since, Date meetup_date, Integer open,
			Float latitude, Float languitude, Integer idUser) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.since = since;
		this.meetup_date = meetup_date;
		this.open = open;
		this.latitude = latitude;
		this.languitude = languitude;
		this.idUser = idUser;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getSince() {
		return since;
	}

	public void setSince(Date since) {
		this.since = since;
	}

	public Date getMeetup_date() {
		return meetup_date;
	}

	public void setMeetup_date(Date meetup_date) {
		this.meetup_date = meetup_date;
	}

	public Integer getOpen() {
		return open;
	}

	public void setOpen(Integer open) {
		this.open = open;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLanguitude() {
		return languitude;
	}

	public void setLanguitude(Float languitude) {
		this.languitude = languitude;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	
	
	
}
