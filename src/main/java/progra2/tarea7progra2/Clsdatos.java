/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2.tarea7progra2;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public abstract class Clsdatos implements datos   {
     private static final Scanner teclado = new Scanner(System.in);
    
    static void LecturaArchivo(){
     
        
        File Archivo = new File("C:\\Users\\Josue\\Desktop\\Progra\\tarea7.txt");
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(Archivo));
            String lectura; 
            lectura = entrada.readLine();
            int NoLinea = 1;
           
            while ( lectura != null){
                
                System.out.println(NoLinea+" Vendedor:  "+lectura);
                NoLinea++;
                lectura = entrada.readLine();
                
            }
            entrada.close();
        }catch(FileNotFoundException ex){
            System.out.println("El archivo no existe");
        }catch(IOException ex){
            System.out.println("Hay problemas de apertura");
        }
        
    }
    static void Escribir(){
        String Info;
        File Archivo = new File("C:\\Users\\Josue\\Desktop\\Progra\\tarea7.txt");
        System.out.println("Ingresa el nombre del nuevo vendedor:");
        Info = teclado.nextLine();
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(Archivo,true));
            String contenido = Info;
            salida.println(contenido);
            salida.close();
        }catch(FileNotFoundException ex){
            System.out.println("El archivo no existe");
        }catch(Exception e){
            System.out.println("Hubo problemas");
        }
    }
    

    
    public static void main(String[] args){
    Escribir();

        LecturaArchivo();
 

    }
}
