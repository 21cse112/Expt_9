/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_no9.pkg2;
import java.io.*;
import java.util.*;
/**
 *
 * @author csesu
 */


public class Pro2 {
	
   public static void main(String[] args) 
   {

	   Scanner input = new Scanner(System.in);

               System.out.print("Enter the name of the file:");

               String file_name = input.nextLine();

                File f = new File(file_name);

                if(f.exists())

                		System.out.println("The file " +file_name+ " exists");

                else

                        System.out.println("The file " +file_name+ " does not exist");

                if(f.exists()){

                	if(f.canRead())

                			System.out.println("The file " +file_name+ " is readable");
                else

                			System.out.println("The file " +file_name+ " is not readable");

                if(f.canWrite())

                			System.out.println("The file " +file_name+ " is writeable");

               else

            	   			System.out.println("The file " +file_name+ " is not writeable");

               System.out.println("The file type is: " +file_name.substring(file_name.indexOf('.')+1));

              System.out.println("The Length of the file:" +f.length());

        }

    }

}
