/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resultados;

/**
 *
 * @author Student
 */
public class Resultado {

    private int gol1;
    private int gol2;
    private String Equi1;
    private String Equi2;

   public void partido(){
    if (gol1 == gol2)
    {
        System.out.println("empate");
    }else{
    System.out.println("ganador");
    }
    int diferente = Math.abs(gol1 - gol2);
    System.out.println ("diferencia entre goles: "+ diferente);
    
    if (gol1 > 0 && gol2 >0){
    System.out.println("ambos equipos anotaron");
    }else{
    System.out.println("ninguno anoto");
    }
    
    System.out.println ("goles "+ Equi1 + ": "+ gol1);
    System.out.println ("goles"+ Equi2 + ": "+ gol2);
    
    if (gol1 > gol2){
    System.out.println("Ganador: "+ Equi1);
    }else if (gol2 > gol1){
    System.out.println("Ganador: "+ Equi2);
   }else{
    System.out.println("No hay ganador");
    }
  }
}
