import java.io.BufferedReader;
import java.io.InputStreamReader;
public class WaterMelon {
	
//	One hot summer day Pete and his friend Billy decided to buy a watermelon. They chose the biggest and the ripest one, in their opinion. 
//	After that the watermelon was weighed, and the scales showed w kilos. 
//	They rushed home, dying of thirst, and decided to divide the berry, however they faced a hard problem.
//
//	Pete and Billy are great fans of even numbers, that's why they want to divide the watermelon in such a way 
//	that each of the two parts weighs even number of kilos, at the same time it is not obligatory that the parts are equal. 
//	The boys are extremely tired and want to start their meal as soon as possible, that's why you should help them and find out, 
//	if they can divide the watermelon in the way they want. For sure, each of them should get a part of positive weight.
//
//	Input
//	The first (and the only) input line contains integer number w (1 ≤ w ≤ 100) — the weight of the watermelon bought by the boys.
//
//	Output
//	Print YES, if the boys can divide the watermelon into two parts, each of them weighing even number of kilos; and NO in the opposite case.
//	
	
//	abbiamo un numero, come posso definire se c'è un modo di ottenerlo mediante la somma
//	di due numeri pari (una qualsiasi coppia di numeri positivi pari)?
//	Quindi ci chiediamo se si può dividere un numero in due numeri pari. 
//
//	Intuizione: semplicemente il numero deve essere diverso da due ed essere comunque pari.
//	In realtà, c'è un'atra intuzione: consideriamo di avere zero da una parte e il nostro numero
//	dall'altra. per ottenerlo facciamo: numero + 0, numero-1 + 1, numero-2 + 2. Quando il nostro
//	numero è pari, a ogni iterazione di questo procedimento, il numero che ho a sinistra e
//	il numero che ho a destra sono pari, mentre se il nostro numero è dispari, avrò sempre
//	un numero pari da una parte e un numero dispari dall'altra, quindi non è possibile dividere
//	il numero in due parti che siano pari.

	
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(Integer.parseInt(str) < 1 || Integer.parseInt(str) > 100 || Integer.parseInt(str) == 2 ) {
        		System.out.println("No"); 
        } else {
        	if(Integer.parseInt(str) % 2 == 0) {
        		System.out.println("Yes"); 
        	} else {
        		System.out.println("No"); 
        	}
        }
    }  
}