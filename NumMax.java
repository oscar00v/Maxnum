import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumMax {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader entrada = new BufferedReader (new
		InputStreamReader(System.in));
		int x,y,z,max;
		System.out.println("Introduce x,y,z: ");
		
		x = Integer.parseInt (entrada.readLine());
		y = Integer.parseInt (entrada.readLine());
		z = Integer.parseInt (entrada.readLine());
		if (x>y && x>z)
			max = x;
		else
			if (z>y)
				max = z;
			else
				max = y;
		System.out.println ("El m�ximo es "+ max);
		
		
	}
	

}
