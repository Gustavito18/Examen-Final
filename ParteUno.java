

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

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

   

    public int getNumeroM() {
        return numeroM;
    }

    public void setNumeroM(int numeroM) {
        this.numeroM = numeroM;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getRegistroA() {
        return registroA;
    }

    public void setRegistroA(int registroA) {
        this.registroA = registroA;
    }
     public void departamento(){
                        
         System.out.println("Ingrese el numero del departamento: ");
           registroA=sc.nextInt();
        
           System.out.println("Ingrese el nombre del Departamento: ");
             nombreD=sc.next();                  
                        
             System.out.println("Ingrese la cantidad de municipios: ");
              numeroM= sc.nextInt();
                                 
              System.out.println("Ingrese la cabecera: ");
               nombreC=sc.next();
                                      
        
        listDepa.add(new ParteUno(nombreD,numeroM,nombreC, registroA));
       
  
    }    
     
      public void listaHistorial(){

        
        for (int i=0; i<listDepa.size(); i++) {
            System.out.println("El numero de registro es: " + listDepa.get(i).getRegistroA());
            System.out.println("Su registro es: " + listDepa.get(i).getNombreD());
            System.out.println("Cantidad de municipios es: " + listDepa.get(i).getNumeroM());
            System.out.println("La cabecera del departamento es: " + listDepa.get(i).getNombreC());
        }
        
        
    }
      
        public void departamentoNumero(){
		
          Scanner uno = new Scanner (System.in);
          int indice;
          int registros =0;
          System.out.println("Verificar registro del departamento.");
           registros= uno.nextInt();
          indice = listDepa.indexOf(registros);
          if (indice != registroA){
                      System.out.println("El departamento registrado es: "+nombreD);
          }else {
              System.out.println("No se encuentra este registro");

          }
    }
    
     public void limpieza(){
      listDepa.clear();
   }
}
