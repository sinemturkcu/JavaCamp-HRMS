package kodlama.io.hrms.entities.concretes;


import java.lang.annotation.Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_positions")

public class JobPositions{
	
	@Id 
	@GeneratedValue
	@Column(name="user_id")
	private int user_id;
	
	@Column (name="positions_name")
	private String positions_name;
	
	public JobPositions(int user_id, String positions_name) {
		super();
		this.setUser_id(user_id);
		this.setPositions_name(positions_name);
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getPositions_name() {
		return positions_name;
	}

	public void setPositions_name(String positions_name) {
		this.positions_name = positions_name;
	}




	
	

}
