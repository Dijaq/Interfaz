/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandosql_interfaz;

import java.io.File;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author diego
 */
public class PandoSQL_Funciones {
    
    public PandoSQL_Funciones()
    {}
    
    public void abrir()
    {
          JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Abrir archivo");
        FileFilter filter = new FileNameExtensionFilter("Archivos sql","sql");
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileFilter(filter);

        if (chooser.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION)
        {
        }
    }
    
    public void guardar()
    {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Guardar archivo como");
        FileFilter filter = new FileNameExtensionFilter("Archivos sql","sql");
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileFilter(filter);
        
         if (chooser.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION)
        {
            PrintWriter out = null; 
            
        }
    }
    
    
}
