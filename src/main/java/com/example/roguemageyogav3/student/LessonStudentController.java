package com.example.roguemageyogav3.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "students")
public class LessonStudentController {

    LessonStudentService lessonStudentService;

    @Autowired
    public LessonStudentController(LessonStudentService lessonStudentService) {
        this.lessonStudentService = lessonStudentService;
    }

    @GetMapping
    public List<LessonsStudent> getAllLessonStudents(){
        return lessonStudentService.getAllLessonStudents();
    }
}
