package net.zerotoweb.api.member.service;

/**
 * packageName: net.zerotoweb.api.member.service
 * fileName   : MemberService
 * author     : HAJINHEE
 * date       : 2022-02-14
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-14   HAJINHEE    최초 생성
 */
public interface MemberService {
    String membershiplist();
    String membershipinformation();
    String checkthelist();
    String registertosendemails();
    String savingmoneylist();
    String checkthedetailsofthesavings();
    String calc();
    String bmi();
    String grade();

}
