 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testonlinestore;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class TestOnlineStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
    String CustomerName;
    String CustomerSurname;
    String productName;
    String address;
    String emailAddress;
    boolean details=true;
    Scanner input = new Scanner(System.in);
    Random productPrice = new Random();
    int[] discountRangeLimit={1,5,10,20,30};
    double[] discount={0.0,0.10,0.14,0.28,0.30};
    double customerDiscount;
    double To;
    double number=0;
    double totalPriceOfProducts=0;
    double finalPricAfterDiscount;
    double discAmount;
    double tax;
    int idNumber;
    int productId;
    int phoneNumber;
    int yes=1;
    int no=2;
    int reply;
    int order;
    int year,month,day;
    final int LIMIT=5;
    int sub=LIMIT-1;
    final int ORDER=5;
    final int ONE_PRICE=1;
    final double TAX_RATE=0.10;
    LocalDate date;
    LocalTime time;

    JOptionPane.showMessageDialog(null,"Welcome to Ebay-Online Store\nClick Ok to sign up","Ebay",JOptionPane.INFORMATION_MESSAGE);
    
    CustomerName=JOptionPane.showInputDialog(null,"Please enter your Name.","Ebay",JOptionPane.INFORMATION_MESSAGE);

    CustomerSurname=JOptionPane.showInputDialog(null,"Please enter your Surname.","Ebay",JOptionPane.INFORMATION_MESSAGE);
   
   while(CustomerName.isEmpty() || CustomerSurname.isEmpty())
   {
      JOptionPane.showMessageDialog(null,"Invalid Data\nNote: A Field wasn't entereed");
     
        if(CustomerName.isEmpty())
               CustomerName=JOptionPane.showInputDialog(null,"Please enter your Name.","Ebay",JOptionPane.INFORMATION_MESSAGE);
           if(CustomerSurname.isEmpty())
               CustomerSurname=JOptionPane.showInputDialog(null,"Please enter your Surname.","Ebay",JOptionPane.INFORMATION_MESSAGE);    
            else
               break; 
   }    
   
    idNumber=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your ID#","Ebay",JOptionPane.INFORMATION_MESSAGE));
   
    phoneNumber=Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter your Phone number","Ebay",JOptionPane.INFORMATION_MESSAGE));
    
    emailAddress=JOptionPane.showInputDialog(null,"Please Enter your valid email Address","Ebay",JOptionPane.INFORMATION_MESSAGE);
    
    address=JOptionPane.showInputDialog(null,"please enter your current Home Address","Ebay",JOptionPane.INFORMATION_MESSAGE);
    
    JOptionPane.showMessageDialog(null,"Name: " + CustomerName + "\nSurname: " + CustomerSurname + "\nID# :" + idNumber + "\nPhone#: " + phoneNumber + "\nEmail: " + emailAddress + "\nAddress: " + address,"Ebay-Verify Details",JOptionPane.INFORMATION_MESSAGE);   
   
    reply=Integer.parseInt(JOptionPane.showInputDialog(null,"Press 1-To Edit or 2-To Proceed","Ebay-Varify",JOptionPane.QUESTION_MESSAGE));
    
     if(reply==yes) 
     {

    int opt1;
     
    while(true)
    {
    opt1=Integer.parseInt(JOptionPane.showInputDialog(null,"Select a number\n1-Name: " + CustomerName + "\n2-Surname: " + CustomerSurname + "\n3-ID# :" + idNumber + "\n4-Phone#: " + phoneNumber + "\n5-Email: " + emailAddress + "\n6-Address: " + address + "\n7-Exit","Ebay-Editings",JOptionPane.INFORMATION_MESSAGE));   
   
    switch(opt1)
    {
        
        case 1:  
    CustomerName=JOptionPane.showInputDialog(null,"Please enter your Name.","Ebay",JOptionPane.INFORMATION_MESSAGE);
    break;
        case 2:
    CustomerSurname=JOptionPane.showInputDialog(null,"Please enter your Surname.","Ebay",JOptionPane.INFORMATION_MESSAGE);
    break;
        case 3:
    idNumber=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your ID#","Ebay",JOptionPane.INFORMATION_MESSAGE));
    break;
        case 4:
    phoneNumber=Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter your Phone number","Ebay",JOptionPane.INFORMATION_MESSAGE));
    break;
        case 5:  
    emailAddress=JOptionPane.showInputDialog(null,"Please Enter your valid email Address","Ebay",JOptionPane.INFORMATION_MESSAGE);
    break;
        case 6:  
    address=JOptionPane.showInputDialog(null,"please enter your current Home Address","Ebay",JOptionPane.INFORMATION_MESSAGE);
    break;
        default:
            
    }
     
    if(opt1==7)
        break;
        
    }
    }

    
    while(true)
    {
    String logIn;
    logIn=JOptionPane.showInputDialog(null,"Log In (Custumer Name) :","Ebay-Create a Shopping Cart",JOptionPane.INFORMATION_MESSAGE);
    
    if(CustomerName.contains(logIn))
    {
       JOptionPane.showMessageDialog(null,"Welocme " + logIn,"Ebay-My Cart",JOptionPane.INFORMATION_MESSAGE);    
      
       //Stores the ordered products
        while(true) 
       {
        for(int x=0;x<ORDER;++x)
        {
        //Customer is allowed to order  1-5 products before ebingbeing asked to continue to make more orders
         productName=JOptionPane.showInputDialog(null,"Enter the product you want to order","Ebay",JOptionPane.INFORMATION_MESSAGE);
        
         for(int y=0;y<ONE_PRICE;++y)
            number=productPrice.nextDouble(1000);
   
         totalPriceOfProducts+=number;
         
  
         JOptionPane.showMessageDialog(null,"Product Name: " +  productName + "\nID: #" + number + "\nPrice: R" + number,"Order Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        
        reply=Integer.parseInt(JOptionPane.showInputDialog(null,"Continue making orders?\nPress 1(YES) or 2(NO) ","Ebay-Order",JOptionPane.QUESTION_MESSAGE));
         
         if(reply==yes)
            continue;
         else
             break;
       }
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Incorrect Log In Name!!!\nPlease Try again","Ebay-Create a Shopping Cart",JOptionPane.INFORMATION_MESSAGE);
        continue;
    }
       if(reply==no)
           break;
    } 
    

    //These line of code calculates and apply a disciount based on the a certain number of products ordered
    order=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the # of Products order: ","Ebay",JOptionPane.INFORMATION_MESSAGE));
   
    while(sub>=0 && order<discountRangeLimit[sub])
        --sub;
    customerDiscount=discount[sub];
    discAmount=totalPriceOfProducts*customerDiscount;
    finalPricAfterDiscount=totalPriceOfProducts-discAmount;
    
    tax=finalPricAfterDiscount*TAX_RATE;
   
    year=Integer.parseInt(JOptionPane.showInputDialog(null,"Ente the current year","Ebay",JOptionPane.INFORMATION_MESSAGE));
    month=Integer.parseInt(JOptionPane.showInputDialog(null,"Ente the current month","Ebay",JOptionPane.INFORMATION_MESSAGE));
    day=Integer.parseInt(JOptionPane.showInputDialog(null,"Ente the current day","Ebay",JOptionPane.INFORMATION_MESSAGE));
    
    //The date and time is to show the customer's order details
    date=LocalDate.of(year, month, day);
    time=LocalTime.now();
    
    Store placeOrder = new Store(CustomerName,CustomerSurname,idNumber,phoneNumber,emailAddress,address,number);
    
    JOptionPane.showMessageDialog(null,"--------------------------Customer Details--------------------------" + "\nName: " + placeOrder.getCustomerName() + "\nSurname: " + placeOrder.getCustomerSurname() + "\nID: #" + placeOrder.getIdNumber() + "\nHome Address: " + placeOrder.getAddress() + "\nOrder ID: #" + placeOrder.getProductId() + "\n--------------------------Order Details--------------------------\nDate: " + date + "\nTime: " + time + "\nTotal Cost: R" + finalPricAfterDiscount + "\nTax: R" + tax,"Ebay-Order Review",JOptionPane.INFORMATION_MESSAGE);    
    
    }
      
    }
    
    
    


 

