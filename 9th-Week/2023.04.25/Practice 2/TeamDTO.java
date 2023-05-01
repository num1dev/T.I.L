package com.example.springedu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@ToString
@Getter
@Setter
public class TeamDTO {
    private String teamName;
    private List<TeamMemberVO> teamMember;
}