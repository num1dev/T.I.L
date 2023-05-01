package com.example.springedu.controller;

import com.example.springedu.domain.TeamDTO;
import com.example.springedu.domain.TeamMemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyTeamController {
    @RequestMapping(value = "/myteam", produces = "application/json; charset=utf-8")  // text/json
    @ResponseBody
    public TeamDTO getByIdInJSON() {
        TeamMemberVO vo1 = new TeamMemberVO();
        vo1.setName("홍서진");
        vo1.setNicName("올라프");
        vo1.setFood("양꼬치");

        TeamMemberVO vo2 = new TeamMemberVO();
        vo2.setName("김창헌");
        vo2.setNicName("올");
        vo2.setFood("양");

        TeamMemberVO vo3 = new TeamMemberVO();
        vo3.setName("강예원");
        vo3.setNicName("라");
        vo3.setFood("치");

        TeamMemberVO vo4 = new TeamMemberVO();
        vo4.setName("김용욱");
        vo4.setNicName("프");
        vo4.setFood("양양");

        TeamDTO dto = new TeamDTO();
        dto.setTeamName("Synergy");

        List<TeamMemberVO> teamMemberList = new ArrayList<>();
        teamMemberList.add(vo1);
        teamMemberList.add(vo2);
        teamMemberList.add(vo3);
        teamMemberList.add(vo4);

        dto.setTeamMember(teamMemberList);
        return dto;

    }
}




