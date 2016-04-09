package io.clickhandler.web.materialUiGwt.client.icons;

import io.clickhandler.web.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class AccountBoxSvgIcon extends AbstractMaterialIcon {

    @Inject
    public AccountBoxSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.AccountBox;
    }-*/;
}
