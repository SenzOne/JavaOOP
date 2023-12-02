package homework7.view;

import java.util.Scanner;

public class View {


    public String prompt(){
        System.out.println("Введи строку с вида a + b");
        Scanner scanner = new Scanner(System.in);
       return scanner.nextLine();
    }

}
