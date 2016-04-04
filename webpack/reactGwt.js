import React from "react";
import ReactDOM from "react-dom";
import {Router, browserHistory, hashHistory} from "react-router";
import injectTapEventPlugin from "react-tap-event-plugin";

window.React = React;
window.ReactDOM = ReactDOM;
window.ReactRouter = {
    browserHistory: browserHistory,
    hashHistory: hashHistory,
    Router: Router
};
injectTapEventPlugin();