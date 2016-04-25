package com.onpoint.copyarchive.infosetcolumns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/InfosetColumn/")
public class InfosetColumnController {
@Autowired
IInfosetColumnService icService;

	@RequestMapping(value="infoset/{infosetId}",method=RequestMethod.GET)
	public List<InfosetColumn> getColumns(@PathVariable("infosetId") int infosetId){
		
		return icService.findByInfoset(infosetId);
	}
}
