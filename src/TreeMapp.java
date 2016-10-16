
import java.util.TreeMap;
/*
 * Jose Jo Escobar, 14343
 * Alejandro Chaclan, 15018
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 9
*/
public class TreeMapp implements WordSet {
         private TreeMap<String,String> stringMap = new TreeMap<String,String>();
         public boolean valor;
   
    public void add(Word objeto) {
        stringMap.put(objeto.getWord(),objeto.getType());
    }

    public Word get(Word pal) {
        stringMap.containsValue(pal.getWord());
        valor=stringMap.containsKey(pal.getWord());
        if(valor==true){
            Word palabra=new Word();
            palabra.setWord(pal.getWord());
            palabra.setType(stringMap.get(pal.getWord()));
            return palabra;
        }else{
            return null;
        }
      }
    
}
