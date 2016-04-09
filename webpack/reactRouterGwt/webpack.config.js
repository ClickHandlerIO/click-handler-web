var webpack = require('webpack');
var path = require('path');
var buildPath = path.resolve(__dirname, 'build');
var OUTPUT_FILE_NAME = "webpack-output.js";

var config = {
    entry: [path.join(__dirname, '/app.js')],

    resolve: {
        extensions: ["", ".js", ".jsx"] // When require, do not have to add these extensions to file's name
    },

    externals: {
        "react": "React",
        "React": "React",
        "react-dom": "ReactDOM",
        "react-addons-transition-group": "ReactTransitionGroup",
        "react-addons-css-transition-group": "ReactCssTransitionGroup"
    },

    devtool: 'source-map', //Render source-map file for final build

    output: {
        path: buildPath,    // Path of output file
        filename: OUTPUT_FILE_NAME  // Name of output file
    }

    // plugins: [
    //     //Minify the bundle
    //     new webpack.optimize.UglifyJsPlugin({
    //         compress: {
    //             warnings: false //supresses warnings, usually from module minification
    //         }
    //     }),
    //     new webpack.NoErrorsPlugin() //Allows error warnings but does not stop compiling. Will remove when eslint is added
    // ],
};

module.exports = config;
