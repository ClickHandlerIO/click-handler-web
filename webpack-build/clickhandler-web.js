import React from "react";
import ReactDOM from "react-dom";
import {Router, Route, Link} from "react-router";
import injectTapEventPlugin from "react-tap-event-plugin";

window.React = React;
window.ReactDOM = ReactDOM;
window.ReactRouter = {
    Router: Router,
    Route: Route,
    Link: Link
};
injectTapEventPlugin();