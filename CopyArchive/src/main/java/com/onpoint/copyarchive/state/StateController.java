package com.onpoint.copyarchive.state;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/states/")
public class StateController {
@Autowired
private StateService ss;
	@RequestMapping(method=RequestMethod.GET)
	public List<State> listAllStates(){
		return ss.listAllStates();
	}
	
	@RequestMapping(value="set/{stateid}",method=RequestMethod.POST)
	public void setState(@PathVariable("stateid") Integer stateId,HttpServletRequest req,HttpServletResponse response){
		req.getSession().setAttribute("state", stateId);
		
	}
}
