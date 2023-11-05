package org.example;

import lombok.Builder;

@Builder
public class Member {
    private String name;
    private String addr;
    private String phone;

    public Member(String name, String addr, String phone) {
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }

    public Member() {

    }

    public void introdunce(){
        System.out.println(addr+" 사는 "+name+"이고 전화번호는 "+phoneFormater(phone)+" 입니다. ");
    }

    public String phoneFormater(String phone){
        return phone.substring(0,3)+"-"+phone.substring(3,7)+"-"+phone.substring(7);
    }

}

