/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.Scanner;
/**
 *
 * @muhammad rizky ardiansyah
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int tabung,pilih,tarik,saldo,hasil,hsl;
       saldo = 50000;
       tarik = 0;
       System.out.println("1.penarikan ");
       System.out.println("2.Tabung");
       System.out.println("3.Cek info Saldo");
       System.out.print("Pilih:");
       pilih = sc.nextInt();
       
       if(pilih == 1){
           System.out.println("Saldo anda sekarang :"+saldo);
           System.out.println("Berapa yang ingin anda tarik");
           tarik = sc.nextInt();
           hasil = saldo -tarik;
           if(tarik < saldo){
               System.out.println("anda berashil menarik uang ,sisa saldo anda saat ini" +hasil);
           }
           else {
               System.out.println("maaf Saldo anda tidak cukup");
               
               
           }
           
       }
       if(pilih == 2){
           System.out.println("Berapa anda ingin menabung :");
           tabung = sc.nextInt();
           hsl = tabung + saldo;
           System.out.println("anda berhasil menabung");
           System.out.println("Total Saldo anda"+hsl);
           
       }
       if(pilih == 3){
           System.out.println("Saldo anda"+saldo);
       }
       
    }
    
}
