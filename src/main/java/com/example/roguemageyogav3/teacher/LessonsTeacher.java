package com.example.roguemageyogav3.teacher;

import com.example.roguemageyogav3.Lesson.Lesson;
import com.example.roguemageyogav3.user.User;

import javax.persistence.*;

@Entity
@Table(name = "lessons_teachers")
public class LessonsTeacher {
    @EmbeddedId
    private LessonsTeacherId id;

    @MapsId("lessonId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lesson_id", nullable = false)
    private Lesson lesson;

    @MapsId("teachersId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "teachers_id", nullable = false)
    private User teachers;

    @Column(name = "admin", nullable = false)
    private Boolean admin = false;

    @Column(name = "payment", nullable = false)
    private Long payment;

    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public LessonsTeacherId getId() {
        return id;
    }

    public void setId(LessonsTeacherId id) {
        this.id = id;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public User getTeachers() {
        return teachers;
    }

    public void setTeachers(User teachers) {
        this.teachers = teachers;
    }

}