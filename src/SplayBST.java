/*
 * Jose Jo Escobar, 14343
 * Alejandro Chaclan, 15018
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 9
*/
public class SplayBST implements WordSet{
        SplayTree<Word> Tree= new SplayTree<Word>();
    
    	public void add(Word wordObject)
	{
		Tree.insert(wordObject);
	}
        
    	public Word get(Word word)
	{
		return Tree.find(word);
	}
}
