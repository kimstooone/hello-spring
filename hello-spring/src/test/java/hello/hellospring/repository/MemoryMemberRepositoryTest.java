package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }
    
    @Test
    public void save(){
        Member member = new Member();
        member.setName("kjy");
        repository.save(member);
        Member result = repository.findById(member.getId()).get();
    }

    @Test
    public void findbyName(){

    }
    @Test
    public void findAll(){

    }


}