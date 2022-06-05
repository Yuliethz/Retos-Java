/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yulie
 */
import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> aa = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listb = new ArrayList<>();
        ArrayList<Integer> ejempa = new ArrayList<Integer>();
        ArrayList<Integer> ejempb = new ArrayList<Integer>();
        Integer numero = 5;
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(5);
        A.add(5);
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(5);
        //System.out.println(A);
        Album a = new Album();
        System.out.println("Respuesta 1");
        System.out.println(a.clases(A));
        //----------------------------
        aa.add(1);
        aa.add(3);
        aa.add(6);
        aa.add(8);

        b.add(1);
        b.add(2);
        b.add(5);
        b.add(5);
        b.add(5);
        b.add(1);
        b.add(2);
        b.add(5);
        b.add(5);
        b.add(5);
        System.out.println(" Respuesta 2");
        System.out.println(a.meFaltanDeLaClase(aa, b, numero));

        //
        lista.add(3);
        lista.add(5);
         lista.add(7);
        lista.add(10);
        lista.add(15);
         lista.add(16);
         lista.add(17);
         lista.add(58);
             lista.add(78);
         lista.add(76);
         lista.add(97);
         lista.add(98);
       
        //8

        listb.add(4);
         listb.add(10);
        listb.add(5);
        listb.add(8);
         listb.add(14);
         listb.add(20);
        listb.add(25);
        listb.add(28);
         listb.add(29);
        listb.add(45);
        listb.add(58);
        
        
       
        
    
       
        System.out.println(lista.size());
        
        System.out.println(" Respuesta 3");
        System.out.println(a.noTengo(lista, listb));

        //
        ejempa.add(49);
        ejempa.add(40);
        ejempa.add(26);
        ejempa.add(9);
        ejempa.add(14);
        ejempa.add(25);
        ejempa.add(18);
         ejempa.add(11);
          ejempa.add(39);
           ejempa.add(23);
            ejempa.add(19);
             ejempa.add(41);
              ejempa.add(38);
               ejempa.add(44);
                ejempa.add(22);
                 ejempa.add(27);
                  ejempa.add(28);

        ejempb.add(5);
        ejempb.add(13);
        ejempb.add(35);
        ejempb.add(48);
        ejempb.add(43);
        
        ejempb.add(0);
        ejempb.add(7);
        ejempb.add(30);
        ejempb.add(27);
        ejempb.add(2);
        ejempb.add(1);
        ejempb.add(40);
        ejempb.add(14);
        ejempb.add(28);
        ejempb.add(8);
        ejempb.add(10);
        ejempb.add(36);
        ejempb.add(49);
        ejempb.add(39);
        ejempb.add(23);
        

        System.out.println(" Respuesta 4");
        System.out.println(a.puedoCambiar(ejempa, ejempb));
    }

}
