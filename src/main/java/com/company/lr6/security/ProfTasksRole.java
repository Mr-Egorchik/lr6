package com.company.lr6.security;

import com.company.lr6.entity.Task;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;

@RowLevelRole(name = "prof-tasks", code = ProfTasksRole.CODE)
public interface ProfTasksRole {
    String CODE = "prof-tasks";

    @JpqlRowLevelPolicy(entityClass = Task.class, where = "{E}.user.id = :current_user_id")
    void task();
}