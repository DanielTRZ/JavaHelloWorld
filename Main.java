import java.util.Arrays;

public class Main {
public static void main(String[] args) {
System.out.println("Hello Daniel");
		
int age = 27;
age = age +1;
age += 1; 
age ++;
		
boolean isAdmin = true;
boolean userCanOpenPage = age >= 18 && isAdmin ;
				
if(userCanOpenPage) {
System.out.println("Masz 18");
		}else {
			System.out.println("Nie masz 18");
		}
				
		double randomNumber = Math.random();
		boolean czyWygrana = randomNumber >= 0.8 ;
		boolean czyWygrana2 = randomNumber >= 0.6;
			
		if(czyWygrana) {
			System.out.println("Wygrałeś 1 nagrodę");}
		else if(czyWygrana2) {
			System.out.println("Wygrałeś 2 nagrodę");
		}
		else {
			System.out.println("Nie wygrałeś");
		}
		
		
		if(czyWygrana) {
			System.out.println("Wygrałeś 1 nagrodę");}
		
		if(czyWygrana2) {
			System.out.println("Wygrałeś 2 nagrodę");
		}
		else {
			System.out.println("Nie wygrałeś");
		}
		
		if(randomNumber >= 0.6) {
			System.out.println("Wygrałeś 2 nagrodę");}
		
		if(randomNumber >= 0.8) {
			System.out.println("Wygrałeś 1 nagrodę");
		}
		else {
			System.out.println("Nie wygrałeś");
		}
			
		
		String[] namesOfParticipants = {"Monika","Klaudia","Iwona","Małgosia","Asia"};
		System.out.println(namesOfParticipants[1]);
		System.out.println(namesOfParticipants.length);
			
		namesOfParticipants[0] = "Ela";
		System.out.println(namesOfParticipants[0]);
		
		System.out.println(Arrays.toString(namesOfParticipants));	
		
		String[] userCars = new String[4];
		userCars[0] = "Fiat Panda";
		userCars[1] = "Mercedes";
		userCars[2] = "Bmw";
		userCars[3] = "Audi";
		System.out.println( "Samochody do wypożyczenia  :" + Arrays.toString(userCars));
		
		String[] wiekUzytkownikow = new String[4];
		wiekUzytkownikow[0] = "Lat 25";
		wiekUzytkownikow[1] = "Lat 36";
		wiekUzytkownikow[2] = "Lat 40";
		wiekUzytkownikow[3] = "Lat 56";
		System.out.println( "Wiek Użytkowników" + Arrays.toString(wiekUzytkownikow));
		
		 int liczba = 1; 
		 while(liczba <= 5) {
			 
			 System.out.println("Liczba: " + liczba);
			 liczba = liczba + 1;
		 }
		
		 double liczba2 = Math.random(); 
		 while(liczba2 < 0.8){
			
			  System.out.println("Wylosowana liczba to :" + liczba2);
			 liczba2 = Math.random(); 
		      }
		      System.out.println("Wygrałeś liczba to :" + liczba2);
		
		 String[] dziewczyny = {"Monika","Klaudia","Iwona","Małgosia","Asia"};
		 for(int index = 0 ; index < 5; index++) {
			 System.out.println(dziewczyny[index]);
		 }
		  
		//String name1 ="Klaudia"; 
		//String name2 ="Klaudia";
		
		//boolean czyImionasaTeSame = name1 == name2; 
	
			
	}

}
