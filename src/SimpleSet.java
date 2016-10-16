/*
 * Jose Jo Escobar, 14343
 * Alejandro Chaclan, 15018
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 9
 * Descripción: SimpleSet ejemplo con ArrayList.
*/
import java.util.ArrayList;

class SimpleSet implements WordSet
{
	private ArrayList<Word> base;
	
	public SimpleSet()
	{
		base = new ArrayList<Word>();
	}
	
	public Word get(Word word)
	{
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}