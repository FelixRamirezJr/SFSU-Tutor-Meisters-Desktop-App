/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guiapp;

/**
 *
 * @author Felix
 */
import java.io.*;
import java.util.*;

public class FileIO 
{
	File inFile;
	File outFile;
	public int nLines;
	
	public void FileProperties(File file)
	{
	    System.out.println("Does it exist? " + file.exists());
	    System.out.println("Can it be read? " + file.canRead());
	    System.out.println("Can it be written? " + file.canWrite());
	    System.out.println("Is it a directory? " + file.isDirectory());
	    System.out.println("Is it a file? " + file.isFile());
	    //Prints false
	    System.out.println("Is it absolute? " + file.isAbsolute());
	    System.out.println("Is it hidden? " + file.isHidden());

	    // See this discussion for a description of Absolute vs Canonical
	    // http://www.velocityreviews.com/forums/t130635-canonical-or-absolute-path.html
	    //Shows redundant .'s in the path.
	    System.out.println("What is its absolute path? " + file.getAbsolutePath());

	    //Like absolute path without redundant .'s.
	    try 
	    {
	      System.out.println("What is its canonical path? " + file.getCanonicalPath());
	    }
	    catch (IOException ex) { }

	    System.out.println("What is its name? " + file.getName());
	    //Prints the path as defined during instantiation of the File class.
	    System.out.println("What is its path? " + file.getPath());

	    //lastModified() returns a long value representing the date and time
	    // when the file was last modified. The value is in milliseconds
	    // measured from 1/1/1970 to last modified date/time.
	    System.out.println("When was it last modified? " + new Date(file.lastModified()));

	    // Character representation of the path-list separator that's used
	    // when multiple file paths are given in said path-list.
	    System.out.println("What is the path separator? " + File.pathSeparatorChar);

	    // Character representation of the separator used in a given
	    // file path.
	    System.out.println("What is the name separator? " + File.separatorChar);
		
	}
	
	public long ReadFile(String sfile,ArrayList<String> str) throws IOException 
	{
		inFile  = new File(sfile);
		//FileProperties(inFile);
        BufferedReader reader = new BufferedReader(new FileReader(inFile));
        //... Loop as long as there are input lines.
        String sline = null;
        int count = 0;
        while ((sline=reader.readLine()) != null) 
        {     	
        	//System.out.println(sline);
        	str.add(sline);
        	count++;
        }
        this.nLines = count;
        //... Close reader and writer.
        reader.close();  // Close to unlock.
        return inFile.length();
    }
	
	public long WriteFile(String sinfile,String soutfile) throws IOException 
	{
		
		File inFile  = new File(sinfile);
        BufferedReader reader = new BufferedReader(new FileReader(inFile));
		File toFile  = new File(soutfile);
		BufferedWriter writer = new BufferedWriter(new FileWriter(toFile));

		//... Loop as long as there are input lines.
		String line = null;
		while ((line=reader.readLine()) != null) 
		{
			writer.write(line);
			writer.newLine();   // Write system dependent end of line.
		}

		//... Close reader and writer.
		reader.close();  // Close to unlock.
		writer.close();  // Close to unlock and flush to disk.
		return toFile.length();
	}
}

