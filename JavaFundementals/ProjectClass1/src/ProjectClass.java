
public class ProjectClass {
		String name;
		String description;
		
	public String elevatorPitch(String name, String description){
		return(String.format(name +":"+description));
	}
	public ProjectClass(){	
		System.out.println("It works");
	}
	public ProjectClass(String name){	
	}
	public ProjectClass(String name, String description){	
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public String getName() {
		return(name);
	}
	public void setDesc(String newDesc) {
		this.description = newDesc;
	}
	public String getDesc() {
		return(description);
	}
}