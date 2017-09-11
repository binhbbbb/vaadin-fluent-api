package org.vaadin.addon.elmot.fluent;

import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.addon.elmot.fluent.impl.FluentCheckBox;
import org.vaadin.addon.elmot.fluent.impl.FluentComboBox;
import org.vaadin.addon.elmot.fluent.impl.FluentComponent;
import org.vaadin.addon.elmot.fluent.impl.FluentDateField;
import org.vaadin.addon.elmot.fluent.impl.FluentDateTimeField;
import org.vaadin.addon.elmot.fluent.impl.FluentImage;
import org.vaadin.addon.elmot.fluent.impl.FluentInlineDateField;
import org.vaadin.addon.elmot.fluent.impl.FluentInlineDateTimeField;
import org.vaadin.addon.elmot.fluent.impl.FluentLabel;
import org.vaadin.addon.elmot.fluent.impl.FluentLink;
import org.vaadin.addon.elmot.fluent.impl.FluentOrderedLayout;
import org.vaadin.addon.elmot.fluent.impl.FluentPanel;
import org.vaadin.addon.elmot.fluent.impl.FluentTextArea;
import org.vaadin.addon.elmot.fluent.impl.FluentTextField;

import java.util.function.Supplier;

/**
 * Factory class for Vaadin Fluent API. <br>
 * Usage example:
 * {@code ui.setContent(Fluent.label().value("Text").styles(ValoTheme.LABEL_HUGE).get());}
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class Fluent {

	/**
	 * Creates new Fluent API envelope for {@link null}
	 * 
	 * @see org.vaadin.addon.elmot.fluent.Fluent
	 */
	private Fluent() {
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.Label}
	 *
	 * @return new fluent envelope
	 */
	public static FluentLabel label() {
		return new FluentLabel();
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.Panel}
	 *
	 * @return new fluent envelope
	 */
	public static FluentPanel panel() {
		return new FluentPanel();
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.ComboBox}
	 *
	 * @return new fluent envelope
	 */
	public static FluentComboBox comboBox() {
		return new FluentComboBox();
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.Panel}
	 *
	 * @param component
	 *            to be placed inside the panel
	 * @return new fluent envelope
	 */
	public static FluentPanel panel(Component component) {
		return new FluentPanel(component);
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.Panel}
	 *
	 * @param componentSupplier
	 *            generator for the component to be placed inside the panel
	 * @return new fluent envelope
	 */
	public static FluentPanel panel(
			Supplier<? extends Component> componentSupplier) {
		return panel(componentSupplier.get());
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.Link}
	 *
	 * @return new fluent envelope
	 */
	public static FluentLink link() {
		return new FluentLink();
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.CheckBox}
	 *
	 * @return new fluent envelope
	 */
	public static FluentCheckBox checkBox() {
		return new FluentCheckBox();
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.TextField}
	 *
	 * @return new fluent envelope
	 */
	public static FluentTextField textField() {
		return new FluentTextField();
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.TextArea}
	 *
	 * @return new fluent envelope
	 */
	public static FluentTextArea textArea() {
		return new FluentTextArea();
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.Image}
	 *
	 * @return new fluent envelope
	 */
	public static FluentImage image() {
		return new FluentImage();
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.DateTimeField}
	 *
	 * @return new fluent envelope
	 */
	public static FluentDateTimeField dateTimeField() {
		return new FluentDateTimeField();
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.DateField}
	 *
	 * @return new fluent envelope
	 */
	public static FluentDateField dateField() {
		return new FluentDateField();
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.InlineDateTimeField}
	 *
	 * @return new fluent envelope
	 */
	public static FluentInlineDateTimeField inlineDateTimeField() {
		return new FluentInlineDateTimeField();
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.InlineDateField}
	 *
	 * @return new fluent envelope
	 */
	public static FluentInlineDateField inlineDateField() {
		return new FluentInlineDateField();
	}

	/**
	 * Creates a new Fluent envelope for the given <br>
	 * Example:<br>
	 * {@code Fluent.$(new Grid()).setup(grid -> grid.setBeanType(YourBean.class)).id("grid");}
	 *
	 * @param component
	 *            component to be used
	 * @see Fluent
	 */
	public static <T extends AbstractComponent> FluentComponent<T> use(
			final T component) {
		return new FluentComponent<>(component);
	}

	/**
	 * Creates a new Fluent envelope for the component generated by the supplier <br>
	 * Example:<br>
	 * {@code Fluent.$(new Grid()).setup(grid -> grid.setBeanType(YourBean.class)).id("grid");}
	 *
	 * @param supplier
	 *            component creator to be used
	 * @see Fluent
	 */
	public static <T extends AbstractComponent> FluentComponent<T> $(
			final Supplier<T> supplier) {
		return new FluentComponent<>(supplier.get());
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.VerticalLayout}
	 *
	 * @return new fluent envelope
	 */
	public static FluentOrderedLayout<VerticalLayout> vLayout() {
		return new FluentOrderedLayout<>(new VerticalLayout());
	}

	/**
	 * Creates new Fluent Object for {@link com.vaadin.ui.HorizontalLayout}
	 *
	 * @return new fluent envelope
	 */
	public static FluentOrderedLayout<HorizontalLayout> hLayout() {
		return new FluentOrderedLayout<>(new HorizontalLayout());
	}

}
