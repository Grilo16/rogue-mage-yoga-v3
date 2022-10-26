package com.example.roguemageyogav3.student;

import com.example.roguemageyogav3.Lesson.Lesson;
import com.example.roguemageyogav3.user.User;

import javax.persistence.*;

@Entity
@Table(name = "lessons_students")
public class LessonsStudent {
    @EmbeddedId
    private LessonsStudentId id;

    @MapsId("lessonId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lesson_id", nullable = false)
    private Lesson lesson;

    @MapsId("studentsId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "students_id", nullable = false)
    private User students;

    @Column(name = "review")
    private String review;

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public LessonsStudentId getId() {
        return id;
    }

    public void setId(LessonsStudentId id) {
        this.id = id;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public User getStudents() {
        return students;
    }

    public void setStudents(User students) {
        this.students = students;
    }

}