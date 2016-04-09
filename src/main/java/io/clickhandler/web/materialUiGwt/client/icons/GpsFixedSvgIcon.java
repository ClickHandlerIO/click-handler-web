package io.clickhandler.web.materialUiGwt.client.icons;

import io.clickhandler.web.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class GpsFixedSvgIcon extends AbstractMaterialIcon {

    @Inject
    public GpsFixedSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.GpsFixed;
    }-*/;
}
