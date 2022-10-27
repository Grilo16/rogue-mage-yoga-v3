package com.example.roguemageyogav3.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonTeacherService {

    LessonsTeacherRepository lessonsTeacherRepository;

    @Autowired
    public LessonTeacherService(LessonsTeacherRepository lessonsTeacherRepository) {
        this.lessonsTeacherRepository = lessonsTeacherRepository;
    }

    public List<LessonsTeacher> getAllLessonTeachers() {
        return lessonsTeacherRepository.findAll();
    }
}
