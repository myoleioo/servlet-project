
import java.io.Serializable;
import java.util.ArrayList;

public class UserBean2 implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String dob;
	private String gender;
	private ArrayList<?> pl;
	private String course;
	public UserBean2() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ArrayList<?> getPl() {
		return pl;
	}
	public void setPl(ArrayList<?> pl) {
		this.pl = pl;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
