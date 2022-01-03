import java.util.HashMap;
import java.util.Map;

public class Pro3 {

	public static void main(String[] args) {
		Integer[] i = { 1, 3, 4, 5 };
		Map<Integer, Integer> m1 = getMap(i);
		System.out.println(m1.entrySet());
	}

	public static Map<Integer, Integer> getMap(Integer numbers[]) {
		
		Map<Integer, Integer> m = new HashMap();
		for(int i = 0;  i<numbers.length; i++) {
			m.put(numbers[i], (numbers[i]*numbers[i]*numbers[i]));
		}
		return m;
	}

}

