package io.clickhandler.web.reactRouterGwt.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


public interface ReactRouterGwtResourceBundle extends ClientBundle {
    ReactRouterGwtResourceBundle INSTANCE = GWT.create(ReactRouterGwtResourceBundle.class);

    @Source("react-router-gwt-webpack.js")
    TextResource reactRouterGwtWebpack();
}
