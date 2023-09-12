package view;

import controller.Counter_Controller;
import java.util.Map;
import java.util.Scanner;
import model.Counter_Model;

public class Main {
    
    public static void display(Map<Character, Integer> charCounter, Map<String, Integer> wordCounter) {
        System.out.println(wordCounter);
        System.out.println(charCounter);      
    }
    
    public static void main(String[] args) {
        System.out.println("Enter your content: ");
        Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();
        
        Counter_Model model = new Counter_Model();
        Counter_Controller controller = new Counter_Controller(model);
        
        controller.analyzeContent(content);
        display(model.getCharCounter(), model.getWordCounter());
    }
}