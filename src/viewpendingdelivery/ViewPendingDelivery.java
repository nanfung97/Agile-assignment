/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewpendingdelivery;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author X455LD
 */
public class ViewPendingDelivery {

    private Scanner scan = new Scanner(System.in);
    int option;
    int ans;
    
    
    public void Pending1(){
        ArrayList<String> pend1 = new ArrayList<>();
        pend1.add("Chicken Burger| Pending| 21,Tmn Permai");
        pend1.add("FrenchFries| Pending| 330,TBR");
        pend1.add("Coke| Pending| Pv13,Setapak");
        pend1.add("Oreo Mc Flurry| Pending| 220, Rawang");
        pend1.add("Chicken Delux| Pending| Pv21, Setapak");
      
       System.out.println("-------------PENDING DELIVERIES------------");
        for(int i=0; i<pend1.size(); i++){
            System.out.println(pend1.get(i));
        }
        System.out.println("-------------------------------------------");
    }
    
    public void Pending2(){
        ArrayList<String> pend2 = new ArrayList<>();
        pend2.add("Chizza| Pending| 21,Tmn Permai");
        pend2.add("Frieds Chicken| Pending| 330,TBR");
        pend2.add("Coke| Pending| Pv13,Setapak");
        pend2.add("Oreo Mc Flurry| Pending| 220, Rawang");
        pend2.add("Kit Kat Mc Flurry| Pending| Pv21, Setapak");
        pend2.add("Ice Lemon Tea| Pending| Pv21, Setapak"); 
        pend2.add("Kit Kat Mc Flurry| Pending| 23, Tmn Impiam");
      
       System.out.println("-------------PENDING DELIVERIES------------");
        for(int i=0; i<pend2.size(); i++){
            System.out.println(pend2.get(i));
        }
        System.out.println("-------------------------------------------");
    }
    
     public void Pending3(){
        ArrayList<String> pend3 = new ArrayList<>();
        pend3.add("Chicken Burger Delux| Pending| 21,Tmn Permai");
        pend3.add("Frieds Chicken| Pending| 330,Tamn Aman");
        pend3.add("Coke| Pending| Pv13,Setapak");
            
       System.out.println("-------------PENDING DELIVERIES------------");
        for(int i=0; i<pend3.size(); i++){
            System.out.println(pend3.get(i));
        }
        System.out.println("-------------------------------------------");
    }
     
     public void Pending4(){
        ArrayList<String> pend4 = new ArrayList<>();
        pend4.add("Chicken Burger Delux| Pending| Block A, Jalan Ipoh, Klang Valley");
       
       System.out.println("-------------PENDING DELIVERIES------------");
        for(int i=0; i<pend4.size(); i++){
            System.out.println(pend4.get(i));
        }
        System.out.println("-------------------------------------------");
    }
     
     public void Pending5(){
        ArrayList<String> pend5 = new ArrayList<>();
        pend5.add("Chicken Burger Delux| Pending| 21,Tmn Permai");
        pend5.add("Frieds Chicken| Pending| 330,Tamn Aman");
        pend5.add("Coke| Pending| Pv13,Setapak");
        pend5.add("Chicken Burger Super Delux Set| Pending| 160A Sempalit");
        pend5.add("Frieds Chicken| Pending| 22, Country Home");
        pend5.add("Sundae Ice Cream| Pending| Pv21, Setapak");
        pend5.add("Chicken Burger Delux| Pending| Block Ab, Klang");
        pend5.add("French Fries| Pending| 330,Tamn Aman Villa");
        pend5.add("Coke| Pending| Pv13,Setapak");
            
       System.out.println("-------------PENDING DELIVERIES------------");
        for(int i=0; i<pend5.size(); i++){
            System.out.println(pend5.get(i));
        }
        System.out.println("-------------------------------------------");
    }
    
    public void DisplayDeliveries(){
   do{
       System.out.println();
        System.out.println("------------SELECT DELIVERY MAN------------");
        System.out.println("1. Lim Jaey");
        System.out.println("2. Lim Peng Len");
        System.out.println("3. Jessica Teoh");
        System.out.println("4. Desmond Tan");
        System.out.println("5. Danny Ho");
        System.out.println("-------------------------------------------");
        System.out.print("Enter Option: ");
        option=scan.nextInt();

        switch(option){
            case 1:
                System.out.println();
                Pending1();
                break;
            case 2:
                System.out.println();
                Pending2();
                break;
            case 3:
                System.out.println();
                Pending3();
                break;
            case 4:
                System.out.println();
                Pending4();
                break;
            case 5:
                System.out.println();
                Pending5();
                break;
            default :
                System.out.println("Invalid Options!");
                
        } System.out.print("Continue keep track? (1 to continue, 0 to exit): ");
          ans=scan.nextInt();
   }while(ans == 1);
  
   System.out.println("*****************End Viewing********************");
    }
    
 
    public static void main(String[] args) {
    
        ViewPendingDelivery pd = new ViewPendingDelivery();
        pd.DisplayDeliveries();
        
    }
    
}
