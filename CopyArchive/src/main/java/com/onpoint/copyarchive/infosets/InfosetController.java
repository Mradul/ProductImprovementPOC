package com.onpoint.copyarchive.infosets;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class InfosetController {
@Autowired
IInfosetService is;
	@RequestMapping(method=RequestMethod.GET,value="/infoset/")
	public String home(Model model,HttpServletRequest req){
		//req.getSession().setAttribute("state", "MA");
		
		int state=1;
		if(req.getSession().getAttribute("state")!=null)
			state=(int) req.getSession().getAttribute("state");
		model.addAttribute("infosets", is.listAllInfosets(state));
		return "infoset-home";
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/infoset/")
	public @ResponseBody Infoset getAnInfoset(){
		
		
	}
}
