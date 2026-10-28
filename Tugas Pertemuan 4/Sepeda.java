/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4;

import java.util.Scanner;

/**
 *
 * @author rizky
 */
class Sepeda {
        
    
   int jarakTempuh, pilih;
   String brand;
   
   
   void melaju() {
       jarakTempuh += 10;
       System.out.println("melaju 10km");
   }
   
   void mundur() {
       jarakTempuh -= 5;
       System.out.println("mundur 5km");
   }
   
   void berhenti() {
       System.out.println("Sepeda Berhenti");
       System.out.println("Objek Sepeda " + brand + " Jarak Tempuh " + jarakTempuh + "km");
   }
   
   void inpo() {
       System.out.println("Objek Sepeda " + brand + " Jarak Tempuh " + jarakTempuh + "km");
   }
   
   void menu() {
       do{
           
           Scanner input = new Scanner(System.in);
           System.out.print("Pilih Menu : ");
           pilih = input.nextInt();
           
           if(pilih == 1){
               melaju();
               inpo();
           }else if (pilih == 2){
               mundur();
               inpo();
           }else if (pilih == 3){
               berhenti();
           }else if(pilih == 0){
               System.out.println("Keluar program...");
               System.out.println("Terimakasih Telah Menggunakan Program ini");
           }else{
               System.out.println("Pilihan tidak Valid!");
           }
               
       }while(pilih != 0);
   }
}
