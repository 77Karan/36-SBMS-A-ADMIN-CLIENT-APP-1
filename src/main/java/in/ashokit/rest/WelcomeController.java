package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController 
{
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		return "Hi KL Welocme Back to RCB";
	}

}
