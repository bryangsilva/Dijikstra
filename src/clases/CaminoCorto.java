package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class CaminoCorto {
   public int distancia[]=new int[10];
    public int costos[][]=new int[10][10];
  
public void calcularCaminos(int nodos,int origen){
        int control[]=new int[nodos+1];
        int i,k,contador,minimo;
        int minpos=1;
        
        for(i=1;i<=nodos;i++){
            control[i]=0;
            this.distancia[i]= this.costos[origen][i];
        }
        
        contador=2;
        System.out.println();
        while(contador<=nodos){
            minimo=99;
            for(k=1;k<=nodos;k++){
                if( this.distancia[k]<minimo && control[k] !=1){
                    minimo= this.distancia[i];
                    minpos=k;
                }
            }
            control[minpos]=1;
            contador++;
             for(k=1;k<=nodos;k++){
                 if( this.distancia[minpos]+ this.costos[minpos][k]< this.distancia[k] && control[k] != 1){
                      this.distancia[k]= this.distancia[minpos]+this.costos[minpos][k];
                 }
             }
        }
        
    }
}
