package hello.member;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @BeforeEach
    void initTable(){
        memberRepository.initTable();
    }


    @Transactional
    @Test
    void memberTest(){
        Member member = new Member("idA", "memberA");
        memberRepository.save(member);
        Member findMember = memberRepository.find("idA");

        assertThat(member.getMemberId()).isEqualTo(findMember.getMemberId());
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

}