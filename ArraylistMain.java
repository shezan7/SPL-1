package arraylistPackage;

public class ArraylistMain {
	
public static void main(String[] args) {
		
		ArraylistList bsse = new ArraylistList();
		
		bsse.add("Shezan");
		bsse.add("AlMahmud");
		bsse.add("Shezu");
		bsse.add("Rabiul");
		bsse.add("Islam");
		bsse.add("Sujon");
		bsse.add("Hasnatul");
		bsse.add("Jilan");
		bsse.add("Pranto");
		bsse.add("Junaid");
		bsse.add("Mansur");
		
		bsse.print();
		
		System.out.println(bsse.size());
		
		bsse.add(3,"Ibrahim");
		bsse.add(8,"Khalil");
        bsse.print();
		
		System.out.println(bsse.size());
		
		bsse.remove();
		
		bsse.print();
			
		System.out.println(bsse.size());
		
		
		if(bsse.contains("Shezan"))
			System.out.println("Founed!!!");
		else
			System.out.println("Not found!!!");
		
		bsse.remove(3);
		bsse.print();
		System.out.println(bsse.size());
	}

}
