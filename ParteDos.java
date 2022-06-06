

//ARRAYS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

import java.util.Scanner;

public class ParteDos {
	
	
	   String nombreA = "";
	     float codigoAA;
	     float numeroBA;
	     String nombreB = "";
	     float codigoCA;
	     String nombreCA = "";
	     float codigoG;
	     String descripcionAA ="";
	    String[] vectorDatos;
	     private int indiceVector;
	     String[] vector;
	     private String[] registrarDatos;
	     String i="";
	     int datosAlumnosB;
	     String datosAlumnosBA;
	     int datoCursoB;
	     String datoCursoBA;
	     int codigoA;
	     int numeroB;
	     int codigoC;
	     int CodigoG;
	     String correoA;
	     int registroA;
	     String registroB;
	     
	     
	      Scanner sc= new Scanner(System.in);
	     

	     public ParteDos(){
	       this.nombreA="";
	        this.nombreB="";
	        this.codigoA=0;
	        this.numeroB=0;
	        this.codigoC=0;
	        this.CodigoG=0;
	        this.correoA="";
	        this.registroA=0;
	        vectorDatos = new String [100];
	         this.indiceVector= 0;  
	         this.registrarDatos(i, i, i, i, nombreA);
	         this.registrarDatos2(i, i, i, i);
	         this.registrarDatos3(i, i, i, i, registroA);
	         this.registrarDatos4(i, i, registroA);
	         this.registrarDatos5(i, i, i, i, nombreA);
	       
	     }

	     public void datosDepa2 (){
	         
	         
	   System.out.println("Ingrese el registro del departamento: ");
        registroA=sc.nextInt();
	                        
	          
        System.out.println("Ingrese el nombre del departamento: ");
          nombreA=sc.next();
        
	                         
          System.out.println("Ingrese la cantidad de municipios: ");
           numeroB= sc.nextInt();
                                
           System.out.println("Ingrese la cabecera del departamento:");
            nombreB=sc.next();
                                     
	           
            
        this.registrarDatos4("CabeceraDeDepartamento: ","",registroA);
        this.registrarDatos2("NombreDeDepartamento: ","",nombreA, correoA);
        this.registrarDatos3("","CabeceraDeDepartamento: ","",correoA, numeroB);
        this.registrarDatos("Datos: ","","CabeceraDeDepartamento: ","",nombreB);
        
	             
	     }
	     

	     
	     public void mostrarDatosDepartamento(){
	       System.out.println("Ingresar el departamento que desea: ");
	        nombreA=sc.next();
	        
	        System.out.println("El departamento "+ nombreA +" esta en:"+registroA);
	  
	   }
	     
	      public void mostrarDatosCabecera(){
	       System.out.println("Ingresar el departamento que desea: ");
	        nombreA=sc.next();
	        
	        System.out.println("El departamento "+ nombreA +" su cabecera es: "+nombreB);
	  
	   }
	 
	 public void forDos(){
	    
	    
	}
	public void forDosTres(){
	    
	   int num;
       int np = 0;
       int nip=0;


	    for(int i=1; i<=10; i++)
	    {
	        if(i%1==0)
	        {
	            nip= registroA;
	        }
	    }
	    System.out.println("Los valores impares son: ");
	    System.out.println(nip);
	    
	    
	}
	    

	    
	   public void registrarDatos(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro){
	       indiceVector=indiceVector+1;;
	       
	      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
	   
	    }
	   
	   public void registrarDatos2(String tipo, String espacio1,String tipo1, String espacio2){
	       indiceVector=indiceVector+1;;
	       
	      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+"";
	   
	    }
	   
	    public void registrarDatos3(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro){
	       indiceVector=indiceVector+1;;
	       
	      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
	   
	    }
	    
	     public void registrarDatos4(String tipo, String espacio1,int primerParametro){
	       indiceVector=indiceVector+1;;
	       
	      vectorDatos[indiceVector]= tipo+espacio1+""+tipo+""+primerParametro;
	   
	    }
	     
	     public void registrarDatos5(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro){
	       indiceVector=indiceVector+1;;
	       
	      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
	   
	    }
	    
	     //HISTORIAL
	     
	      public void mostrarDatos(){
	          try{   
	              System.out.println(vectorDatos.length);
	            for (int i=1; i<vectorDatos.length;i++){
	                if(vectorDatos[i]!=null){
	                    System.out.println(vectorDatos[i]);
	                }
	            } 
	        }catch(Exception e){
	            System.out.println(e.getMessage());       
	        }
	     }

	       public void almacenarDatos(String numero){
	        this.vector[indiceVector]=numero;
	        this.indiceVector=this.indiceVector+1;
	    }
}
