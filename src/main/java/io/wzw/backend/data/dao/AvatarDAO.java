package io.wzw.backend.data.dao;

import java.util.List;

import io.wzw.backend.data.model.Avatar;

public interface AvatarDAO {

	public Avatar selectById(Integer id);

	public List<Avatar> selectAll();

	public void insert(Avatar avatar);

	public void update(Avatar avatar);

	public void delete(Avatar avatar);
}
