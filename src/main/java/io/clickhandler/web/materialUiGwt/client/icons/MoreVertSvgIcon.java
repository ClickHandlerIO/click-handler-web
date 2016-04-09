package io.clickhandler.web.materialUiGwt.client.icons;

import io.clickhandler.web.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class MoreVertSvgIcon extends AbstractMaterialIcon {

    @Inject
    public MoreVertSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.MoreVert;
    }-*/;
}
