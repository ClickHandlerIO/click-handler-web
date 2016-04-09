package io.clickhandler.web.materialUiGwt.client.icons;

import io.clickhandler.web.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class FileDownloadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public FileDownloadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.FileDownload;
    }-*/;
}
