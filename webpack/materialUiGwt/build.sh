#!/usr/bin/env bash

FILE_NAME=material-ui-gwt-webpack
OUTPUT_DIR=../../src/main/java/io/clickhandler/web/materialUiGwt/resources
MAP_DIR=../../src/main/java/io/clickhandler/web/materialUiGwt/public

OUTPUT=${OUTPUT_DIR}/${FILE_NAME}
MAP_OUTPUT=${MAP_DIR}/${FILE_NAME}

echo "*** Starting Webpack Build ***";

# remove files
rm -f ${OUTPUT}.js;
rm -f ${MAP_OUTPUT}.js.map;

# run webpack
webpack --config webpack.config.js --progress

# copy files
echo "Copying Output...";
mkdir -p ${OUTPUT_DIR}
mkdir -p ${MAP_DIR}
cp build/webpack-output.js ${OUTPUT}.js;
cp build/webpack-output.js.map ${MAP_OUTPUT}.js.map;

# cleanup
rm -rf build;

echo "*** Webpack Build Complete ***";