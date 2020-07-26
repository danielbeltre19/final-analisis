
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;


public class mifuncion {
    
      public ImageIcon resizefoto(String picpath,byte[] BLOBpic, int wdth, int hgt){
          ImageIcon myImg;
          
          if(picpath != null){
             myImg= new ImageIcon(picpath);
        }else{
              myImg= new ImageIcon(BLOBpic);
          }
       
        Image img= myImg.getImage().getScaledInstance(wdth,hgt, Image.SCALE_SMOOTH);
        ImageIcon mifoto=new ImageIcon(img);
        return mifoto;
        
    }

public String buscar_imagen(JLabel lbl){
    String path=null;
    
    JFileChooser file=new JFileChooser();
file.setCurrentDirectory(new File(System.getProperty("user.home")));

FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.Image","jpg","png","gif"); 
file.addChoosableFileFilter(fileFilter);

int archivo=file.showSaveDialog(null);

if(archivo==JFileChooser.APPROVE_OPTION){
    File selectedFile=file.getSelectedFile();
    path =selectedFile.getAbsolutePath();
    //imagePth= path;
    
lbl.setIcon(resizefoto(path,null, lbl.getWidth(),lbl.getHeight()));

   // jLabelfoto.setIcon(new ImageIcon(path));
    
}else if(archivo==JFileChooser.CANCEL_OPTION){
    System.out.print("Imagen no Seleccionada");
    
    
}
return path;
}
}
    



