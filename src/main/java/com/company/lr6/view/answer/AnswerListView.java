package com.company.lr6.view.answer;

import com.company.lr6.entity.Answer;

import com.company.lr6.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "answers", layout = MainView.class)
@ViewController("Answer.list")
@ViewDescriptor("answer-list-view.xml")
@LookupComponent("answersDataGrid")
@DialogMode(width = "64em")
public class AnswerListView extends StandardListView<Answer> {
}