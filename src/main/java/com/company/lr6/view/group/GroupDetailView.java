package com.company.lr6.view.group;

import com.company.lr6.entity.Group;

import com.company.lr6.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "groups/:id", layout = MainView.class)
@ViewController("Group_.detail")
@ViewDescriptor("group-detail-view.xml")
@EditedEntityContainer("groupDc")
public class GroupDetailView extends StandardDetailView<Group> {
}