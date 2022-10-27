package com.example.roguemageyogav3.member;


import com.example.roguemageyogav3.Lesson.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "members")
public class BusinessMemberController {

    BusinessMemberService businessMemberService;

    @Autowired
    public BusinessMemberController(BusinessMemberService businessMemberService) {
        this.businessMemberService = businessMemberService;
    }

    @GetMapping
    public List<BusinessesMember> getAllBusinessMembers(){
        return businessMemberService.getAllBusinessMembers();
    }
}
