package net.zerotoweb.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: net.zerotoweb.api.member.domain
 * fileName   : CalcDTO
 * author     : HAJINHEE
 * date       : 2022-02-25
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-25   HAJINHEE    최초 생성
 */
@Data
@Component
public class CalcDTO  {
    private int num1;
    private String opcode;
    private int num2;
}
