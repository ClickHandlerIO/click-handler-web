package io.clickhandler.web.materialUiGwt.client.icons;

import io.clickhandler.web.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class CloudDownloadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public CloudDownloadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.CloudUpload;
    }-*/;
}
