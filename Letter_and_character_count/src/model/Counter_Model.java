/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.Counter_Controller;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
/**
 *
 * @author Admin
 */
public class Counter_Model{
    //tao bo dem chu cai
    private Map<Character, Integer> charCounter = new HashMap<Character, Integer>();
    //tao bo dem tu
    private Map<String, Integer> wordCounter = new HashMap<String, Integer>();
    
    public Map<Character, Integer> getCharCounter() {
        return charCounter;
    }

    public Map<String, Integer> getWordCounter() {
        return wordCounter;
    }
    
    public void analyze(String content) {
        //dem chu cai
        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                continue;
            }
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1);
            } else {
                charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
            }
        }
        
        //dem tu
        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            if (!wordCounter.containsKey(token)){
                wordCounter.put(token, 1);
            } else {
                wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
            }
        }
    }
}

