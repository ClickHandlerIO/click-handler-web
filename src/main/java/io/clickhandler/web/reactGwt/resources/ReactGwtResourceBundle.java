package io.clickhandler.web.reactGwt.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


public interface ReactGwtResourceBundle extends ClientBundle {
    ReactGwtResourceBundle INSTANCE = GWT.create(ReactGwtResourceBundle.class);

    @Source("react-gwt-webpack.js")
    TextResource reactGwtWebpack();
}
