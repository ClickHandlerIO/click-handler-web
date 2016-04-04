package io.clickhandler.web.camber.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


public interface CamberResourceBundle extends ClientBundle {
    CamberResourceBundle INSTANCE = GWT.create(CamberResourceBundle.class);

    @Source("camber-webpack.js")
    TextResource camberWebpack();
}
