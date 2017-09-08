package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public abstract class FluentLabel extends FluentComponent<Label> {

    public FluentLabel() {
        super(new Label());
    }

    public abstract void contentMode(ContentMode contentMode);

    public abstract void value(String value);

    public void preformatted(String value) {
        this.component.setValue(value);
        this.component.setContentMode(ContentMode.PREFORMATTED);
    }

    public void html(String value) {
        this.component.setValue(value);
        this.component.setContentMode(ContentMode.HTML);
    }
}