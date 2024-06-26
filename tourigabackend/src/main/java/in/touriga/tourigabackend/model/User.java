package in.touriga.tourigabackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Userdetails")
public class User {

    public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Id
    private String userid;
	
    private String emailid;
    private String password;
    
    public boolean verifyPassword(String inputPassword)
    {
    	return this.password.equals(inputPassword);
    }
	public User(String emailid, String password) {
		this.emailid = emailid;
		this.password = password;
	}

    // Getters and setters (generated by Lombok)

    // No-args constructor (generated by Lombok)

    // All-args constructor (generated by Lombok)

    // Other methods as needed
}
