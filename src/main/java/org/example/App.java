package org.example;

import java.util.Scanner;

public class App {

    private final Scanner sc;

    public App(Scanner sc) {
        this.sc=sc;
    }

    public void run() {
        System.out.println("== 명연 앱 ==");
        long count=1;
        while (true){
         String command = sc.nextLine().trim();
         if(command.equals("종료")){
             break;
         }else if(command.equals("등록")){
             System.out.println("명언)");
             String content = sc.nextLine();
             System.out.println("작가)");
             String human = sc.nextLine();
             System.out.println(count+"번 명언이 등록되었습니다.");
             count++;
         }
        }

    }
}
