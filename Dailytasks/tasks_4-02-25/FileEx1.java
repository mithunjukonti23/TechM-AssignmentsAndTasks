//copying on
package com.files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile=new File("src//com//files//input.dat");
		File outFile=new File("src/com///files//output.dat");
		
		FileInputStream fis= null;
		FileOutputStream fos= null;
		
		try
		{
			fis = new FileInputStream(inFile);
			fos = new FileOutputStream(outFile);
			
			int ch;
			while((ch=fis.read())!=-1) {
			fos.write(ch);
		}
		System.out.println("Output File Created");
		System.out.println("Successfully copied");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		finally
		{
			try {
				if(fis!=null)
					fis.close();
				if(fos!=null)
					fos.close();			
			}
			catch(IOException ioe)
			{				
				System.out.println(ioe);				
			}
			
			
		}
	}

}
