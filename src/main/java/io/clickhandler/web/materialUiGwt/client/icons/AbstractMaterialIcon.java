package io.clickhandler.web.materialUiGwt.client.icons;

import io.clickhandler.web.materialUiGwt.client.SvgIcon;
import io.clickhandler.web.reactGwt.client.react.ExternalComponent;
import jsinterop.annotations.JsType;

public abstract class AbstractMaterialIcon extends ExternalComponent<AbstractMaterialIcon.Props> {

    @Override
    protected Props defaultProps() {
        final Props props = super.defaultProps();
        props.setViewBox("0 0 24 24");
        return props;
    }

    @JsType(isNative = true)
    public interface Props extends SvgIcon.Props {
    }
}