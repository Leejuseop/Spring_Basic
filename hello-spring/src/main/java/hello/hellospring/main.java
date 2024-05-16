package hello.hellospring;

import java.util.Optional;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;

public class main {
    public static void main(String[] args) {
        MemberRepository repos = new MemoryMemberRepository();
        MemberService ms = new MemberService(repos);
        Member member = new Member();
        member.setId(0L);
        member.setName("juseop");

        ms.join(member);
        Optional<Member> member1 = ms.findOne(1L);

    }
}
