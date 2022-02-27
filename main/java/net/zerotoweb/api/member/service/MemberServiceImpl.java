package net.zerotoweb.api.member.service;

import lombok.RequiredArgsConstructor;
import net.zerotoweb.api.member.domain.CalcDTO;
import net.zerotoweb.api.member.domain.MemberDTO;
import net.zerotoweb.api.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

/**
 * packageName: net.zerotoweb.api.member.service
 * fileName   : MemberServiceImpl
 * author     : HAJINHEE
 * date       : 2022-02-14
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-14   HAJINHEE    최초 생성
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository repository;

    @Override
    public String login(MemberDTO login) {
        String id = login.getId();
        String password = login.getPassword();
        return (password.equals("abc") ? String.format("아이디 %s 로그인 성공", id) :
                String.format("아이디 %s은 맞고, 패스워드 %s은 틀렸습니다. 로그인 실패", id, password));
    }

    @Override
    public String bmi(MemberDTO bmi) {
        String name = bmi.getName();
        double height = bmi.getHeight();
        double weight = bmi.getWeight();
        String res = "";
        double b = weight/ (height * height) * 10000;
        if (b >= 35) {
            res = "고도비만";
        } else if (b >= 30) {
            res = "중도비만";
        } else if (b >= 25) {
            res = "경도비만";
        } else if (b >= 23) {
            res = "과체중";
        } else if (b >= 18.5) {
            res = "정상";
        } else {
            res = "저체중";
        }
        return String.format("%s님의 키: %.2f 몸무게: %.2f, bmi 지수는 %s 입니다.",
                name, height, weight, res);
    }

    @Override
    public String grade(MemberDTO grade) {
        String name = grade.getName();
        int kor = grade.getKor();
        int eng = grade.getEng();
        int math = grade.getMath();
        int sum = kor+eng+math;
        int avg = sum/3;
        String pass = (avg>=80) ? "합격" : "불합격";
        return String.format("%s님 국어점수: %d, 영어점수: %d, 수학점수: %d 평균 %d점으로 %s입니다.",
                name, kor, eng, math, avg, pass);
    }

    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
        switch (op){
            case "+" : res = a+b; break;
            case "-" : res = a-b; break;
            case "*" : res = a*b; break;
            case "/" : res = a/b; break;
            case "%" : res = a%b; break;
        }
        return String.format("%d %s %d = %d", a, op, b, res);
    }
}
