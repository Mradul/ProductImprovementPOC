package com.onpoint.copyarchive.state;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StateServiceImpl implements StateService {
@Autowired
private StateRepo stateRepo;
	@Override
	public List<State> addState(State state) {
		stateRepo.save(state);
		return listAllStates();
	}
	
	@Override
	public List<State> listAllStates() {
		
		return  (List<State>) stateRepo.findAll();
	}
}
