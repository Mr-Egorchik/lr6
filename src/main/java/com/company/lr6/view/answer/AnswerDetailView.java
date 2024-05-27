package com.company.lr6.view.answer;

import com.company.lr6.entity.Answer;

import com.company.lr6.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "answers/:id", layout = MainView.class)
@ViewController("Answer.detail")
@ViewDescriptor("answer-detail-view.xml")
@EditedEntityContainer("answerDc")
public class AnswerDetailView extends StandardDetailView<Answer> {
}