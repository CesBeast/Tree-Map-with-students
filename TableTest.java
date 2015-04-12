package Assign1;

public class TableTest {

	public static void main(String[] args) throws TableException {
		Table<Integer, String> myTable = new Table<Integer,String>();
		
		// Make 10 student objects
		Student tester = new Student(100,"daniel",50,"buisness");
		Student tester1 = new Student(30,"joe",25,"comp sci");
		Student tester2= new Student(25,"hellen",90,"mathematics");
		Student tester3 = new Student(26,"alex",30,"philosopjy");
		Student tester4= new Student(56,"jim",56,"engineering");
		Student tester5= new Student(34,"terri",45,"cosmetology");
		Student tester6= new Student(12,"christina",34,"physics");
		Student tester7= new Student(76,"jerry",20,"engineering");
		Student tester8= new Student(100,"kate",80,"mechanics");
		Student tester9= new Student(78,"jack",65,"radiography");
		
		// Test if treemap is empty
		System.out.println("Testing if Table is Empty...");
		if(myTable.isEmpty() != true)
			System.out.println("Table is not empty");
		else
			System.out.println("Table is empty");
		System.out.println(" ");
		
		// Add to tree map
		System.out.println("Adding 10 Student (2 students have same ID to test Exception...)");
		myTable.tableInsert(tester.getStudentID(), tester.getName());
		myTable.tableInsert(tester1.getStudentID(), tester1.getName());
		myTable.tableInsert(tester2.getStudentID(), tester2.getName());
		myTable.tableInsert(tester3.getStudentID(), tester3.getName());
		myTable.tableInsert(tester4.getStudentID(), tester4.getName());
		myTable.tableInsert(tester5.getStudentID(), tester5.getName());
		myTable.tableInsert(tester6.getStudentID(), tester6.getName());
		myTable.tableInsert(tester7.getStudentID(), tester7.getName());
		try {
			myTable.tableInsert(tester8.getStudentID(), tester8.getName());//this student has same key as first student. it is not add to tree.
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		myTable.tableInsert(tester9.getStudentID(), tester9.getName());
		System.out.println(" ");
		
		
		// Prints the size of Table, should be 9.

		System.out.println("Size of table is:"+myTable.size());
		System.out.println(" ");
		
		// Test if treemap is empty
		System.out.println("Testing if Tree is Empty...");
		if(myTable.isEmpty() != true)
			System.out.println("Table is not empty");
		else
			System.out.println("Table is empty");
		System.out.println(" ");
		
		// Checks if key 100 and key 200 is in table.
		System.out.println("Testing if Table Contains Keys 100 and 200...");
		if(myTable.tableDelete(100)==true)
		System.out.println("FOUND: Key 100 is in the Table");
		else
			System.out.println("NOT FOUND: Key 100 is NOT in the tree");
		System.out.println(" ");
		
		if(myTable.tableDelete(200)==true)
			System.out.println("FOUND: Key 200 is in the tree");
			else
				System.out.println("NOT FOUND: Key 200 is NOT in the tree");
		System.out.println(" ");
		
		//retrieves key 30
		System.out.println("Testing Table Retrieve for Key 30...");
		System.out.println("The student name associated with ID Number 30 is: "+myTable.tableRetrieve(30));
		System.out.println(" ");
		
		//prints table
		System.out.println("Testing Table Print...");
		myTable.printTable();
	}

}
