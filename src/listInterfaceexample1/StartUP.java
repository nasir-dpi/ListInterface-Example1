package listInterfaceexample1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StartUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new LinkedList<>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		for(int i =0;i<n;i++) {
			a.add(i,s.nextLine());	
		}
		System.out.println(a);
	}

}
