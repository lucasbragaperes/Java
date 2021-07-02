package Ex03;

public class Main {
		public static void main(String[] args) {

			String palavra = "FATEC";
			String palavraInvertida = "";
			
			for(int i= palavra.length() - 1; i >= 0; i--){  
				palavraInvertida += palavra.charAt(i); 
		    }  
			
			System.out.println(palavraInvertida);
		}
	}