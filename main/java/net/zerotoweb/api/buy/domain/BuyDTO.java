package net.zerotoweb.api.buy.domain;

/**
 * packageName: net.zerotoweb.api.buy.domain
 * fileName   : BuyDTO
 * author     : HAJINHEE
 * date       : 2022-02-14
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-14   HAJINHEE    최초 생성
 */
public class BuyDTO {
    private final static BuyDTO buy = new BuyDTO();
    private BuyDTO(){}
    public static BuyDTO getInstance(){return buy;}

    private int num;
    private String memId;
    private String prodName;
    private String groupName;
    private int price;
    private int amount;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
