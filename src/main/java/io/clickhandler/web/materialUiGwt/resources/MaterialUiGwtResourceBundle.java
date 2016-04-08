package io.clickhandler.web.materialUiGwt.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


public interface MaterialUiGwtResourceBundle extends ClientBundle {
    MaterialUiGwtResourceBundle INSTANCE = GWT.create(MaterialUiGwtResourceBundle.class);

    @Source("material-ui-gwt-webpack.js")
    TextResource materialUiGwtWebpack();
}
