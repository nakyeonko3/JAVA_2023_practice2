package org.example;

class Main {
    public static void main(String[] args) {
        Member member1 = Member.builder().
                name("홍길동").
                phone("01012345678").
                addr(Loc.Kor + " 서울시 특별시").build();

        member1.introdunce();



    }
}
