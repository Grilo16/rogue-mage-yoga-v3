package com.example.roguemageyogav3.teacher;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LessonsTeacherId implements Serializable {
    private static final long serialVersionUID = 5623012914195041353L;
    @Column(name = "lesson_id", nullable = false)
    private Long lessonId;

    @Column(name = "teachers_id", nullable = false)
    private Long teachersId;

    public Long getLessonId() {
        return lessonId;
    }

    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    public Long getTeachersId() {
        return teachersId;
    }

    public void setTeachersId(Long teachersId) {
        this.teachersId = teachersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LessonsTeacherId entity = (LessonsTeacherId) o;
        return Objects.equals(this.teachersId, entity.teachersId) &&
                Objects.equals(this.lessonId, entity.lessonId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teachersId, lessonId);
    }

}