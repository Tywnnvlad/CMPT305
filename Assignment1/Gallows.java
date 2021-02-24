public class Gallows {

    private int errorCount;
    private final int life = 8;

    private void incrementHangman(){
        errorCount++;
    }
    public boolean isDead() {
        if (errorCount == life) return true;
        else return false;
    }
    public String toString(){
        String gallowMsg = "";
        if(errorCount == 0){
            gallowMsg += "test string";
        }
        return gallowMsg;
    }
}