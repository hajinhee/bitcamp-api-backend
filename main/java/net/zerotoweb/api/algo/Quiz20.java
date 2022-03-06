package net.zerotoweb.api.algo;

import java.util.Scanner;

/**
 * packageName: net.zerotoweb.api.algo
 * fileName   : Quiz00
 * author     : HAJINHEE
 * date       : 2022-03-06
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-03-06   HAJINHEE    최초 생성
 */
public class Quiz20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("20팀");
            switch (scanner.next()) {
                case "20":
                    quiz20team();
                    break;

            }
        }
    } // main

    static void quiz20team() {
        String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                        "정렬", "해시", "힙", "완전탐색", "DP",
                        "스택", "깊이우선탐색", "그래프", "탐욕법", "이중탐색",
                        "큐", "너비우선탐색"};

        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                System.out.print("\n");
            }
            System.out.print(i + ". " + arr[i] + "\t");
        }

        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        String leader = "";
        String l = "하진희";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(l)) {
                for (int j = 0; j < 3; j++) {
                    leader += arr[i + j * 5] + ",";
                }
            }if (i == 16) {break;}
        }System.out.println(leader);

        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 ");
        String qManager = "";
        String subject = "";
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("큐")){
                qManager += arr[i]+ "(을)를 담당한 사람: " +arr[i%5];
            }
        }
        System.out.println(qManager);

        System.out.println("Q4. 팀원별 과제 수를 출력하세요. 예) 김지혜(3개), 최은아(3개), 심민혜(2개), 권솔이(2개), 하진희(2개)");
        int[] array = new int[5];  //과목 수가 들어갈 공간 만들기
        String res = "";
        for (int i = 5; i < arr.length; i++) {
            int a = i % 5;
            for (int j = 0; j < 5; j++) {
                if (a == j) {
                    array[j]++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + "(" + array[i] + "개)";
            if (i < 4) {
                res += ", ";
            }
        }
        System.out.println(res);
    }

    }


