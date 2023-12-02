package homework7.view;

import java.util.Scanner;

public class View {
    private int dateLength = 15;


    public String prompt(){
        System.out.print("Введи строку с вида a + b: ");
        Scanner scanner = new Scanner(System.in);
       return scanner.nextLine();
    }

    public void cleanPrint(String input){
        String substring = input.substring(dateLength);
        System.out.println(substring);
    }
}
