package com.onpoint.copyarchive.infosets;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface InfosetRepo extends CrudRepository<Infoset, Integer>{
	public List<Infoset> findByState(int state);
}
