package com.example.roguemageyogav3.student;

import com.example.roguemageyogav3.Lesson.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonStudentService {

    LessonsStudentRepository lessonsStudentRepository;

    @Autowired
    public LessonStudentService(LessonsStudentRepository lessonsStudentRepository) {
        this.lessonsStudentRepository = lessonsStudentRepository;
    }


    public List<LessonsStudent> getAllLessonStudents() {
        return lessonsStudentRepository.findAll();
    }
}

