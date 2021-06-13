
public class ProjectTest {

	public static void main(String[] args) {
		ProjectClass theFirst = new ProjectClass();
		System.out.println(theFirst.elevatorPitch("One Piece", " is awesome!"));
		theFirst.setName("Omarioo");
		theFirst.setDesc(" is a bish");
		System.out.print(theFirst.getName());
		System.out.println(theFirst.getDesc());
	}
}
