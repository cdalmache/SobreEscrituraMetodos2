/**
 * Diseñe e implemente un algoritmo con una clase padre denominada Vehiculo el 
 * mismo que  contiene con los siguientes atributos  como: marca, modelo y nombre
 * de tipo cadenas y modelo, cedula y telefono de tipo entero mayor de 8 caracteres.
 * A su vez que  de dicha clase se derive   otra denominada  Automovil y de este se 
 * derive la clase  AutomovilAutonomo.Se debe usar extends para llamar a cada clase hijo,
 * también se debe implementar dos sobre escrituras denominadas ListadoAutomoviles y ListadoPropietarios.
 * Finalmente debe desplegar  un menu con opciones usando sentencias Switch y  case 
 * para la informacion de los datos como: vehiculo, vehiculo autonomo y los propietarios.
 */

package daniel.sobreescriturametodos2;

/**
 * @author Almache Cristian,  Loachamin Cristian
 */
import java.util.Scanner;
 import java.util.Calendar;
import java.util.ArrayList;

 class Vehiculo {
    private String marca;
    private String tecnologia;
    private int modelo;
    private String nombre;
    private long cedula; 
    private long telefono;
    
     public Vehiculo(){
         marca="";
         tecnologia="";
         modelo=0;
         nombre="";
         cedula=0;
         telefono=0;
     }
      public Vehiculo(String marca, String tecnologia, int moldelo, String nombre, long cedula, long telefono){
          this.marca=marca;
          this.tecnologia=tecnologia;
          this.modelo=modelo;
          this.nombre=nombre;
          this.cedula=cedula;
          this.telefono=telefono;
          
      }
      public String getMarca(){
          return marca;
      }
      public String getTecnologia(){
          return tecnologia;
      }
      public int getModelo(){
          return modelo;
      }
     public  String getNombre(){
         return nombre;
     }
     public long getCedula(){
         return cedula;
     }
     public long getTelefono(){
         return telefono;
     }
}
 class Automovil extends Vehiculo{
     private String matriculaAutomovil;
      public Automovil(){
          super();
          matriculaAutomovil="Desconocido";
    }
     public Automovil(String marca, String tecnologia, int modelo, String nombre, long cedula, long telefono){
         super(marca, tecnologia, modelo, nombre, cedula,telefono);
         matriculaAutomovil="Desconocido";
     }
    
     
       public void setMatriculaAutomovil(String matriculaAutomovil){
           this.matriculaAutomovil= matriculaAutomovil;
       }
       public String getMatriculaAutomovil(){
           return matriculaAutomovil;
       }         
        public void mostrarDatos(){
            System.out.println("\tTECNOLOGIA: "+getTecnologia());
            System.out.println("\tMARCA DEL AUTOMOVIL: "+getMarca());
            System.out.println("\tMATRICULA DEL AUTOMOVIL:"+getMatriculaAutomovil());  
        }
        public void mostrarDatos1(){
                 System.out.println("\tNOMBRE:"+getNombre());
                 System.out.println("\tCEDULA:"+getCedula());
                 System.out.println("\tTELEFONO:"+getTelefono());
        }        
 }   
        class AutomovilAutonomo extends Automovil{
            private Calendar fechaComienzoFabricacionAutonomia;
            
            public AutomovilAutonomo(Calendar fechaComienzoFabricacionAutonomia){
                super();
                fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
            }
            public AutomovilAutonomo(String marca, String tecnologia, int modelo,
                    Calendar fechaComienzoFabricacionAutonomia, String nombre, long cedula, long telefono){
                super(marca, tecnologia, modelo,nombre, cedula, telefono);
                this.fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
            }
             public Calendar getFechaComienzoFabricacionAutonomia(){
                 return fechaComienzoFabricacionAutonomia;
             }            
             public void mostrarDatos(){
                     System.out.println("\tFECHA DE FABRICACION: " + fechaComienzoFabricacionAutonomia.getTime().toString());
                     System.out.println("\tTECNOLOGIA: "+getTecnologia());
                     System.out.println("\tMARCA DEL AUTOMOVIL: "+getMarca());
                     System.out.println("\tMATRICULA DEL AUTOMOVIL:"+getMatriculaAutomovil());  
             }
             public void mostrarDatos1(){
                 System.out.println("\tNOMBRE :"+getNombre());
                 System.out.println("\tCEDULA :"+getCedula());
                 System.out.println("\tTELEFONO :"+getTelefono());
           }
        }
     
 //LISTADO PROPIETARIOS
 class ListadoPropietarios{
            private ArrayList<Automovil>listadoPropietarios;
            
            //Constructor
            public ListadoPropietarios(){
                listadoPropietarios=new ArrayList<Automovil>();
            }
            //Metodos
             public void addAutomovil(Automovil automovil){
                 listadoPropietarios.add(automovil);
             } //Cierre método addAutomovil
              public void Listar(){
                     System.out.println("\t\tDATOS DEL VEHÍCULO:");
                     for(Automovil tmp:listadoPropietarios){ //Uso de for extendido
                         tmp.mostrarDatos();
                   }
               }
        }
           //LISTADO AUTOMOVILES
        class ListadoAutomoviles{
            private ArrayList<Automovil>listadoAutomoviles;
            
            //Constructor
            public ListadoAutomoviles(){
                listadoAutomoviles=new ArrayList<Automovil>();
            }
            //Metodos
             public void addAutomovil(Automovil automovil){
                 listadoAutomoviles.add(automovil);
             } //Cierre método addAutomovil
                 public void Listar(){
                     System.out.println("\t\tDATOS DEL PROPIETARIO:");
                     for(Automovil tmp:listadoAutomoviles){ //Uso de for extendido
                         tmp.mostrarDatos1();
                   }
               }
        }
 class SobreEscrituraMetodos2{
      public static void main(String[] args) {
          Scanner op=new Scanner(System.in);  
        int caso=0;
        int caso1=0;
        int caso2=0;        
        System.out.println("\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS");
        System.out.println("\t\t\t\t ESPE");
        System.out.println("Integrantes: Almache Cristian, Loachamin Cristian");
        System.out.println("Carrera: Ing. Automotriz");
        System.out.println("Docente: Ing. Luis Guerra");
        System.out.println("Tema: SobreEscrituraMetodos2 ");
        System.out.println("____________________________________________________");
            System.out.println("\t\t MENU AUTOMÓVIL /AUTOMÓVIL AUTÓNOMO ");
            
       for( int i=1;i<=5;i++){
           System.out.println("1.AUTOMÓVIL");
           System.out.println("2.AUTOMÓVIL AUTÓNOMO");
           System.out.println("Digite de [3-9] para salir ");
           System.out.print("DIGITE SU OPCIÓN  : ");
            caso= op.nextInt();        
            System.out.println("________________________________________________");
           
        switch(caso){
             case 1:                 
                 System.out.println("\t HA SELECCIONADO AUTOMÓVIL ");
                 System.out.println("1. DATOS DE AUTOMÓVIL");
                 System.out.println("2. DATOS DEL PROPIETARIO AUTOMÓVIL");
                 System.out.println("Digite de [3-9] para SALIR  ");
                 System.out.print("DIGITE SU OPCIÓN : ");
                   caso1= op.nextInt();                  
        //AUTOMOVIL                
        Automovil automovil1=new Automovil("Ford ","Canadiense",2018,"Rodolfo Cruz",504085721, 2733546);
         automovil1.setMatriculaAutomovil("Ontario ABZM-264-20");             
    
          switch(caso1){
              //PROPIETARIO
                 case 1:
                 ListadoPropietarios listado2=new ListadoPropietarios();  
                 listado2.addAutomovil(automovil1);
                 listado2.Listar();
                 System.out.println("___________________________________________");
                 break;
              case 2:
                  
              ListadoAutomoviles listado1=new ListadoAutomoviles();
              listado1.addAutomovil(automovil1);
              listado1.Listar(); 
               System.out.println("___________________________________________");
              break;
             }
         break;                  
            case 2:
                 System.out.println("\t HA SELECCIONADO AUTOMÓVIL AUTÓNMMO  ");                
                 System.out.println("1. DATOS DEL PROPIETARIO AUTOMÓVIL AUTÓNOMO");
                 System.out.println("2. DATOS DEL  AUTOMÓVIL AUTÓNOMO ");
                 System.out.println("Digite de [3-9] para SALIR  ");
                 System.out.print("DIGITE SU OPCIÓN : ");
                   caso2= op.nextInt(); 
        //AUTONOMO 
        Calendar fecha1=Calendar.getInstance();
        fecha1.set(2019,10,22); //Los meses van de 0 a 11, luego 10 representan noviembre
         AutomovilAutonomo autonomo1=new AutomovilAutonomo("Nissan","EUROPEA", 2020, fecha1,"Mario Casas",504038226,2722550);
         switch(caso2){
             case 1:
                 
          ListadoAutomoviles listado3=new ListadoAutomoviles();
          listado3.addAutomovil(autonomo1); 
         listado3.Listar();
          System.out.println("__________________________________________________");
          break;
          case 2:                
         ListadoPropietarios listado4=new ListadoPropietarios();          
         listado4.addAutomovil(autonomo1);         
         listado4.Listar();
          System.out.println("__________________________________________________");
         break;               
         }
         break;
      }
    }
 }
      
