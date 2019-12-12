/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesemana6;

import entidades.Estudiante;
import entidades.Persona;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laboratorio
 */
public class ClaseSemana6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Persona> personas = new ArrayList <Persona>();
        
        Persona fulanito = new Estudiante();
        fulanito.setNombre("Carlitos");
        //casteo
        ((Estudiante)fulanito).setNota(100);
        Persona sutanito = new Profesor ("Roberto");
        ((Profesor)sutanito).setHorario("Diurno");
        Estudiante menganito = new Estudiante ("John");
        personas.add(fulanito);
        personas.add(sutanito);
        personas.add(menganito);
        try{
            printPersonas(personas);
            
        }catch(NoRException ex){
            System.out.println("Nada de R: " + ex.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            
        }
        
        
    }

    private static void printPersonas(List<Persona> personas)throws Exception {
        //este for solo en elementos iterables o recorrer
        for(Persona persona : personas){
            System.out.println(persona.getNombre());
            if(persona.getNombre().contains("R")){
                throw new NoRException();
            }
        }
     }
    private static class NoRException extends Exception{
        public NoRException(){
            super("No se permiten R´S");
        }
    }
    
}
