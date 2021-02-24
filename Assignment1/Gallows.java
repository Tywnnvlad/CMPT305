public class Gallows{

    private int errorCount;
    private static final int MAXLIFE = 8;
    private  int life = MAXLIFE;

    public void incrementHangman(){
        int currentLife = life-errorCount;
        System.out.println("ERROR, Lives Left: "+ currentLife);
        errorCount++;
    }
    public boolean isDead(){
        if (errorCount == life) return false;
        else return true;
    }
    public String toString(){
        String gallowMsg = "";
        if(errorCount == 0){
            gallowMsg += "test string";
        }
        return gallowMsg;
    }
}