package io.clickhandler.web.materialUiGwt.client.icons;

import io.clickhandler.web.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class AccountCircleSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AccountCircleSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.AccountCircle;
    }-*/;
}
