package com.onpoint.copyarchive.infosets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class InfosetService implements IInfosetService {
@Autowired
private InfosetRepo infosetRepo;
	@Override
	public List<Infoset> listAllInfosets(int state) {
		
		return (List<Infoset>) infosetRepo.findAll();
	}

}
