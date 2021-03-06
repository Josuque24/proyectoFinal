package proyecto00;
import java.io.BufferedWriter;
import java.io.*;
import javax.swing.JOptionPane;
public class Compra {
    private Propiedad comprarPropiedad []=new Propiedad [1];
    private Persona referencias[]=new Persona[3];
    Provincias pv=new Provincias();
    private String s,q,v;
    private double g;
    private int answerDescuento;
    
   public void ingresarDatosPropiedadConstruida () {
        Propiedad pro=new Propiedad ();       
        pro.setValorPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de dinero que esta dispuesto a invertir en la propiedad: \n"
                +"La suma es en dolares")));
        pro.setMedidasPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de metros cuadrados que desea que posea la propiedad:")));
        pro.setCantHabitaciones(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de habitaciones que debe tener la propiedad:")));        
        pro.setMedidasPatio(Double.parseDouble(JOptionPane.showInputDialog(null,
                "La propiedad debe tener patio? \n"
                +"0) No \n"+" 1) Si ")));
        pro.setCantBaños(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de baños que desea en la propiedad:")));
        pro.setComedor(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Desea una propiedad con un comedor?\"\n" +
                "0) No \n"+" 1) Si ")));
        pro.setSala(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Desea una propiedad con una sala?\"\n" +
                "0) No \n"+" 1) Si ")));
        pro.setGaraje(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Desea una propiedad con un garaje?\"\n" +
                "0) No \n"+" 1) Si ")));
        pro.setCuartoLavado(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Desea una propiedad con un cuarto de lavado? \n"
                +"0) No \n"+" 1) Si ")));
        pv.elegirProvincias();  
        /*pro.setDireccion(JOptionPane.showInputDialog(null,
                "Ingrese la direccion de donde le gustaria que se ubique la propiedad: "));*/
        pro.setAnotaciones(JOptionPane.showInputDialog(null,
                "Ingrese anotaciones si las hay:"));
        comprarPropiedad[0]=pro; 
    } // fin de   ingresarDatosPropiedadConstruida
    
   public void mostrarDatosPropiedadConstruida () {
       String a,b,c,d,e,h;
       if(comprarPropiedad[0].getMedidasPatio()==1){a="Si";}else{a="No";}
       if(comprarPropiedad[0].getComedor()==1){b= "Si";}else{b= "No";}
       if(comprarPropiedad[0].getSala()==1){c="Si";}else{c="No";}
       if(comprarPropiedad[0].getGaraje()==1){d="Si";}else{d="No";}
       if(comprarPropiedad[0].getCuartoLavado()==1){e="Si";}else{e="No";}
       if(comprarPropiedad[0].getCantBaños()>1||comprarPropiedad[0].getCantBaños()==0){h=" baños";}else{h=" baño";};
       
       s="Hay "+ comprarPropiedad[0].getValorPropiedad()+" dolares disponibles para la compra de una propiedad. \n"
               +"La propiedad debe tener "+comprarPropiedad[0].getMedidasPropiedad() + " m² aproximadamente. \n" 
               +"La propiedad debe tener "+comprarPropiedad[0].getCantHabitaciones()+" habitaciones."
               +"La propiedad debe tener "+comprarPropiedad[0].getCantBaños()+h+" \n"
               +"Direccion aproximada donde la propiedad debe estar ubicada: "+ pv.getUbicacion() + ".\n"
               +"La propiedad debe tener  patio: "+ a + "\n"               
               +"La propiedad debe tener comedor: "+ b +"\n"
               +"La propiedad debe tener sala: "+ c + "\n"
               +"La propiedad debe tener garaje: "+ d +"\n"
               +"La cantidad debe tener cuarto de lavado: "+ e +"\n"
               
               +"Anotaciones: "+comprarPropiedad[0].getAnotaciones() +"\n";
       JOptionPane.showMessageDialog(null,s);
   } 
   
   public void archivarDatosPropiedadConstruida(){
       JOptionPane.showMessageDialog(null,"La informacion fue guardada y enviada");
        try {
            String ruta = "C:\\Users\\janjo\\OneDrive\\Documentos\\Universidad\\Progra\\projects\\proyecto00\\txts\\comprarPropiedadConstruida.txt";
            String contenido = (s);
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
   
   
   public void referirNombresDescuentoConstruido(){
        answerDescuento = JOptionPane.showConfirmDialog(null,
                    "Desea ganar un descuento de 1.5% de descuento en su compra final? \n"
                    +"Anote el nombre y el correo electronico de 3 amigos. \n"
                    +"Para que ellos puedan recibir información de esta increible app \n",
                    "¿Desea aplicar por el 1.5% de descuento?", JOptionPane.YES_NO_OPTION);
                        if (answerDescuento == JOptionPane.YES_OPTION) {
                            int x=0;
                                for(x=0;x<3;x++){
                                    Persona p=new Persona();
                                    
                                    p.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre de la persona "
                                        +(x+1)+ " que desea referenciar."));
                                    p.setEmail(JOptionPane.showInputDialog(null,"Digite el email de la persona "
                                        + (x+1) +" que desea referenciar."));
                                    p.setNumeroTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el número de teléfono de la persona "
                                        + (x+1) + " que desea referenciar." )));
                                    referencias [x]=p;
                                } 
                                
                                
                        //tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt    
                            x=0;
                            String t="";
                                for(x=0;x<3;x++){            
                                    t= t+ "El nombre del amigo "+(x+1)+" es "+referencias[x].getNombre()
                                        +" su email es "+referencias[x].getEmail()+" y su número de teléfono es "+
                                    referencias[x].getNumeroTelefono()+" \n";
                                }                                
                                JOptionPane.showMessageDialog(null,t);
                        //ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt
                        
                        
                                //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                                
                                String a,b,c,d,f,h;
       if (answerDescuento == JOptionPane.YES_OPTION){g=(comprarPropiedad[0].getValorPropiedad()*0.15);}                         
       if(comprarPropiedad[0].getMedidasPatio()==1){a="Si";}else{a="No";}
       if(comprarPropiedad[0].getComedor()==1){b= "Si";}else{b= "No";}
       if(comprarPropiedad[0].getSala()==1){c="Si";}else{c="No";}
       if(comprarPropiedad[0].getGaraje()==1){d="Si";}else{d="No";}
       if(comprarPropiedad[0].getCuartoLavado()==1){f="Si";}else{f="No";}
       if(comprarPropiedad[0].getCantBaños()>1||comprarPropiedad[0].getCantBaños()==0){h=" baños";}else{h=" baño";};
       
       s="Hay "+ comprarPropiedad[0].getValorPropiedad()+" dolares disponibles para la compra de una propiedad. \n"
               +"Se le hara un descuento de "+g+ " dolares en su compra final. \n"
               +"La propiedad debe tener "+comprarPropiedad[0].getMedidasPropiedad() + " m² aproximadamente. \n" 
               +"La propiedad debe tener "+comprarPropiedad[0].getCantHabitaciones()+" habitaciones."
               +"La propiedad debe tener "+comprarPropiedad[0].getCantBaños()+h+" \n"
               +"Direccion aproximada donde la propiedad debe estar ubicada: "+pv.getUbicacion()+ ".\n"
               +"La propiedad debe tener  patio: "+ a + "\n"              
               +"La propiedad debe tener comedor: "+ b +"\n"
               +"La propiedad debe tener sala: "+ c + "\n"
               +"La propiedad debe tener garaje: "+ d +"\n"
               +"La cantidad debe tener cuarto de lavado: "+ f +"\n"              
               +"Anotaciones: \n"+comprarPropiedad[0].getDireccion()+" \n"
               +"Amigos referidos: "+ t;
       JOptionPane.showMessageDialog(null,s);
                                                                                                                                
                                //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                            JOptionPane.showMessageDialog(null,"La informacion fue guardada y enviada");  
                            try {
                                String ruta = "C:\\Users\\janjo\\OneDrive\\Documentos\\Universidad\\Progra\\projects\\proyecto00\\txts\\comprarPropiedadConstruida.txt";
                                String contenido = (s);
                                File file = new File(ruta);
                                // Si el archivo no existe es creado
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                                FileWriter fw = new FileWriter(file);
                                BufferedWriter bw = new BufferedWriter(fw);
                                bw.write(contenido);
                                bw.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                           
                        }else{
                            JOptionPane.showMessageDialog(null, "Usted selecciono que no queria referir ningun amigo." ); 
                        } /*fin del else */                         
    }/*fin referir nombres*/  
   
   /////////////////////////////////////////////////////////
   
    public void ingresarDatosPropiedadBaldia (){
        Propiedad pro=new Propiedad ();
        pro.setValorPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de dinero que esta dispuesto a invertir en la propiedad: \n"
                +"La suma es en dolares.")));
        pro.setMedidasPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de metros cuadrados que desea que posea la propiedad:")));
        pv.elegirProvincias();
       /* pro.setDireccion(JOptionPane.showInputDialog(null,
                "Ingrese la direccion de donde le gustaria que se ubique la propiedad: "));*/
        pro.setAnotaciones(JOptionPane.showInputDialog(null,
                "Ingrese anotaciones si las hay:"));
        comprarPropiedad[0]=pro;
    } // fin de ingresarDatosPropiedadBaldia
               
    public void mostrarDatosPropiedadBaldia () {       
        q="La cantidad de dinero dispuesto a invertirse en la compra es: "+ comprarPropiedad[0].getValorPropiedad()+" colones. \n"
        +"La propiedad debe tener "+comprarPropiedad[0].getMedidasPropiedad() + " m² aproximadamente. \n"
        +"Direccion aproximada donde la propiedad debe estar ubicada: "+pv.getUbicacion()+".\n"
        +"Anotaciones: \n"+comprarPropiedad[0].getAnotaciones();      
        JOptionPane.showMessageDialog(null,q);
    }
    
    public void archivarDatosPropiedadBaldia(){
        JOptionPane.showMessageDialog(null,"La informacion fue guardada y enviada");
        try {
            String ruta = "C:\\Users\\janjo\\OneDrive\\Documentos\\Universidad\\Progra\\projects\\proyecto00\\txts\\compraPropiedadBaldia.txt";
            String contenido = (q);
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void referirNombresDescuentoBaldia(){
        answerDescuento = JOptionPane.showConfirmDialog(null,
                    "Desea ganar un descuento de 1.5% de descuento en su compra final? \n"
                    +"Anote el nombre y el correo electronico de 3 amigos. \n"
                    +"Para que ellos puedan recibir información de esta increible app \n",
                    "¿Desea aplicar por el 1.5% de descuento?", JOptionPane.YES_NO_OPTION);
                        if (answerDescuento == JOptionPane.YES_OPTION) {
                            int x=0;
                                for(x=0;x<3;x++){
                                    Persona p=new Persona();
                                    
                                    p.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre de la persona "
                                        +(x+1)+ " que desea referenciar."));
                                    p.setEmail(JOptionPane.showInputDialog(null,"Digite el email de la persona "
                                        + (x+1) +" que desea referenciar."));
                                    p.setNumeroTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el número de teléfono de la persona "
                                        + (x+1) + " que desea referenciar." )));
                                    referencias [x]=p;
                                } 
                                
                                
                        //tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt    
                            x=0;
                            String t="";
                                for(x=0;x<3;x++){            
                                    t= t+ "El nombre del amigo "+(x+1)+" es "+referencias[x].getNombre()
                                        +" su email es "+referencias[x].getEmail()+" y su número de teléfono es "+
                                    referencias[x].getNumeroTelefono()+" \n";
                                }                                
                                JOptionPane.showMessageDialog(null,t);
                        //ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt
                        
                        
                                //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                                
                                String a,b,c,d,f,h;
       if (answerDescuento == JOptionPane.YES_OPTION){g=(comprarPropiedad[0].getValorPropiedad()*0.15);}                         
             
       
       s="Hay "+ comprarPropiedad[0].getValorPropiedad()+" dolares disponibles para la compra de una propiedad. \n"
               +"Se le hara un descuento de "+g+ " dolares en su compra final. \n"
               +"La propiedad debe tener "+comprarPropiedad[0].getMedidasPropiedad() + " m² aproximadamente. \n"                    
               +"Direccion aproximada donde la propiedad debe estar ubicada: "+pv.getUbicacion()+ "\n"                        
               +"Anotaciones: \n"+comprarPropiedad[0].getDireccion()+" \n"
               +"Amigos referidos: "+ t;
       JOptionPane.showMessageDialog(null,s);
                                                                                                                                
                                //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                            JOptionPane.showMessageDialog(null,"La informacion fue guardada y enviada");  
                            try {
                                String ruta = "C:\\Users\\janjo\\OneDrive\\Documentos\\Universidad\\Progra\\projects\\proyecto00\\txts\\compraPropiedadBaldia.txt";
                                String contenido = (s);
                                File file = new File(ruta);
                                // Si el archivo no existe es creado
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                                FileWriter fw = new FileWriter(file);
                                BufferedWriter bw = new BufferedWriter(fw);
                                bw.write(contenido);
                                bw.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                           
                        }else{
                            JOptionPane.showMessageDialog(null, "Usted selecciono que no queria referir ningun amigo." ); 
                        } /*fin del else */                         
    }/*fin referir nombres*/  
    
}
