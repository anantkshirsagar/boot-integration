package in.sb.security.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/home")
	public String getHomePage() {
		return "home.html";
	}

	@RequestMapping("/login")
	public String getLoginForm() {
		return "login.html";
	}

	@RequestMapping("/logout-success")
	public String getLogoutForm() {
		return "logout.html";
	}
}
