/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author ARPIT
 */

public class Maut_Implementation {
    
    
    static String[][] criteria;// = {{"Ciphering", "2","100"},{"Jitter", "3","75"},{"Delay", "5","200"}};
  // static  ArrayList<String[][]> service_C = new ArrayList<String[][]>();
    static int weight= 0;
    static int range= 1;
   // String Temp1[][] = new String[4][3];
   // ArrayList <String [][]> ServiceCriteria = new ArrayList<String [][]>();    
    
    
    
    public static void addnodes(ArrayList<String [][]> array, String [][] row)
    {
        array.add(row);
    }
    
   public static String[][] getfinalselectedTemplate(String[][] Criterias, ArrayList<String[][]> ServiceCriterian){
       criteria = Criterias;
       float[] results = new float[ServiceCriterian.size()];
       int index= 0;
       
       for(int xx = 0; xx<ServiceCriterian.size(); xx++)
                {
                  String[][] templ = ServiceCriterian.get(xx);
                  results[xx] = getSelectedtemplatesum(templ); 
                }
       float[] tempresult = results;
       //Arrays.sort(tempresult);
        float largest=tempresult[0];
            for(int x=0; x<tempresult.length; x++){
            if(tempresult[x]>largest){
            largest = tempresult[x];
            }
            }  
      // float x = tempresult[tempresult.length-1];
         for(int p = 0; p<results.length; p++)
            {
                System.out.println(results[p]); 
                if(results[p]== largest)
                    {
                       index = p;
                       //System.out.println("res  "+results[p]);
                       //System.out.println("ppp  "+p);
                    }
            }
       
        String[][] finalseclectedtemplate =  ServiceCriterian.get(index);
        return finalseclectedtemplate;
       }
        
    public static float getSelectedtemplatesum(String[][] Template){    
    float tempsum=0;
    for(int i =0;i<Template.length;i++){
            String crit = Template[i][0];
            float crweight = getweight(crit);
            float crrange = getrange(crit);
            //System.out.println("Weight "+crweight);
            //System.out.println("Range "+crrange);
            //System.out.println("sum "+Integer.parseInt(Template[i][1]));
            int xx = Integer.parseInt(Template[i][1]);
            System.out.println("Summm "+xx);
            float summ = (xx*crweight)/crrange;
            System.out.println("Sum "+summ);
            tempsum = tempsum+summ;
        }
        System.out.println("Tempracy "+tempsum);
        return tempsum;
    }
    
    public static float getweight(String Criteria){
        for(int i =0;i<criteria.length;i++){
            String check = Criteria;
            if(criteria[i][0].equalsIgnoreCase(check)){
                weight = Integer.parseInt(criteria[i][1]);
            }
        }
        return weight;
    }
    
    public static float getrange(String Criteria){
        try {
    String check = Criteria;   
    File rangee = new File("./Extra_Files/range.txt") ;
    Scanner scanner = new Scanner(rangee);
    while(scanner.hasNext()){
                String line = (scanner.nextLine());
                Pattern pattern4 = Pattern.compile("\\s+");
            	Matcher matcher21 = pattern4.matcher(line);
                String str22 = matcher21.replaceAll(" ");
                String[] linearray = str22.split(" ");
                if(linearray[0].equalsIgnoreCase(check)){
                range = Integer.parseInt(linearray[1]);}
        }
        }
    catch(IOException e) {e.printStackTrace();}
        return range;
    }
    
    public static void main(String[] args)  {
        ArrayList<String[][]> service_C = new ArrayList<String[][]>();
        String[][] userinput = {{"Jitter", "3"},{"Delay", "5"},{"Bandwidth", "8"}};
        String Temp[][] = {{"Jitter", "1000"},{"Delay", "1000"}, {"Bandwidth", "3000"}};
        String Temp2[][] = {{"Jitter", "1000"},{"Delay", "1500"}, {"Bandwidth", "2000"}};
        addnodes(service_C, Temp);
        addnodes(service_C, Temp2);
        String[][] resultt = getfinalselectedTemplate(userinput, service_C);
         for (int r=0; r<resultt.length; r++) {
            for (int c=0; c<resultt[r].length; c++) {
                    System.out.print(" " + resultt[r][c]);
                    }
                }
    }
}
