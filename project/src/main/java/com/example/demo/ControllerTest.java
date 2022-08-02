package com.example.demo;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/form")
public class ControllerTest {
	@Autowired
	MessageSource ms;
	
	@Autowired
	private User1Services services;
	public User1Services getServices() {
		return services;
	}
	public void setService(User1Services service) {
		this.services = service;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/register")
	public ModelAndView websearch() {
		
		ModelAndView mandv=new ModelAndView();
		User1 us=new User1();
		us.setFlag(0);
		int a=us.getUid()+1;
		us.setUid(a);
		mandv.addObject("userObj", us);
		mandv.setViewName("register");
		return mandv;
	}
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public ModelAndView processForm(@Valid@ModelAttribute("userObj") User1 us,BindingResult rs,HttpServletRequest request) {
		ModelAndView mandv=new ModelAndView();
		
		
		System.out.println("Username...:"+us.getUname());
		String pass1=request.getParameter("pass1");
		String pass2=request.getParameter("pass2");
		if(pass1.equals(pass2)) {
			List<User1> li=services.checkUID(us);
			Iterator<User1> itr=li.iterator();
			int b=0;
			while(itr.hasNext()) {
				b=itr.next().getUid();
			}
			System.out.println(b);
			us.setUid(b+1);
		us.setUpass(pass1);
		mandv.addObject("myuser",us);
		services.saveUser1(us);
		mandv.setViewName("welcome");
		return mandv;
	}
else {
	
	mandv.setViewName("error");
	
	return mandv;
	
}

}
@RequestMapping(method=RequestMethod.GET,value="/register1")
public ModelAndView websearch1() {
	ModelAndView mandv=new ModelAndView();
	mandv.setViewName("login");
	return mandv;
}
@RequestMapping(method = RequestMethod.POST,value = "/register1")
public ModelAndView welcome1(HttpServletRequest request) {
	
	ModelAndView mv=new ModelAndView();
	
	String name=request.getParameter("uname");
	
	String pass=request.getParameter("pass");
	
	System.out.println(name+":"+pass);
	
	List<User1> u=services.checkUser(name, pass);
	
	Iterator<User1> itr=u.iterator();
	
	while(itr.hasNext()) {
		
		mv.setViewName("welcome");
		
		return mv;
		
	}
	
	mv.setViewName("error");
	
	return mv;
	
}
}