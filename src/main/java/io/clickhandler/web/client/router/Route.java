package io.clickhandler.web.client.router;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import io.clickhandler.web.client.react.Component;

/**
 *
 */
@JsType
public class Route {
    /**
     * The path used in the URL.
     * <p/>
     * It will concat with the parent route's path unless it starts with /, making it an absolute path.
     * <p/>
     * Note: Absolute paths may not be used in route config that is dynamically loaded.
     * <p/>
     * If left undefined, the router will try to match the child routes.
     */
    @JsProperty
    public String path;

    /**
     * A single component to be rendered when the route matches the URL. It can be rendered by the
     * parent route component with this.props.children.
     */
    @JsProperty
    public Object component;

    /**
     * A single component to be rendered when the route matches the URL.
     * It can be rendered by the parent route component with this.props.children.
     */
    @JsProperty
    public Object components;

    /**
     *
     */
    @JsProperty
    public Route indexRoute;

    /**
     * Asynchronously get the index route.
     */
    @JsProperty
    public io.clickhandler.web.client.router.ChildRouteCallback getIndexRoute;

    /**
     *
     */
    @JsProperty
    public Route[] childRoutes;

    /**
     * Async
     */
    @JsProperty
    public io.clickhandler.web.client.router.ChildRoutesCallback getChildRoutes;

    /**
     * Same as component but asynchronous, useful for code-splitting.
     */
    @JsProperty
    public GetComponentCallback getComponent;

    /**
     * Same as component but asynchronous, useful for code-splitting.
     */
    @JsProperty
    public io.clickhandler.web.client.router.GetComponentsCallback getComponents;

    /**
     *
     */
    @JsProperty
    public io.clickhandler.web.client.router.OnEnterRoute onEnter;

    /**
     *
     */
    @JsProperty
    public io.clickhandler.web.client.router.OnLeaveRoute onLeave;

    @JsIgnore
    public Route path(String path) {
        this.path = path;
        return this;
    }

    @JsIgnore
    public Route component(Object component) {
        this.component = component;
        return this;
    }

    @JsIgnore
    public Route component(Component component) {
        this.component = component.getReactClass();
        return this;
    }

    @JsIgnore
    public Route getComponent(GetComponentCallback getComponent) {
        this.getComponent = getComponent;
        return this;
    }

    @JsIgnore
    public Route components(Object... components) {
        this.components = components;
        return this;
    }

    @JsIgnore
    public Route getComponents(io.clickhandler.web.client.router.GetComponentsCallback getComponents) {
        this.getComponents = getComponents;
        return this;
    }

    @JsIgnore
    public Route indexRoute(Route indexRoute) {
        this.indexRoute = indexRoute;
        return this;
    }

    @JsIgnore
    public Route getIndexRoute(io.clickhandler.web.client.router.ChildRouteCallback getIndexRoute) {
        this.getIndexRoute = getIndexRoute;
        return this;
    }

    @JsIgnore
    public Route childRoutes(Route... childRoutes) {
        this.childRoutes = childRoutes;
        return this;
    }

    @JsIgnore
    public Route getChildRoutes(io.clickhandler.web.client.router.ChildRoutesCallback getChildRoutes) {
        this.getChildRoutes = getChildRoutes;
        return this;
    }

    @JsIgnore
    public Route onEnter(io.clickhandler.web.client.router.OnEnterRoute onEnter) {
        this.onEnter = onEnter;
        return this;
    }

    @JsIgnore
    public Route onLeave(io.clickhandler.web.client.router.OnLeaveRoute onLeave) {
        this.onLeave = onLeave;
        return this;
    }
}
