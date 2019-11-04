
package matriks;

import java.util.Scanner;

public class Matriks {
    
    
    public static void main(String[] args) {
        System.out.println("Hello, Create Your Matrix");
        Scanner input=new Scanner (System.in);
        //matriks pertama
        System.out.print("Row First Matrix :");
        int baris1=Integer.parseInt(input.nextLine());
        System.out.print("Column First Matrix :");
        int kolom1=Integer.parseInt(input.nextLine());
        int [][]matriks1=new int [baris1][kolom1];
        for(int i=0; i<baris1;i++){
            for(int j=0;j<kolom1;j++){
                System.out.print("Input number row-"+(i+1)+" column-"+(j+1)+" : ");
                matriks1[i][j]=Integer.parseInt(input.nextLine());
            }
        }
        //matriks kedua 
        System.out.print("Row Second Matrix :");
        int baris2=Integer.parseInt(input.nextLine());
        System.out.print("Column Second Matrix : ");
        int kolom2=Integer.parseInt(input.nextLine());
        int [][]matriks2=new int [baris2][kolom2];
        for(int i=0; i<baris1;i++){
            for(int j=0;j<kolom1;j++){
                System.out.println("Input number row-"+(i+1)+" column-"+(j+1)+" : ");
                matriks2[i][j]=Integer.parseInt(input.nextLine());
            }
        }
        
        //output matriks
        System.out.println("So, The First Matrix Is:");
        for(int i=0; i<baris1;i++){
            for (int j=0; j<kolom1;j++){
                System.out.print(" "+matriks1[i][j]);
            }
            System.out.println("");
        }
         System.out.println("Then, The Second Matrix Is:");
         for(int i=0; i<baris2;i++){
            for (int j=0; j<kolom2;j++){
                System.out.print(" "+matriks2[i][j]);
            }
            System.out.println("");
        }
        //penjumlahan matriks
        System.out.println("Summation Matrixs");
        int [][]jumlah=new int[baris2][kolom2];
        if((baris1==baris2) && (kolom1==kolom2)){
            for(int i=0; i<baris2;i++){
                for (int j=0; j<kolom2;j++){
                    jumlah[i][j]=matriks1[i][j]+matriks2[i][j];
                }
            }
            
            for(int i=0; i<baris2;i++){
                for (int j=0; j<kolom2;j++){
                    System.out.print(""+jumlah[i][j]);
                }
                System.out.println("");
            }
        }
        else{
                System.out.println("Matriks Tidak Valid");
                }
            }
            
        }

        
        
       
   
