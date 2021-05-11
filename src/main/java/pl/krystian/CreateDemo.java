package pl.krystian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.krystian.entity.Instructor;
import pl.krystian.entity.InstructorDetail;
import pl.krystian.repositories.InstructorRepository;

@Component
public class CreateDemo {
	
	@Autowired
	private InstructorRepository instructorRepository;
		
	public void commit() {
		
		Instructor instructor = new Instructor("Krystian", "Izdebski", "krystian@gmail.com");
		InstructorDetail instructorDetail = new InstructorDetail("linkURL", "Codding");
		
		instructor.setInstructorDetail(instructorDetail);
		
		instructorRepository.save(instructor);
		
	}
	
}
