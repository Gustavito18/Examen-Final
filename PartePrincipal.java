
import java.util.Scanner;

public class PartePrincipal {

	public static void main(String[] args) {
		
		   Scanner sc= new Scanner(System.in);
		   
	         ParteDos ejerciciosListasB= new ParteDos();
	         PartePrincipal departamentosA=new PartePrincipal();
	         ParteUno departamentosB =new ParteUno();
	         
	         
	          int decision =0;
	          
	         do{

	              System.out.println("Seleccione la opcion de registro que desee utilizar: ");
	              System.out.println("1.Registro de datos con arrays"); 
	              System.out.println("2. Registro de datos con listas"); 
	              System.out.println("3. MostrarHistorial Arrays");
	              System.out.println("4. MostrarHistorial Listas ");
	              System.out.println("5. Vaciar lista");
	              System.out.println("6. Salir");
	              
	              
	              System.out.println("Que opcion desea utilizar: ");
	                  decision =sc.nextInt();
	                  
	              switch(decision){
	                 
	                 case 1: //ARRAYS
	                     
	                     int decisionDos = 0;
	                     
	                     do{ // MENU DE ARRAYS
	                         
	                       System.out.println("1. Registrar departamentos");
	                       System.out.println("2. Buscar departamento por numero"); 
	                       System.out.println("3. Buscar cabecera departamental"); 
	                       System.out.println("4. Mostrar los departamentos por posiciones impares");
	                       System.out.println("5. Regresar");
	                       
	                     System.out.println("Ingrese la opcion que desea usar: ");
	                     decisionDos =sc.nextInt();
	                     
	 
	              switch(decisionDos){
	                case 1:
	                     
		                   int registroA=0;
		                     String nombreA="";
		                     int numeroB=0;
		                     String nombreB="";
		                     
		                    
		                     
		                     ejerciciosListasB.datosDepa2();
			                   break;
		                  
		                  case 2:
		                   
		                   ejerciciosListasB.mostrarDatosDepartamento();
		                         
		      
			          break;
		                  
		                 case 3:
		                      
		                      ejerciciosListasB.mostrarDatosCabecera();
		                                        
			          break;
		                  
		                  case 4:
		                      
		                     ejerciciosListasB.forDos();
		                     
			          break;
		                  
		  
		                case 5:
		                     
			          break;
		                }
		              
		             }while(decisionDos!=5);
		   
		             break;
		             
		                case 2: //LISTAS
		                    
		                     
		                     int decisionTres = 0;
		                     
		                     do{ //MENU DE LISTAS

		                       System.out.println("1. Registrar departamentos");
		                       System.out.println("2. Buscar departamento por numero"); 
		                       System.out.println("3. Regresar");
		                       
		                     System.out.println("Ingrese la opcion que desea usar: ");

	              }

