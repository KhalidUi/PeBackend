package contactmanager.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id ;
	@Column(name="user_name" , nullable=false ,length = 25)
	private String name ;
	
	private String email ;
	private String password ;
	private String about ;
	
}
