package com.company.lr6.view.group;

import com.company.lr6.entity.Group;

import com.company.lr6.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "groups", layout = MainView.class)
@ViewController("Group_.list")
@ViewDescriptor("group-list-view.xml")
@LookupComponent("groupsDataGrid")
@DialogMode(width = "64em")
public class GroupListView extends StandardListView<Group> {
}