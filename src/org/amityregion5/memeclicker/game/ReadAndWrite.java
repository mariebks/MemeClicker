package org.amityregion5.memeclicker.game;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ReadAndWrite {
	public static int[] load() throws NumberFormatException, IOException {
		int[] returner = new int[19];
		BufferedReader f = new BufferedReader(new FileReader("cookie.txt"));
		String line = "";
		for (int i = 0; i < 20; i++) {
			line = f.readLine();
			if (line.equals("") == false) {
				returner[i] = Integer.parseInt(f.readLine());
			} else {
				int[] emptyReturn = new int[1];
				return emptyReturn;
			}
		}
		f.close();
		return returner;
	}
	
	public void save(int[] save) throws IOException {
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cookie.txt")));
		 for(int i: save){
			 out.println(i);
		 }
		 out.close();
	}
}
