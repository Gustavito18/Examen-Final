

//LISTAS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ParteUno {
	
	 List<ParteUno> listDepa = new ArrayList<ParteUno>();
	    
	    
     Scanner sc= new Scanner(System.in);
    
     
    int[] vector;
    private double[] matriz;
    private int indiceVector;
    String listaA;
    String verLista;
    int verLista2;
        
     
     String verNombreA;
     String verNombreB;
     String addAlumnosB;
     

    String nombreD;
    int numeroM;
    int registroA;
    String nombreC;
    
    
    
    public ParteUno() {
        
    }
    
    
    public ParteUno(String nombreD, int numeroM, String nombreC, int registroA) {
       
        this.nombreD = nombreD ;
        this.numeroM =numeroM;
        this.nombreC=nombreC;
        this.registroA=registroA;
        
    }

    public String getNombreD() {
        return nombreD;
    }
