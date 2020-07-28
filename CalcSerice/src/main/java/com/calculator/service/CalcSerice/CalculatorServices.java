package com.calculator.service.CalcSerice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorServices {
	
	@GetMapping("/add/{x}/{y}")
	public Response add(@PathVariable int x, @PathVariable int y)
	{
		//return x+y;
		return new Response(x, y, x+y);
	}
	
	@GetMapping("/sub/{x}/{y}")
	public Response sub(@PathVariable int x, @PathVariable int y)
	{
		//return x+y;
		//Test
		return new Response(x, y, x-y);
	}
}
