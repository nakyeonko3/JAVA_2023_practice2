package org.example2;

class Main {
    public static void main(String[] args) {
        Member member = new Member();
        member.name = "홍길동";
        member.addr = Loc.Kor + "서울시 특별시";
        member.phone = "01012341344";
        member.introdunce();
    }
}
