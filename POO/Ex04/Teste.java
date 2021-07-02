package Ex04;

public class Teste{
	
    public static void main(String[] args){
           Boolean b = new Boolean(false);
           Object o = (Object) b;
           String p = (String) o;
           System.out.println(p.length());
    }
}