package com.onpoint.copyarchive.infosetcolumns;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onpoint.copyarchive.infosets.Infoset;

public interface InfosetColumnsRepo extends CrudRepository<InfosetColumn, Integer>{
	public List<InfosetColumn> findByInfoset(Infoset infoset);
}
