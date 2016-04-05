import React from "react";
import ReactDOM from "react-dom";
import ReactTransitionGroup from "react/lib/ReactTransitionGroup";
import ReactCssTransitionGroup from "react/lib/ReactCSSTransitionGroup";
import {Router, browserHistory, hashHistory} from "react-router";
import injectTapEventPlugin from "react-tap-event-plugin";

window.React = React;
window.ReactDOM = ReactDOM;
window.ReactTransitionGroup = ReactTransitionGroup;
window.ReactCssTransitionGroup = ReactCssTransitionGroup;
window.ReactRouter = {
    browserHistory: browserHistory,
    hashHistory: hashHistory,
    Router: Router
};
injectTapEventPlugin();