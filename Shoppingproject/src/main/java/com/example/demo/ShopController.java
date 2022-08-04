package com.example.demo;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	@RequestMapping(method = RequestMethod.GET, value = "/forms1")
	public ModelAndView websearch1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
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
			mv.setViewName("welcome");
			return mv;
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

}