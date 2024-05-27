package com.company.lr6.security;

import com.company.lr6.entity.Answer;
import com.company.lr6.entity.Task;
import com.company.lr6.entity.User;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "Professor", code = ProfessorRole.CODE)
public interface ProfessorRole {
    String CODE = "professor";

    @EntityAttributePolicy(entityClass = Task.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Task.class, actions = EntityPolicyAction.ALL)
    void task();

    @EntityAttributePolicy(entityClass = Answer.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Answer.class, actions = EntityPolicyAction.READ)
    void answer();

    @MenuPolicy(menuIds = {"Task_.list", "Answer.list"})
    @ViewPolicy(viewIds = {"Task_.list", "Answer.list", "Task_.detail", "Answer.detail", "User.list"})
    void screens();

    @EntityAttributePolicy(entityClass = User.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = User.class, actions = EntityPolicyAction.READ)
    void user();
}