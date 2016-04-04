package io.clickhandler.web.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


public interface ClickHandlerWebResourceBundle extends ClientBundle {
    ClickHandlerWebResourceBundle INSTANCE = GWT.create(ClickHandlerWebResourceBundle.class);

    @Source("clickhandler-web-webpack.js")
    TextResource WebpackOutput();
}
