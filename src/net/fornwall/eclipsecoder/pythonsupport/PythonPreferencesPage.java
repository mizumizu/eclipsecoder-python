package net.fornwall.eclipsecoder.pythonsupport;


import org.eclipse.jface.preference.IPreferencePageContainer;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class PythonPreferencesPage implements IWorkbenchPreferencePage {

	private Text codeTemplateEditor;

	private Label codeTemplateLabel;

	private Composite composite;

	public Point computeSize() {
		return composite.computeSize(SWT.DEFAULT, SWT.DEFAULT);
	}

	public void createControl(Composite parent) {
		composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));

		codeTemplateLabel = new Label(composite, SWT.NONE);
		codeTemplateLabel.setText("Code template:");

		codeTemplateEditor = new Text(composite, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER);
		codeTemplateEditor.setFont(JFaceResources
				.getFont(JFaceResources.TEXT_FONT));
		codeTemplateEditor.setTabs(5);
		codeTemplateEditor.setText(PythonSupportPlugin.getDefault()
				.getCodeTemplate());
		codeTemplateEditor.setLayoutData(new GridData(GridData.FILL_BOTH));
	}

	public void dispose() {
		composite.dispose();
		// children of composite disposed as well? (probably)
		// codeTemplateEditor.dispose();
		// codeTemplateEditor.dispose();
	}

	public Control getControl() {
		return composite; // codeTemplateEditor;
	}

	public String getDescription() {
		return getTitle();
	}

	public String getErrorMessage() {
		return null;
	}

	public Image getImage() {
		return null;
	}

	public String getMessage() {
		return null;
	}

	public String getTitle() {
		return "EclipseCoder Python Preferences";
	}

	public void init(IWorkbench workbench) {
		// do nothing
	}

	public boolean isValid() {
		return true;
	}

	public boolean okToLeave() {
		return true;
	}

	public boolean performCancel() {
		return true;
	}

	public void performHelp() {
		// do nothing
	}

	public boolean performOk() {
		PythonSupportPlugin.getDefault().getPreferenceStore().setValue(
				PythonSupportPlugin.CODE_TEMPLATE_PREFERENCE,
				codeTemplateEditor.getText());
		return true;
	}

	public void setContainer(IPreferencePageContainer preferencePageContainer) {
		// do nothing
	}

	public void setDescription(String description) {
		// do nothing
	}

	public void setImageDescriptor(ImageDescriptor image) {
		// do nothing
	}

	public void setSize(Point size) {
		composite.setSize(size);
	}

	public void setTitle(String title) {
		// do nothing
	}

	public void setVisible(boolean visible) {
		composite.setVisible(visible);
	}

}
