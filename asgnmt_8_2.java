import java.util.*;
public class asgnmt_8_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		hm.put(1, "Deepak");
		hm.put(23, "Govindan");
		hm.put(5,"Philips");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey() + "  " + m.getValue());
		}
		

	}

}
