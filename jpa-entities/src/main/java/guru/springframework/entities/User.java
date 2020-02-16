package guru.springframework.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class User {
	
	@Id
	private Long id;
	
	private String firstName;
	private String lastName;
	private String email;

}
