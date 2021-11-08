/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos_estudiantes;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//import com.google.gson.Gson;
/**
 *
 * @author Hilar
 */
public class Codigo {
     public void iniciar(){
        int opcion1;
        do{
    Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("---Análisis de Datos de Estudiantes---");
        System.out.println("-------------------------------");
        System.out.println("1. Ingreso de datos");
        System.out.println("2. Análisis de datos");
        System.out.println("3. Salir");

        System.out.println("Ingrese una opción: ");
        opcion1=sc.nextInt();
          
        while (opcion1 == 1){
            seleccion();
        }
        
    }while(opcion1!=3);
       
    } 
public void seleccion(){
      Scanner sc = new Scanner(System.in);
    int opcion2;
    
        System.out.println("------------------------------");
        System.out.println("Análisis de Datos de Estudiantes");
        System.out.println("------------------------------");
        System.out.println("Ingreso de Datos");
        System.out.println("------------------------------");
        
         String json ="";
        try {
            BufferedReader semibufer = new BufferedReader(new FileReader("Datos.json.txt"));
            String linea=("");
           while ((linea = semibufer.readLine()) !=null){
            json += linea;
           }
       semibufer.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Datos_estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println(json);
            
       
        
     System.out.println("Datos ingresados con éxito: ");  System.out.println("Desea ingresar otro estudiante s/n: ");
          opcion2 = sc.nextInt();
      switch (opcion2){
       /*case  "desea":  
           while ("desea".equals(opcion2)){
               iniciar();
         }
             default:
            System.out.println(opcion2);  
       break;*/
                 
}
}  
}
