package io.wzw.backend.data.dao;


import java.util.List;

import io.wzw.backend.data.model.Meetup;

public interface MeetupDAO extends GenericDAO<Meetup>{
	public List<Meetup> lastEvents (Long idUser, Long idMeetup);
}
