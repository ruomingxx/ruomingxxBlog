package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jason
 * on 8/21/2017.
 */


@RestController
public class TestController {

	@RequestMapping

	public ResponseEntity<String> home(){


        System.out.println(123);

		return ResponseEntity.ok("Hello 1");
	}

}
