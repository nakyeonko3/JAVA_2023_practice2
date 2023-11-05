package org.example2;

public class Member {
    public String name;
    public String addr;
    public String phone;

    public Member(){

    }

    public void introdunce(){
        System.out.println(addr+" 사는 "+name+"이고 전화번호는 "+phoneFormater(phone)+" 입니다. ");
    }

    public String phoneFormater(String phone){
        return phone.substring(0,3)+"-"+phone.substring(3,7)+"-"+phone.substring(7);
    }

}

