package pokemon;

public class Mewtwo implements Pokemon{
    
    @Override
    public String getName(){
        return "Mewtwo";
    }
    
    @Override
    public String getType1(){
        return "Psychic";
    }
    
    @Override
    public String getType2(){
        return null;
    }
    
    @Override
    public int getIndex(){
        return 150;
    }
    
    
}