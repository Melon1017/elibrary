package foyuang.elibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import foyuang.elibrary.entity.User;
import foyuang.elibrary.service.UserService;

@Controller
public class LoginController {  
	@Autowired
	UserService userService;

	@RequestMapping("/login")
	@ResponseBody
	public List<User> login(HttpSession session, HttpServletRequest arg0) {
		return null;
	}
}
