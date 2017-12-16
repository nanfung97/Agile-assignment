/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retrievecustinfo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lim
 */
public class RetrieveCustInfo {

    
    public static void main(String[] args) {
        System.out.printf("======================= ");
        System.out.printf("\nRetrieve Customer Info ");
        System.out.printf("\n======================= ");
        //System.out.printf("Enter Phone Number\t: ");
        
        String phoneNo;
         Scanner scanner= new Scanner(System.in);
         ArrayList<String> CustInfo = new ArrayList<String>();
         CustInfo.add("\n");
         CustInfo.add("Name\t:Lim Jing Yee");
         CustInfo.add("Gender\t:Female");
         CustInfo.add("PhoneNo\t:0179331911");
         CustInfo.add("Address\t:21,Taman Permai Raub");
             
       
 
          
           
           System.out.printf("\nEnter Phone Number\t: ");
       phoneNo=scanner.nextLine();
       for(int i=0;i<CustInfo.size();i++){
       if(phoneNo.equals("0179331911")){
           System.out.println(CustInfo.get(i));
       }else{
            System.out.println("Sorry , this phone number is not exists in our system. Please Try Again\n");    
            RetrieveCustInfo.main(args);
       }
       }
      
}
           
       
    
}
