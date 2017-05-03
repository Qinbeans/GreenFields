package creatures;

import java.util.ArrayList;
import creatures.moves.Moves;

public class Creature {
	private String name = "";
	private ArrayList<Moves> moves;
	public Creature(String name, ArrayList<Moves> moves){
		this.name=name;
		this.moves=moves;
	}//reads a file produces possible creatures
	public ArrayList<String> toArray(){
		ArrayList<String> hold = new ArrayList<String>();
		hold.add(name);
		for(Moves move:moves){
			hold.add(move.toString());
		}
		return hold;
	}
}
