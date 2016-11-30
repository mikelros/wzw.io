package io.wzw.backend.data.dao;

import java.util.List;

import io.wzw.backend.data.model.Meetup;

public interface MeetupDAO extends GenericDAO<Meetup> {
	public Meetup getUserMeetupById(Long idUser, Long idMeetup);

	public List<Meetup> lastEvents(Long idUser, Long idMeetup);
}
