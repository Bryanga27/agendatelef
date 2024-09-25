
package proyectoagenda;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class agenda extends JFrame{
    telefonica lleno[] = new telefonica[15];
        
    
   
   JPanel panelagenda = new JPanel();
   JTextField telefono = new JTextField();
   JTextField nombre = new JTextField();
   JTextField correo = new JTextField();
   
   //COLORES
   Color miColor = new Color(Integer.parseInt("76afb5", 16));
   Color a = new Color(Integer.parseInt("CECBCB", 16));
   Color e = new Color(Integer.parseInt("98F5F9", 16));
   
   
   public agenda(){
       this.setVisible(true);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   //PANEL
   public void panel(){
       this.getContentPane().add(panelagenda);      
       panelagenda.setBackground(miColor);
       panelagenda.setLayout(null);
   }
   
   //etiquetas
   public void etiquetas(){
       JLabel telefono = new JLabel("Telefono");
       telefono.setBounds(30, 30, 100, 20);
       panelagenda.add(telefono);
       
       
       JLabel nombre = new JLabel("Nombre");
       nombre.setBounds(30, 130, 100, 20);
       panelagenda.add(nombre);
       
       JLabel correo = new JLabel("Correo");
       correo.setBounds(30, 230, 100, 20);
       panelagenda.add(correo);
       
   }
   
   public void texto(){
       telefono.setBounds(120, 30, 200, 35);
       panelagenda.add(telefono);
       telefono.setBackground(a);
       
       nombre.setBounds(120, 130, 200, 35);
       panelagenda.add(nombre);
       nombre.setBackground(a);
       
       correo.setBounds(120, 230, 200, 35);
       panelagenda.add(correo);
       correo.setBackground(a);
   }
   public void botones(){
       JButton guardar = new JButton("GUARDAR");
       guardar.setBounds(370, 50, 120, 100);
       panelagenda.add(guardar);
       guardar.repaint();
       guardar.setBackground(e);
       
       ActionListener guardar1 = new ActionListener(){
           public String actionPerformed (ActionEvent e, String nombre, String correo, int telefono, telefonica array[]) {
                boolean vacio = true;
                for (int i = 0; i < 10; i++) {
                    if(array[i] == null){
                        array[i] = new telefonica(nombre, correo, telefono);
                        vacio = false;
                        break;
                        
                    }else if(array[i].getTelefono() == telefono){
                        return "ya existe";
                    }
                }
                if(!vacio){
                    return "se guardo con exito";
                }else{
                    return "ya no hay espacio";
                }
               }

           @Override
           public void actionPerformed(ActionEvent e) {
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
           
       };
       guardar.addActionListener(guardar1);
       
       
       JButton buscar = new JButton("BUSCAR");
       buscar.setBounds(520, 50, 120, 100);
       panelagenda.add(buscar);
       buscar.repaint();
       buscar.setBackground(e);
       
       JButton actualizar = new JButton("ACTUALIZAR");
       actualizar.setBounds(370, 180, 120, 100);
       panelagenda.add(actualizar);
       actualizar.repaint();
       actualizar.setBackground(e);
       
       JButton eliminar = new JButton("ELIMINAR");
       eliminar.setBounds(520, 180, 120, 100);
       panelagenda.add(eliminar);
       eliminar.repaint();
       eliminar.setBackground(e);
   }
   }

