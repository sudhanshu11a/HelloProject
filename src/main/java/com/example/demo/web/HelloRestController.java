/**
 * 
 */
package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sudhanshusharma
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloRestController {

	@GetMapping
	public String hello() {
		return "Hello";
	}
}
