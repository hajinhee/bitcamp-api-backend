package net.zerotoweb.api.algo;

import java.util.Scanner;

/**
 * packageName: net.zerotoweb.api.algo
 * fileName   : Quiz20
 * author     : HAJINHEE
 * date       : 2022-03-06
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-03-06   HAJINHEE    최초 생성
 */
public class Quiz00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("00.계산기 01.Bmi 02.주사위 03.가위바위보 04.윤년 05.숫자추론 06.로또 07.예약 08.입출금 09.구구단");
            switch (scanner.next()){
                case "00": quiz00calc(); break;
                case "01": quiz01bmi(); break;
                case "02": quiz02dice(); break;
                case "03": quiz03rps(); break;
                case "04": quiz04leap(); break;
                case "05": quiz05guess(); break;
                case "06": quiz06lotto(); break;
                case "07": quiz07booking(); break;
                case "08": quiz08bank(scanner); break;
                case "09": quiz09gugudan(); break;
                default:return;
            }
        }
    } // main

    static void quiz00calc() {
        int num1 = (int)(Math.random()*100)+1;
        int num2 = (int)(Math.random()*100)+1;
        String[] opcode = {"+", "-", "*", "/", "%"};
        String op = opcode[(int) ((Math.random())*4+1)];
        int res = 0;
        switch (op) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
            case "%":
                res = num1 % num2;
                break;
            default: break;
        }
        System.out.println(num1+""+op+""+num2+"="+res);

    }

    static void quiz01bmi() {
        double height = (int)(Math.random()*200)+1;
        double weight = (int)(Math.random()*100)+1;
        String res;
        double bmi = weight / (height * height) * 10000;
        if (bmi >= 35) {
            res = "고도비만";
        } else if (bmi >= 30) {
            res = "중도비만";
        } else if (bmi >= 25) {
            res = "경도비만";
        } else if (bmi >= 23) {
            res = "과체중";
        } else if (bmi >= 18.5) {
            res = "정상";
        } else {
            res = "저체중";
        }
        System.out.println("키:"+height+"\n몸무게:"+weight+"\nBMI결과:"+res);
    }

    static void quiz02dice() {
        int count = 1;
        while (true){
            int a = (int) (Math.random()*6)+1;
            int b = (int) (Math.random()*6)+1;
            System.out.println(count+"번째 시도"+"\n첫번째 주사위:"+a+"\n두번째 주사위:"+b);
            count++;
            if (a==b){
                break;
            }

        }
    }

    static void quiz03rps() {
        int com = (int) (Math.random()*3)+1;    //랜덤함수 이용하여 1~3까지 랜덤 정수 뽑기
        int user = (int) (Math.random()*3)+1;
        int score = user-com; //같은 숫자를 내면 0으로 무승부, 사용자가 낸 수가 컴퓨터가 낸 수보다 -1이거나 2면 사용자 승, 그 외 패배
        String[] rsps = { "", "주먹", "가위", "보"}; //주먹=1, 가위=2, 보=3
        String res = "무승부";
        if(score!=0) res = (score==-1 || score==2) ? "사용자 승" : "컴퓨터 승";
        System.out.println("컴퓨터:" +rsps[com]+ " 사용자:" +rsps[user]+ "\n" +res);
    }

    static void quiz04leap() {
        int year = (int) (Math.random() * 3000) + 1;
        String res = "";
        res = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "년은 윤년입니다." : "년은 평년입니다.";
        System.out.println(year+res);
    }

    static void quiz05guess() {
        int num1 = (int) (Math.random()*50)+1;
        int num2 = (int) (Math.random()*100)+1;
        String res;
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.print("["+i+"] ");
                count++;
            }
        }
        res = String.format("\n%d과 %d 사이의 소수는 총 %d개 입니다.", num1, num2, count);
        System.out.println(res);
    }

    static void quiz06lotto() {
        int[] comNumbers = new int[6];
        int[] userNumbers = new int[6];
        int count = 0;

        System.out.println("랜덤번호");
        for (int i=0; i<userNumbers.length; i++) {
            userNumbers[i] = (int)(Math.random()*45)+1;
            for (int j=0; j<i; j++){
                if (userNumbers[i]==userNumbers[j]){
                    userNumbers[i]--;
                }
            }
            System.out.print("[" +userNumbers[i]+ "] ");
        }

        System.out.println("\n당첨번호");
        for (int i=0; i<comNumbers.length; i++) {
            comNumbers[i] = (int)(Math.random()*45)+1;
            for (int j=0; j<i; j++){
                if (comNumbers[i]==comNumbers[j]){
                    comNumbers[i]--;
                }
            }
            System.out.print("[" +comNumbers[i]+ "] ");
        }
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                if (comNumbers[i]==userNumbers[j]) {
                    count++;
                }
            }
        }
        System.out.println(" "+count+"개 맞았습니다.");
        }

    static void quiz07booking() {

    }

    static void quiz08bank(Scanner scanner) {
        int money = (int)(Math.random()*50000)+1;
        int totalMoney = money + (int)(Math.random()*50000)+1;
        String res = "";
        while (true){
            System.out.println("1.입금 2.출금 3.잔고확인");
            switch (scanner.nextInt()) {
                case 1:
                    totalMoney += money;
                    res = String.format("입금액: %d 잔액: %d", money, totalMoney);
                    break;
                case 2:
                    totalMoney -= money;
                    res = String.format("출금액: %d 잔액: %d", money, totalMoney);
                    break;
                case 3:
                    res = String.format("잔고: %d", totalMoney);
                    break;
                default:
                    return;
            }
            System.out.println(res);
        }
    }

    static void quiz09gugudan() {
        for (int i = 2; i < 10; i+=4) {
            for (int j = 1; j < 10; j++) {
                for (int k = i; k < i+4; k++) {
                    System.out.print((k + "*"+j+"="+(k*j)+"\t"));
                }
                System.out.println();
            }System.out.println();
        }
    }
}
