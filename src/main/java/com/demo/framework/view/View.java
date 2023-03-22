package com.demo.framework.view;

import com.demo.framework.model.Model;

import java.lang.module.ModuleFinder;

public interface View {

    String render(Model model);
}
