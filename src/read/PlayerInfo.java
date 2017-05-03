package read;

import java.util.ArrayList;
import creatures.Creature;
import creatures.moves.Moves;

public class PlayerInfo {
	private String name="";
	private ArrayList<Creature> creatures;
	public PlayerInfo(String name,ArrayList<Creature> creatures){
		this.creatures=creatures;
		this.name += name;
	}
	public ArrayList<Creature> returnCreatures(){
		return creatures;
	}
	public String playerName(){
		return name;
	}
	public void changeName(String change){
		name=change;
	}
	public void updateCreatures(String name, ArrayList<Moves> moves){
		creatures.add(new Creature(name,moves));
	}
}
