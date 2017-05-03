package read;

import java.util.ArrayList;
import javax.imageio.ImageIO;
import creatures.Creature;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
class InOut{
    public static void write(PlayerInfo player){
        try{
            ArrayList<String> hold = new ArrayList<String>();
            Path file = Paths.get("player.txt");
            Files.deleteIfExists(file);
            
            Files.write(file, hold, Charset.forName("UTF-8"));
        }catch(IOException e){
        }
    }
    public static PlayerInfo readPlayer(){
        ArrayList<Chord> chords = new ArrayList<Chord>();
        try{
            Path file = Paths.get(in);
            int count = 0;
            String player="";
            
            Files.readAllLines(file,Charset.forName("UTF-8")).forEach(line->{
                    if(count==0){
                    	
                    }
                    }
                });
        }catch(IOException e){
        }
        return chords;
    public static void addImage(String file){
    	BufferedImage img = null;
    	try {
    	    img = ImageIO.read(new File(file+".jpg"));
    	} catch (IOException e) {
    	}
    }
}
