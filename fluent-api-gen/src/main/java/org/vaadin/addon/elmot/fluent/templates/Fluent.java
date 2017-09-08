package org.vaadin.addon.elmot.fluent.templates;

import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentInlineDateTimeField;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentComponent;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentLabel;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentOrderedLayout;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentPanel;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentTextArea;
import org.vaadin.addon.elmot.fluent.gen.FactoryMethod;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentCheckBox;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentComboBox;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentDateField;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentDateTimeField;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentImage;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentInlineDateField;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentLink;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentTextField;

import java.util.function.Supplier;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Fluent{

    private Fluent() {
    }

    @FactoryMethod
    public static FluentLabel label() {
        return null;
    }
    @FactoryMethod

    public static FluentPanel panel() {
        return null;
    }

    @FactoryMethod
    public static FluentComboBox comboBox() {
        return null;
    }

    @FactoryMethod
    public static FluentPanel panel(Component component) {
        return null;
    }

    public static FluentPanel panel(Supplier<? extends Component> componentSupplier) {
        return panel(componentSupplier.get());
    }

    @FactoryMethod
    public static FluentLink link() {
        return null;
    }

    @FactoryMethod
    public static FluentCheckBox checkBox() {
        return null;
    }

    @FactoryMethod
    public static FluentTextField textField () {
        return null;
    }

    @FactoryMethod
    public static FluentTextArea textArea () {
        return null;
    }

    @FactoryMethod
    public static FluentImage image() {
        return null;
    }

    @FactoryMethod
    public static FluentDateTimeField dateTimeField() {
        return null;
    }

    @FactoryMethod
    public static FluentDateField dateField() {
        return null;
    }

    @FactoryMethod
    public static FluentInlineDateTimeField inlineDateTimeField() {
        return null;
    }

    @FactoryMethod
    public static FluentInlineDateField inlineDateField() {
        return null;
    }

    public static <T extends AbstractComponent> FluentComponent<T> use(final T component) {
        return new FluentComponent<>(component);
    }

    public static <T extends AbstractComponent> FluentComponent<T> $(final Supplier<T> supplier) {
        return new FluentComponent<>(supplier.get());
    }

    public static FluentOrderedLayout<VerticalLayout> vLayout() {
        return new FluentOrderedLayout<>(new VerticalLayout());
    }

    public static FluentOrderedLayout<HorizontalLayout> hLayout() {
        return new FluentOrderedLayout<>(new HorizontalLayout());
    }

}