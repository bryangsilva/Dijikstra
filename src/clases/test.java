package clases;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class test {
    public static void main(String[] args) {
  JTextArea ventana=new JTextArea();
       
        
        int nodos,origen,i,j;
        Scanner in = new Scanner(System.in);
        System.out.println("Numero de nodos:");
        nodos = in.nextInt();
        String salida="NODOS \tA\tB\tC\tD\tE\tF\tG\tH\n";
        int aux=1;
        CaminoCorto camino=new CaminoCorto();
        System.out.println("Ingrese los pesos de la matriz de costos separados por espacios: ");
        for(i=1;i<=nodos;i++){
            salida+=aux++ + "\t";
             for(j=1;j<=nodos;j++){
                camino.costos[i][j]=in.nextInt();
               salida+=camino.costos[i][j]+"\t";
                if(camino.costos[i][j]==0)
                    camino.costos[i][j]=999;
          }
             salida+="\n";
        }
       ventana.setText(salida);
       JOptionPane.showMessageDialog(null, ventana);
        
        System.out.println("Nodo de origen:");
        origen=in.nextInt();
        camino.calcularCaminos(nodos,origen);
        System.out.println("El camino mas corto de "+origen+" a el vertice "+nodos+" es:"+camino.distancia[nodos]);
 } 
 } 

    
