
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello, Projet de test pour SonarQube !!!");

	}
	
	private String field;

	  public void use() {
	    System.exit(33); // violation on findbugs rule: DM_EXIT
	  }

	  public void useFieldForLcom4() {
	    System.out.println(field);
	  }

}
