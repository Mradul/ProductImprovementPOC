package com.onpoint.copyarchive.infosetcolumns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onpoint.copyarchive.infosets.Infoset;

@Service
public class InfosetColumnService implements IInfosetColumnService {
@Autowired
private InfosetColumnsRepo icRepo;
	@Override
	public List<InfosetColumn> findByInfoset(int infosetId) {
		Infoset infoset = new Infoset();
		infoset.setInfosetId(infosetId);
		return icRepo.findByInfoset(infoset);
	}

}
