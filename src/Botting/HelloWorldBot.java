/**
 * @author Bryce Young
 * made 9/26/2017
 */

package Botting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class HelloWorldBot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robb = new Robot();
		
		
		
		//Opens RUN
		robb.keyPress(KeyEvent.VK_WINDOWS);
		robb.keyPress(KeyEvent.VK_R);
		robb.keyRelease(KeyEvent.VK_WINDOWS);
		robb.keyRelease(KeyEvent.VK_R);
		TimeUnit.SECONDS.sleep(1);
		//Opens Notepad
		robb.keyPress(KeyEvent.VK_BACK_SPACE);
		robb.keyPress(KeyEvent.VK_N);
		robb.keyRelease(KeyEvent.VK_N);
		robb.keyPress(KeyEvent.VK_O);
		robb.keyRelease(KeyEvent.VK_O);
		robb.keyPress(KeyEvent.VK_T);
		robb.keyRelease(KeyEvent.VK_T);
		robb.keyPress(KeyEvent.VK_E);
		robb.keyRelease(KeyEvent.VK_E);
		robb.keyPress(KeyEvent.VK_P);
		robb.keyRelease(KeyEvent.VK_P);
		robb.keyPress(KeyEvent.VK_A);
		robb.keyRelease(KeyEvent.VK_A);
		robb.keyPress(KeyEvent.VK_D);
		robb.keyRelease(KeyEvent.VK_D);
		robb.keyPress(KeyEvent.VK_ENTER);
		robb.keyRelease(KeyEvent.VK_ENTER);
		
		//Types code into notepad
		TimeUnit.SECONDS.sleep(1);
	
		String lineOne = "class HeloWorld{";
		Character[] lineOneCharArray = stringToChar(lineOne);
		connectToBot(lineOneCharArray);
		robb.keyPress(KeyEvent.VK_ENTER);
		robb.keyRelease(KeyEvent.VK_ENTER);
		
		String lineTwo = "	public static void main(String[] args) {";
		Character[] lineTwoCharArray = stringToChar(lineTwo);
		connectToBot(lineTwoCharArray);
		robb.keyPress(KeyEvent.VK_ENTER);
		robb.keyRelease(KeyEvent.VK_ENTER);
		
		String lineThree = "		System.out.println(\"Hello World!\");";
		Character[] lineThreeCharArray = stringToChar(lineThree);
		connectToBot(lineThreeCharArray);
		robb.keyPress(KeyEvent.VK_ENTER);
		robb.keyRelease(KeyEvent.VK_ENTER);
		
		String lineFour = "	}";
		Character[] lineFourCharArray = stringToChar(lineFour);
		connectToBot(lineFourCharArray);
		robb.keyPress(KeyEvent.VK_ENTER);
		robb.keyRelease(KeyEvent.VK_ENTER);
		
		String lineFive = "}";
		Character[] lineFiveCharArray = stringToChar(lineFive);
		connectToBot(lineFiveCharArray);
		
		//Opens save prompt
		robb.keyPress(KeyEvent.VK_CONTROL);
		robb.keyPress(KeyEvent.VK_S);
		robb.keyRelease(KeyEvent.VK_S);
		robb.keyRelease(KeyEvent.VK_CONTROL);
		
		TimeUnit.SECONDS.sleep(1);
		//Writes save name
		String saveName = "HeloWorld.java";
		Character[] saveNameCharArray = stringToChar(saveName);
		connectToBot(saveNameCharArray);
		//key command to save as java type
		robb.keyPress(KeyEvent.VK_TAB);
		robb.keyRelease(KeyEvent.VK_TAB);
		robb.keyPress(KeyEvent.VK_DOWN);
		robb.keyRelease(KeyEvent.VK_DOWN);
		robb.keyPress(KeyEvent.VK_ENTER);
		robb.keyRelease(KeyEvent.VK_ENTER);
		robb.keyPress(KeyEvent.VK_ENTER);
		robb.keyRelease(KeyEvent.VK_ENTER);
		
		//Opens RUN
		
		robb.keyPress(KeyEvent.VK_WINDOWS);
		robb.keyPress(KeyEvent.VK_R);
		robb.keyRelease(KeyEvent.VK_WINDOWS);
		robb.keyRelease(KeyEvent.VK_R);
		TimeUnit.SECONDS.sleep(2);
		
		robb.keyPress(KeyEvent.VK_C);
		robb.keyRelease(KeyEvent.VK_C);
		robb.keyPress(KeyEvent.VK_M);
		robb.keyRelease(KeyEvent.VK_M);
		robb.keyPress(KeyEvent.VK_D);
		robb.keyRelease(KeyEvent.VK_D);
		robb.keyPress(KeyEvent.VK_ENTER);
		robb.keyRelease(KeyEvent.VK_ENTER);
		TimeUnit.SECONDS.sleep(1);
		
		String cdDesktop = "cd %userprofile%\\desktop";
		Character[] cdDesktopArray = stringToChar(cdDesktop);
		connectToBot(cdDesktopArray);
		robb.keyPress(KeyEvent.VK_ENTER);
		robb.keyRelease(KeyEvent.VK_ENTER);
		
		String compile = "javac "+saveName;
		Character[] compileArray = stringToChar(compile);
		connectToBot(compileArray);
		robb.keyPress(KeyEvent.VK_ENTER);
		robb.keyRelease(KeyEvent.VK_ENTER);
		TimeUnit.SECONDS.sleep(1);
		
		String helloWorld = "java HelloWorld";
		Character[] helloWorldArray = stringToChar(helloWorld);
		connectToBot(helloWorldArray);
		robb.keyPress(KeyEvent.VK_ENTER);
		robb.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
	public static void connectToBot(Character[] inputArray) throws AWTException{
		int sizeOfArray = inputArray.length;
		for(int i = 0; i < sizeOfArray; i++){
			write(inputArray[i]);
		}
	}
	
	public static Character[] stringToChar (String inputString){
		int stringLength = inputString.length();
		Character [] characterArray = new Character[stringLength];
		
		for(int i = 0; i< inputString.length();i++){
			characterArray[i] = new Character(inputString.charAt(i));
		}
		
		return characterArray;
	}
	
	public static void write(char letter) throws AWTException{
		
		//Thanks to Kanyon on javaprogrammingforums.com for the following code
		
		Robot robby = new Robot();
        switch (letter) {
        case 'a': robby.keyPress(KeyEvent.VK_A); break;
        case 'b': robby.keyPress(KeyEvent.VK_B); break;
        case 'c': robby.keyPress(KeyEvent.VK_C); break;
        case 'd': robby.keyPress(KeyEvent.VK_D); break;
        case 'e': robby.keyPress(KeyEvent.VK_E); break;
        case 'f': robby.keyPress(KeyEvent.VK_F); break;
        case 'g': robby.keyPress(KeyEvent.VK_G); break;
        case 'h': robby.keyPress(KeyEvent.VK_H); break;
        case 'i': robby.keyPress(KeyEvent.VK_I); break;
        case 'j': robby.keyPress(KeyEvent.VK_J); break;
        case 'k': robby.keyPress(KeyEvent.VK_K); break;
        case 'l': robby.keyPress(KeyEvent.VK_L); break;
        case 'm': robby.keyPress(KeyEvent.VK_M); break;
        case 'n': robby.keyPress(KeyEvent.VK_N); break;
        case 'o': robby.keyPress(KeyEvent.VK_O); break;
        case 'p': robby.keyPress(KeyEvent.VK_P); break;
        case 'q': robby.keyPress(KeyEvent.VK_Q); break;
        case 'r': robby.keyPress(KeyEvent.VK_R); break;
        case 's': robby.keyPress(KeyEvent.VK_S); break;
        case 't': robby.keyPress(KeyEvent.VK_T); break;
        case 'u': robby.keyPress(KeyEvent.VK_U); break;
        case 'v': robby.keyPress(KeyEvent.VK_V); break;
        case 'w': robby.keyPress(KeyEvent.VK_W); break;
        case 'x': robby.keyPress(KeyEvent.VK_X); break;
        case 'y': robby.keyPress(KeyEvent.VK_Y); break;
        case 'z': robby.keyPress(KeyEvent.VK_Z); break;
        case 'A': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_A); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'B': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_B); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'C': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_C); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'D': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_D); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'E': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_E); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'F': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_F); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'G': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_G); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'H': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_H); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'I': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_I); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'J': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_J); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'K': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_K); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'L': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_L); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'M': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_M); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'N': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_N); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'O': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_O); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'P': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_P); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'Q': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_Q); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'R': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_R); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'S': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_S); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'T': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_T); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'U': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_U); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'V': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_V); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'W': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_W); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'X': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_X); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'Y': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_Y); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case 'Z': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_Z); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '`': robby.keyPress(KeyEvent.VK_BACK_QUOTE); break;
        case '0': robby.keyPress(KeyEvent.VK_0); break;
        case '1': robby.keyPress(KeyEvent.VK_1); break;
        case '2': robby.keyPress(KeyEvent.VK_2); break;
        case '3': robby.keyPress(KeyEvent.VK_3); break;
        case '4': robby.keyPress(KeyEvent.VK_4); break;
        case '5': robby.keyPress(KeyEvent.VK_5); break;
        case '6': robby.keyPress(KeyEvent.VK_6); break;
        case '7': robby.keyPress(KeyEvent.VK_7); break;
        case '8': robby.keyPress(KeyEvent.VK_8); break;
        case '9': robby.keyPress(KeyEvent.VK_9); break;
        case '-': robby.keyPress(KeyEvent.VK_MINUS); break;
        case '=': robby.keyPress(KeyEvent.VK_EQUALS); break;
        case '~': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_BACK_QUOTE); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '!': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_1); robby.keyRelease(KeyEvent.VK_SHIFT);; break;
        case '@': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_2); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '#': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_3); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '$': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_4); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '%': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_5); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '^': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_6); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '&': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_7); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '*': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_8); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '(': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_9); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case ')': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_0); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '_': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_MINUS); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '+': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_EQUALS); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '[': robby.keyPress(KeyEvent.VK_OPEN_BRACKET); break;
        case ']': robby.keyPress(KeyEvent.VK_CLOSE_BRACKET); break;
        case '\\': robby.keyPress(KeyEvent.VK_BACK_SLASH); break;
        case '{': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_OPEN_BRACKET); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '}': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_CLOSE_BRACKET); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '|': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_BACK_SLASH); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case ';': robby.keyPress(KeyEvent.VK_SEMICOLON); break;
 
        case ':': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_SEMICOLON); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '\'': robby.keyPress(KeyEvent.VK_QUOTE); break;
        case '"': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_QUOTE); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case ',': robby.keyPress(KeyEvent.VK_COMMA); break;
        case '<': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_COMMA); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '.': robby.keyPress(KeyEvent.VK_PERIOD); break;
        case '>': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress(KeyEvent.VK_PERIOD); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case '/': robby.keyPress(KeyEvent.VK_SLASH); break;
        case '?': robby.keyPress(KeyEvent.VK_SHIFT); robby.keyPress( KeyEvent.VK_SLASH); robby.keyRelease(KeyEvent.VK_SHIFT); break;
        case ' ': robby.keyPress(KeyEvent.VK_SPACE); break;
        }
	}
	

}
