package com.company.lr6.security;

import com.company.lr6.entity.Answer;
import com.company.lr6.entity.Task;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "Student", code = StudentRole.CODE)
public interface StudentRole {
    String CODE = "student";

    @EntityAttributePolicy(entityClass = Answer.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Answer.class, actions = EntityPolicyAction.ALL)
    void answer();

    @EntityAttributePolicy(entityClass = Task.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Task.class, actions = EntityPolicyAction.READ)
    void task();

    @MenuPolicy(menuIds = {"Task_.list", "Answer.list"})
    @ViewPolicy(viewIds = {"Task_.list", "Answer.list", "Answer.detail", "Task_.detail", "User.list", "User.detail"})
    void screens();
}