package com.cg.pro1.bean;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader input = null;
		BufferedReader br = null;
		FileWriter output = null;
		BufferedWriter o = null;
		try {
			input = new FileReader("C:\\Users\\BRAJMISH\\Documents\\Brajesh Mishra\\input.txt");
			br = new BufferedReader(input);
			String s = br.readLine();
			output = new FileWriter("C:\\Users\\BRAJMISH\\Documents\\Brajesh Mishra\\output1.txt");
			o = new BufferedWriter(output);
			String s1[] = s.split("\\s");
			for (String s2 : s1) {
				StringBuilder string = new StringBuilder(s2);
				string.reverse();
				String s3 = new String(string);
				o.write(s3 + " ");
				System.out.println(s3 + " ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

			o.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}