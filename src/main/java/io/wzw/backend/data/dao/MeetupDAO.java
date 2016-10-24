package io.wzw.backend.data.dao;

import java.util.List;

import io.wzw.backend.data.model.Meetup;

public interface MeetupDAO {

	public Meetup selectById(Integer id);

	public List<Meetup> selectAll();

	public void insert(Meetup meetup);

	public void update(Meetup meetup);

	public void delete(Meetup meetup);
}
