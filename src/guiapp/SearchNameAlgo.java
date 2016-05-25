/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guiapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

public class SearchNameAlgo {
    SearchNameAlgo(){}
    String searchName(String name,ArrayList<String> lines)
    {
    Iterator it = lines.iterator();
    System.out.println("Gonna Compare");
    System.out.println(lines.size());
    name = name.replace("[", "");
    name = name.replace("]", "");
            while(it.hasNext())
            {
            String tempLine = (String) it.next();
            Pattern pat = Pattern.compile("[,]"); 
	    String strs[] = pat.split(tempLine);
            System.out.println("HERERE! " + name + " " + strs[1]);
            if(name.equalsIgnoreCase(strs[1]))
            {
            return strs[1]  + "," +  strs[0] + "," + strs[2];    
            }
           
            }
            return "";
}
    
 String searchNameTutors(String name,ArrayList<Tutors> t)
    {
    Iterator it = t.iterator();
    System.out.println("Gonna Compare");
    System.out.println(t.size());
    name = name.replace("[", "");
    name = name.replace("]", "");
            while(it.hasNext())
            {
            
            Tutors tempT = (Tutors) it.next();
            System.out.println("HERERE! " + name + " " + tempT.getName());
           
            if(name.equalsIgnoreCase(tempT.getName()))
            {
            return tempT.getName()  + "," +  tempT.getId() + "," + tempT.getPayrate();    
            }
            }
            return "";
}
}
