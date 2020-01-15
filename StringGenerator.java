import java.util.Scanner;
/**
A Class to generate acronyms and passwords.
@author Jackie Omekara.
*/

public class StringGenerator{
	
/**
A method  generates acronyms using a string.
@param text the string to be entered.

*/

public static String generateAcronym(String text){

Scanner scan = new Scanner(text);

String acronym = "";
while(scan.hasNext()){
	String temp = scan.next();

	if (Character.isUpperCase(temp.charAt(0)))
	{
		acronym += temp.charAt(0);
	}	
	
	if (temp.charAt(0)>=48 && temp.charAt(0)<= 57)
	{
		acronym+=temp;
	}
		
	}
	return acronym;
}
	

/**
This method generates and returns a password based on the string parameter.
@param text the string to be entered.
*/	
		
public static String generatePassword(String text){
		String password = "";
		char c;
		char x;
		int count = 1;
		Scanner scan = new Scanner(text);
		
		while(scan.hasNext()){
			String scanner = scan.next();
			if(scanner.length() >2){
				count++;
				if(count%2 ==0){
					c = scanner.charAt(scanner.length()-2);
					x = scanner.charAt(scanner.length()-1);
					if( c=='H' || c== 'h'){
						c = '#';
					}
					if(x=='H' || x=='h'){
						x= '#';
					}
				    if(x=='I' ||x=='i'){
						x='!';
					}
				
					String str1 = c + "" +x;
					str1=str1.toUpperCase();
					password+=str1;
					}
					}
				else{
					c=scanner.charAt(0);
					x=scanner.charAt(0);
					if(c=='a'||c=='A'){
						c='@';
					}
					if(c=='b'||c=='B'){
						c='6';
					}
					if(x=='a'||x=='A'){
						x='@';
					}
					if(x=='b' || x=='B'){
						x='6';
					}
					String str1=c + "" +x;
					str1=str1.toLowerCase();
					password+=str1;
				}
			}	
		return password;
}


}


	

