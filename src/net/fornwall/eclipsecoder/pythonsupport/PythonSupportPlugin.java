package net.fornwall.eclipsecoder.pythonsupport;


import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class PythonSupportPlugin extends AbstractUIPlugin {
	public static final String CODE_TEMPLATE_PREFERENCE = "codeTemplatePreference";

	private static PythonSupportPlugin plugin;

	public static PythonSupportPlugin getDefault() {
		return plugin;
	}

	/**
	 * The constructor.
	 */
	public PythonSupportPlugin() {
		super();
		plugin = this;
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}
	
	public String getCodeTemplate() {
        return getPreferenceStore().getString(CODE_TEMPLATE_PREFERENCE);
    }
}
