package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Component scan 하려면 붙여야함
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Autowired // Component 사용 시 자동 의존 관계 주입, ac,getBean(MemberRepository.class), 생성자가 1개면 생략 가능
    public MemberServiceImpl(  MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
