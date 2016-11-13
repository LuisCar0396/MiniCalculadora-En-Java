import java.util.Scanner;
//@Creador Luis Carlos Asael Zepeda Barrera
//Declaramos La Clase
public class MiniCalculadora {
	public static void main(String[] args) {
									//Almacenes de La Bitacora
			int ing, a1=-1, a2=-1, a3=-1, a4=-1;
												//Variables
			int op;
			double sum1=0, sum2=0, suma=0, res1=0, res2=0, resta=0, mult1=0, mult2=0, multi=0, div1=0, div2=0, divi=0;
							//Declaracion de Variables Para La Bitacora
			String[] sumas = new String[50];
			String[] restas = new String[50];
			String[] ml = new String[50];
			String[] dv = new String[50];
			Scanner scanner = new Scanner (System.in);
    	do{
								//Imprimimos Un Menu Para El Usuario
			System.out.println("   Menu de opciones");
      System.out.println();
			System.out.println(" 1. Suma De 2 Numeros (+)");
			System.out.println(" 2. Resta De 2 Numeros (-)");
			System.out.println(" 3. Multiplicacion De 2 Numeros (*)");
			System.out.println(" 4. Division De 2 Numeros (/)");
			System.out.println(" 5. Ver Bitacora (Historial)");
      System.out.println(" 6. Borrar Bitacora");
      System.out.println(" 7. Salir");
			System.out.println();
			System.out.println("   Ingresar opcion:");
			//Capturamos La Opcion Que Eligio El Usuario
			op = scanner.nextInt();
      switch (op) {
																//SUMA
case 1:
					//Aqui Se Indica Que Se Guardara La Operacion
					a1=a1+1;
					System.out.println();
        	System.out.println("Selecciono la Opcion: \"1 Suma De 2 Numeros\"" +'\n');
          Scanner s1 = new Scanner(System.in);
          Scanner s2 = new Scanner(System.in);
          System.out.println("Ingrese Primer Numero: ");
          sum1= s1.nextDouble();
          System.out.println("Ingrese Segundo Numero: ");
          sum2= s2.nextDouble();
          suma = sum1+sum2;
          System.out.println("El resultado es:");
          System.out.println(suma);
					//Ya Que Se Realizo La Operacion Se Envia A La Bitacora
					sumas[a1]=sum1+"+"+sum2+"="+""+suma;
          System.out.println("Presione una tecla para desplegar nuevamente El Menu Principal");
          String j= "";
          Scanner menu=new Scanner(System.in);
          j=menu.nextLine();
          break;
																//RESTA
case 2:
					//Aqui Se Indica Que Se Guardara La Operacion
					a2=a2+1;
        	System.out.println("Selecciono la Opcion: \"2 Resta De 2 Numeros\"" +'\n');
          Scanner r1 = new Scanner(System.in);
          Scanner r2 = new Scanner(System.in);
          System.out.println("Ingrese Primer Numero: ");
          res1= r1.nextDouble();
          System.out.println("Ingrese Segundo Numero: ");
          res2= r2.nextDouble();
          resta = res1-res2;
          System.out.println("El resultado es:");
          System.out.println(resta);
					//Ya Que Se Realizo La Operacion Se Envia A La Bitacora
					restas[a2]=res1+"-"+res2+"="+""+resta;
          System.out.println("Presione una tecla para desplegar nuevamente El Menu Principal");
          String k= "";
          Scanner menu2=new Scanner(System.in);
          k=menu2.nextLine();
          break;

															//MULTIPLICACION
case 3:
					//Aqui Se Indica Que Se Guardara La Operacion
					a3=a3+1;
        	System.out.println("Selecciono la Opcion: \"3 Multiplicacion De 2 Numeros\"" +'\n');

          Scanner mu1 = new Scanner(System.in);
          Scanner mu2 = new Scanner(System.in);
          System.out.println("Ingrese Primer Numero: ");
          mult1= mu1.nextDouble();
          System.out.println("Ingrese Segundo Numero: ");
          mult2= mu2.nextDouble();
          multi = mult1*mult2;
          System.out.println("El resultado es:");
          System.out.println(multi);
					//Ya Que Se Realizo La Operacion Se Envia A La Bitacora
					ml[a3]=mult1+"*"+mult2+"="+""+multi;
          System.out.println("Presione una tecla para desplegar nuevamente El Menu Principal");
          String l= "";
          Scanner menu3=new Scanner(System.in);
          l=menu3.nextLine();
          break;
																 //DIVISION
case 4:
					//Aqui Se Indica Que Se Guardara La Operacion
					a4=a4+1;
        	System.out.println("Selecciono la Opcion: \"4 Division De 2 Numeros\"" +'\n');
          Scanner di1 = new Scanner(System.in);
          Scanner di2 = new Scanner(System.in);
          System.out.println("Ingrese Primer Numero: ");
          div1= di1.nextDouble();
          System.out.println("Ingrese Segundo Numero: ");
          div2= di2.nextDouble();
					/*Creamos una condicion que al hacer una division entre cero sea error*/
          if(div2!=0){
          divi = div1/div2;
          System.out.println("El resultado es:");
          System.out.println(divi);
					//Ya Que Se Realizo La Operacion Se Envia A La Bitacora
					dv[a4]=div1+"/"+div2+"="+""+divi;
          }
          else{
          System.out.println("La Division Entre 0 No Se Puede Realizar");
					System.out.println("");
					//Si Se Realiza Una Operacion Erronea Que Se Almacene En La Bitacora
					dv[a4]=div1+"/"+div2+"="+""+"ERROR";
          }

          System.out.println("Presione una tecla para desplegar nuevamente El Menu Principal");
          String m= "";
          Scanner menu4=new Scanner(System.in);
          m=menu4.nextLine();
          break;
									 //ALMACEN DE LA BITACORA - VER BITACORA
case 5:
					System.out.print("Selecciono la opcion: ");
					System.out.println("\"5. Ver Bitacora\"");
					System.out.println("Usted realizo las siguientes operaciones: " +'\n');
					//Estas Variables Indican El Inicio De Los Indices
					int cs=0, cr=0, cm=0, cd=0;
					//Se Evalua Si Se Cumple La Condicion Se Ejecuta Un Ciclo While
					while(cs<50){
					//Se Utilizan If En Donde Se Evalua El Momento Cuando Los Indices No Contengan Operaciones
					//Para Poder Omitir Los Inices Siguiente
					if(sumas[cs]==null || sumas[cs]==""){
					if(restas[cr]==null || restas[cr]==""){
					if(ml[cm]==null || ml[cm]==""){
					if(dv[cd]==null || dv[cd]==""){
					//Cuando Los Indices Se Descarten, El Programa Mostrara Un Mensaje Para Regresar Al Menu Nuevamente
					System.out.println("Presione una tecla para desplegar nuevamente El Menu Principal");
					String n= "";
					Scanner menu5=new Scanner(System.in);
					n=menu5.nextLine();
					break;
 					/*Si El Programa Detecta Que EL Indice Tiene Informacion Guardada,
					Se Imprimira Cada Uno De Ellos En La Parte Donde Estan Declarados Los Else*/
					}else{
					System.out.println(dv[cd]);
					//Aqui Se Permite Que La Pocision Aumente Hasta Que No Encuentre Ninguna Informacion
					cd=cd+1;}
					}else{
					System.out.println(ml[cm]);
					//Aqui Se Permite Que La Pocision Aumente Hasta Que No Encuentre Ninguna Informacion
					cm=cm+1;
					}
					}else{
					System.out.println(restas[cr]);
					//Aqui Se Permite Que La Pocision Aumente Hasta Que No Encuentre Ninguna Informacion
					cr=cr+1;
					}
					}else{
					System.out.println(sumas[cs]);
					//Aqui Se Permite Que La Pocision Aumente Hasta Que No Encuentre Ninguna Informacion
					cs=cs+1;
					}
					}
					break;
															//BORRAR BITACORA
case 6:
					System.out.print(" Selecciono la opcion:");
					System.out.println(" \"6. Borrar Bitacora\"");
					System.out.println();
					double bor, b=0;
					//Si Se Escoge Por Error La Opcion Borrar Se Enviara Un Mensaje Para La Confirmacion
					System.out.println("     *Desea Borrar la Informacion*" +'\n'+"1. -Si" +'\n' +"2. -No");
					System.out.println();
					System.out.println("   Ingresar opcion:");
					Scanner ifc = new Scanner(System.in);
					bor = ifc.nextInt();
					//Aqui Se Evaluara Si Se Confirma la Opcion Para Borrar La Informacion De La Bitacora
					if(bor==1){
					/*Si Se Confirmo El Eliminar La Informacion, Se ejecutara Un Ciclo El Cual
					Eliminara Todo El Contenido De La Bitacora*/
					for(int a=0; a<50; a++){
					sumas[a]="";
					restas[a]="";
					ml[a]="";
					dv[a]="";
					}
					/*Al Seleccionar "Eliminar Bitacora" Las Variables Regresaran
					A Su Valor Inicial Para Que La Informacion Que Contenga Sea Eliminada*/
					cs=0;
					cr=0;
					cm=0;
					cd=0;
					a1=-1;
					a2=-1;
					a3=-1;
					a4=-1;
					//Luego Se Mostrara Un Mensaje Para Confirmar La Eliminacion
					System.out.println("\"La Informacion A Sido Eliminada Exitosamente\"" +'\n');
					}
					//Si El Usuario No Desea Eliminar La Bitacora, El Programa Se Ejecutara Normalmente
					System.out.println("Presione una tecla para desplegar nuevamente El Menu Principal");
					String o = " ";
					Scanner menu6 = new Scanner(System.in);
					o = menu6.nextLine();
					break ;
                          //SALIR DEL PROGRAMA
case 7:
					System.out.println("\"Gracias - Ha Finalizado Las Operaciones\"");
					break;

					default:
					System.out.println("*La Opcion Seleccionada Es Incorrecta*");
					System.out.println();
					System.out.println("Presione una tecla para desplegar nuevamente El Menu Principal");
					String n= "";
					Scanner menu5=new Scanner(System.in);
					n=menu5 .nextLine();
					break;
    			}
					//Si la Opcion Elegida Es Diferente A 7 El Programa Se Repetira
					}while(op!=7);
		}
}
