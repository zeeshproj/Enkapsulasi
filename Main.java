/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setter.getter;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {
    public static void main (String[]args){
    User satu = new User();

    Scanner dua = new Scanner(System.in);
    System.out.println("===== Silahkan masukkan User dan Pass anda ====");
    System.out.print("Username : ");
    String nama = dua.nextLine();
    System.out.print("Password : ");
    String passnya = dua.nextLine();
    
    
    

    // menggunakan method setter
    satu.setUsername(nama);
    satu.setPassword(passnya);

    // menggunakan method getter
    System.out.println("======== User dan Pass anda ========");
    System.out.println("Username: " + satu.getUsername());
    System.out.println("Password: " + satu.getPassword()); 
    
    
    }
}
