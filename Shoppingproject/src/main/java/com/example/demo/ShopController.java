package com.example.demo;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/sc")
public class ShopController {
	@Autowired
	private ShopServices services;
	public ShopServices getServices() {
		return services;
	}
	public void setService(ShopServices services) {
		this.services = services;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/reg")
	public ModelAndView websearch(Shopping sh) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("userObj",sh);
		mv.setViewName("register");
		return mv;
	}
	@RequestMapping(method=RequestMethod.POST,value="/reg")
	public ModelAndView processForm(@Valid@ModelAttribute("userObj")Shopping sh,BindingResult rs,HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		if(rs.hasErrors()) {
			mv.setViewName("register");
			return mv;
		}
		System.out.println("Username...:"+sh.getName());
		String pass=request.getParameter("pass");
		String pass2=request.getParameter("pass2");
		if(pass.equals(pass2)) {
			List<Shopping> li=services.checkUID(sh);
			Iterator<Shopping> itr=li.iterator();
			int b=0;
			while(itr.hasNext()) {
				b=itr.next().getId();
		}
			System.out.println(b);
			sh.setId(b+1);
		sh.setPass(pass);
		mv.addObject("userObj",sh);
		services.saveUser1(sh);
		mv.setViewName("login");
		return mv;	
		}
		else {
			
			mv.setViewName("error");
			
			return mv;

		}
	}
	@RequestMapping(method=RequestMethod.GET,value="/forms1")
	public ModelAndView websearch1() {
		ModelAndView mandv=new ModelAndView();
		mandv.setViewName("login");
		return mandv;
	}
	@RequestMapping(method = RequestMethod.POST, value = "/forms1")
	public ModelAndView welcome1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		System.out.println(name + ":" + pass);
		List<Shopping> c = services.checkUser(name, pass);
		Iterator<Shopping> itr = c.iterator();
		while (itr.hasNext()) {
			if (itr.next().getFlag() == 0) {
				mv.setViewName("welcome");
				services.updateFlag(1, name, pass);
				return mv;
			} else {
				mv.setViewName("logout");
				return mv;
			}
		}
		
		mv.setViewName("error");
		return mv;
	}
	@RequestMapping(method = RequestMethod.POST, value = "/shop")
	public String shop(Shopping sh,HttpServletRequest request) {
		Enumeration<String> em = request.getParameterNames();
		HttpSession hs = request.getSession();
	
		while (em.hasMoreElements()) {
			String a = em.nextElement().toString();
			String b = request.getParameter(a);
			hs.setAttribute(a, b);
		}
		return request.getParameter("shop");
	
		
		
	}
	@RequestMapping(method = RequestMethod.GET,value = "/shopimg")
	public void met(HttpServletRequest request,HttpServletResponse response) {
		
		  response.setContentType("image/jpg");
		  String name =request.getParameter("name");
		  String shopname =request.getParameter("shopname");
		  try {
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anound","root","root");
		  String sql = "SELECT * FROM "+shopname+" WHERE name =?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  
		  ps.setString(1, name);
		   ResultSet rs = ps.executeQuery();
		   if(rs.next()){
		    byte [] imageData = rs.getBytes("img");
		    OutputStream os = response.getOutputStream();
		             os.write(imageData);
		             os.flush();
		             os.close();
		   }
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		  
		 }
	

}