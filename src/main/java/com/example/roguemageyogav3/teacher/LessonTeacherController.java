package com.example.roguemageyogav3.teacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "teachers")
public class LessonTeacherController {

    LessonTeacherService lessonTeacherService;

    public LessonTeacherController(LessonTeacherService lessonTeacherService) {
        this.lessonTeacherService = lessonTeacherService;
    }

    @GetMapping
    public List<LessonsTeacher> getAllLessonTeachers(){
        return lessonTeacherService.getAllLessonTeachers();
    }

}
