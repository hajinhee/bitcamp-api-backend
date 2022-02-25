package net.zerotoweb.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: net.zerotoweb.api.member.domain
 * fileName   : MemberDTO
 * author     : HAJINHEE
 * date       : 2022-02-14
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-14   HAJINHEE    최초 생성
 */
@Data
@Component
public class MemberDTO {
    private String userId;
    private String name;
    private double height;
    private String address;
    private String phone;
    private double weight;
    private String regdate;

    private String id;
    private String password;
    private int kor;
    private int eng;
    private int math;

}
