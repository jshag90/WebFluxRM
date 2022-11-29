package com.smt.endpoint;

import com.smt.repository.Member;
import com.smt.vo.NewMember;
import com.smt.repository.MemberRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class MemberEndpoint {

    private final MemberRepository memberRepository;

    public MemberEndpoint(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/member/{id}")
    public Mono<Member> findMember(@PathVariable long id) {
        System.out.println("/member/{id}");
        return memberRepository.findById(id);
    }

    @PostMapping("/member")
    public Mono<Member> createMember(@RequestBody NewMember newMember) {
        System.out.println("/member");
        return Mono.just(newMember)
                .map(it -> Member.newMember(it.getName()))
                .flatMap(memberRepository::save);
    }

    @DeleteMapping("/member/name/{name}")
    public Mono<Void> removeMember(@PathVariable String name) {
        return Mono.just(name)
                .flatMap(memberRepository::findFirstByName)
                .flatMap(memberRepository::deleteById);
    }

    @PutMapping("/member/name/{name}")
    public Mono<Member> updateMemberName(@PathVariable String name, @RequestParam String newName) {
        return Mono.just(name)
                .flatMap(memberRepository::findFirstByName)
                .map(id -> Member.updateMember(id, newName))
                .flatMap(memberRepository::save);
    }
}