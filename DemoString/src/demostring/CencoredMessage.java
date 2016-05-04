/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostring;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author pc
 */
public class CencoredMessage {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String[] badWords = {"fuck","shit","hell","bitch","sex"};
        StringBuilder builder = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(message);
        while(tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            int index = -1;
            int indexInList = -1;
            for (int i = 0; i < badWords.length; i++) {
                    index = token.toLowerCase().indexOf
                    (badWords[i].toLowerCase());
                    if(index !=-1)
                    {
                        indexInList = i;
                        break;
                    }
            }
            if(index ==-1) continue;
            String replaceWord = 
                    generateStar(badWords[indexInList]);
            token = token.substring(0, index+1)
                    +replaceWord
                    +token.substring(index+replaceWord.length()+1,
                            token.length());
            
            builder.append(token);
            builder.append(" ");
                       
        }        
        System.out.println(builder.toString().trim());               
    }
            
    public static String generateStar(String word)
    {
        String result="";
        for (int i = 0; i < word.length()-1; i++) {
            result+="*";
        }
        return result;
    }
}
