package live;

import music.Playable;
import music.string.Veena;

public class Test {
	public static void main(String args[])
	{
		Playable playable=new Veena();
		playable.play();
		playable=new music.wind.Saxophone();
		playable.play();
		
	}

}
