package com.smt.repository;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@RequiredArgsConstructor
@Table("member")
public class Member {


    @Id
    @Column("id")
    private Long id;

    @Column("name")
    private String name;

    private Member(String name){
        this.id = null;
        this.name = name;
    }

    private Member(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public static Member newMember(String name){
        return new Member(name);
    }

    public static Member updateMember(Long id, String name){
        return new Member(id, name);
    }

}
