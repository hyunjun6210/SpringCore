package hello.core.member;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Primary
@Component //Component scan 하려면 붙여야함, 컴포넌트 등록 시 앞에 소문자 변경 : memoryMemberRepository
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    @Override
//    public void save(Member member) {
//        store.put(member.getId(), member);
//    }
    public void save(Member member) {
        store.put(member.getId(), member);
    }
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
