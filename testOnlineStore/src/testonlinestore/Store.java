/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testonlinestore;


/**
 *
 * @author admin
 */
public class Store {
   
private String CustomerName;
private String CustomerSurname;
private int idNumber;
private int phoneNumber;
private String emailAddress;
private String address;
private String productName;
private double productId;

Store(String n,String sn,int id,int num,String em,String ad,double pi)
{
  CustomerName=n;
  CustomerSurname=sn;
  idNumber=id;
  phoneNumber=num;
  emailAddress=em;
  address=ad;
  productId=pi;
}

    public String getCustomerName() {
        return CustomerName;
    }

    public String getCustomerSurname() {
        return CustomerSurname;
    }

    public double getProductId() {
        return productId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getIdNumber() {
        return idNumber;
    }
    
}
