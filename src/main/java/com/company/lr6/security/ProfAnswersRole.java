package com.company.lr6.security;

import com.company.lr6.entity.Answer;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;

@RowLevelRole(name = "ProfAnswers", code = ProfAnswersRole.CODE)
public interface ProfAnswersRole {
    String CODE = "prof-answers";

    @JpqlRowLevelPolicy(entityClass = Answer.class, where = "{E}.task.user.id = :current_user_id")
    void answer();
}