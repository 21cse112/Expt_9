/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_no9;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author csesu
 */
public class Ex_no9  
{
	public static void main(String args[]) throws IOException
	{
		FileReader f1=new FileReader("sample.txt");
		FileWriter f2=new FileWriter("new.txt");
		int read;
		while((read=f1.read())!=-1)
		{
			f2.write(Character.toLowerCase(read));
		}
		f1.close();
		f2.close();
		System.out.print("Successfully Done");
	}
}
