package com.company.lr6.entity;

import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "ANSWER", indexes = {
        @Index(name = "IDX_ANSWER_USER", columnList = "USER_ID"),
        @Index(name = "IDX_ANSWER_TASK", columnList = "TASK_ID")
})
@Entity
public class Answer {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "ANSWER")
    @Lob
    private String answer;

    @Column(name = "DOCUMENT")
    @Lob
    private FileRef document;

    @NotNull
    @Column(name = "DATE_")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @JoinColumn(name = "TASK_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Task task;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public FileRef getDocument() {
        return document;
    }

    public void setDocument(FileRef document) {
        this.document = document;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}