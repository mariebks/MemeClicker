package org.amityregion5.memeclicker.game;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class SaveAndLoad {
	public int[] load() throws NumberFormatException, IOException{
		int[] returner = new int[17];
		BufferedReader f = new BufferedReader(new FileReader("cookie.in"));
		for(int i = 0;i<17;i++){
			returner[i] = Integer.parseInt(f.readLine());
		}
		f.close();
		return returner;
	}
	public void save(int[] save) throws IOException{
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cookie.in")));
		 for(int i: save){
			 out.println(i);
		 }
		 out.close();
	}
}
