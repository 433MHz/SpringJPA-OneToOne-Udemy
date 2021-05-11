package pl.krystian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	@Autowired
	CreateDemo createDemo;
	
	@PostMapping("/saveEntity")
	public void saveEntity() {		
		createDemo.commit();
	}
}
