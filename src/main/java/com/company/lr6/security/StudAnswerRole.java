package com.company.lr6.security;

import com.company.lr6.entity.Answer;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;

@RowLevelRole(name = "StudAnswer", code = StudAnswerRole.CODE)
public interface StudAnswerRole {
    String CODE = "stud-answer";

    @JpqlRowLevelPolicy(entityClass = Answer.class, where = "{E}.user.id = :current_user_id")
    void answer();
}