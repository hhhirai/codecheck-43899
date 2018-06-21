package codecheck;

import java.util.HashMap;
import java.util.Map;



public class App {
	public static void main(String[] args) {

		int card_num = Integer.parseInt(args[0]);
		int mp = Integer.parseInt(args[1]);
		Map<Integer, Integer> in_map = new HashMap<Integer, Integer>();

		for (int i = 2, l = args.length; i < l; i+=2) {

			int point = Integer.parseInt(args[i]);
			int cost = Integer.parseInt(args[i+1]);

			in_map.put(point, cost);
		}
		in_map.entrySet().stream()
		.sorted(java.util.Collections.reverseOrder(java.util.Map.Entry.comparingByKey()));

		System.out.println(in_map);

	}

}
