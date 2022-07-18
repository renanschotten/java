package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
	public static void main(String[] args) {
		String path = "C:\\Users\\re_sc\\Documents\\programacao\\java\\ws-eclipse\\map\\in.txt";
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);
				if (map.containsKey(name)) {
					int n = map.get(name);
					map.put(name, n + votes);
				} else {
					map.put(name, votes);
				}
				line = br.readLine();
			}

			for (String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
