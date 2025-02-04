package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Colex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names= new ArrayList<>();
		names.add("mithun");
		names.add("mittu");
		names.add("bobby");
		names.add("viva");
		Iterator<String> it=names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}


