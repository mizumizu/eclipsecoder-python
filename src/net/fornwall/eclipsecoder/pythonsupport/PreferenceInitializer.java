package net.fornwall.eclipsecoder.pythonsupport;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

    public static final String DEFAULT_CODE_TEMPLATE 
    	= "class $CLASSNAME$:\n\n\tdef $METHODNAME$($METHODPARAMS$):\n\t\treturn $DUMMYRETURN$\n"
    		.replaceAll("\\t", "    ");

    /**
     * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
     */
    @Override
	public void initializeDefaultPreferences() {
        IPreferenceStore store = PythonSupportPlugin.getDefault().getPreferenceStore();
        store.setDefault(PythonSupportPlugin.CODE_TEMPLATE_PREFERENCE, DEFAULT_CODE_TEMPLATE);
    }

}
