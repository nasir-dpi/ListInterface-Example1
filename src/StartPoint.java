import java.util.ArrayList;
import java.util.List;

public class StartPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new ArrayList<String>();
		a.add("01");
		a.add("Smith");
		a.add("Maxyel");
		a.add(3, "3rd position");
		a.set(2,"Serial");
		a.remove(1);
		for(int i=0;i<a.size();i++)
		System.out.println(a.get(i));
		
	}

}
