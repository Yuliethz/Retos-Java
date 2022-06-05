
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author yulie
 */
public class Album {

    //******************PUNTO NUMERO 1****************
    public ArrayList<Integer> clases(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        // con la interfaz set no puede haber elementos repetidos en las 
        //colecciones que implementan la interfaz .
        Set<Integer> set = new LinkedHashSet<>();
        //LinkedHashSet- Los elementos se encuentran en el orden que se insertan
        //agregamos los elementos
        set.addAll(A);
        //lo guardamos en un arraylist
        result.addAll(set);
        return result;

    }

    //********************PUNTO NUMERO 2 **************
    public ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> A, ArrayList<Integer> B,
            Integer idCAtegoria) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            Integer pos = A.get(i);
            if (Objects.equals(B.get(pos), idCAtegoria)) {
                result.add(A.get(i));

            }

        }

        return result;

    }

    //********************PUNTO NUMERO 3 **************
    public ArrayList<Integer> noTengo(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(A);
        //System.out.println(result);
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (Objects.equals(A.get(i), B.get(j))) {
                    result.remove(A.get(i));
                }
            
            }
        }
        return result;
    }

    //********************PUNTO NUMERO 4 **************
    public Integer puedoCambiar(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> resultado = new ArrayList<>();
        ArrayList<Integer> resultado2 = new ArrayList<>();
         resultado.addAll(B);
         resultado2.addAll(A);
         Integer result = null;
        //System.out.println(result); a A le interesan de B
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (Objects.equals(A.get(i), B.get(j))) {
                    //fichas que me interesan
                    resultado.remove(B.get(i));
                }
            }
        }
        
        //B le interesan de A 
         for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (Objects.equals(A.get(i), B.get(j))) {
                    resultado2.remove(A.get(i));
                }
            
            }
        }
        
        if (resultado.size()<resultado2.size()){
            result=resultado.size();
            
        }else{
            result=resultado2.size();
        }
        //System.out.println(resultado);
        //cantidad de fichas que me interesan 
        
        return result;

    }

}
