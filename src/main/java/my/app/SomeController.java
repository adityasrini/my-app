package my.app;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class SomeController {
	SomeService someService;
	
	public SomeController(SomeService someService) {
		this.someService = someService;
	}
	
	@Get("/")
	public String getHello(){
		System.out.println(someService.toString());
		return "hello";
	}
}
