#!/usr/bin/env bash

FILE_NAME=clickhandler-web-webpack
OUTPUT_DIR=../src/main/java/io/clickhandler/web/resources
OUTPUT=${OUTPUT_DIR}/${FILE_NAME}
MAP_DIR=../src/main/java/io/clickhandler/web/public
MAP_OUTPUT=${MAP_DIR}/${FILE_NAME}

echo "*** Starting ClickHandler Webpack Build ***";

# remove files
rm -f ${OUTPUT}.js;
rm -f ${MAP_OUTPUT}.js.map;

# run webpack
webpack --config webpack.config.js --progress --color;

# copy files
echo "Copying Webpack Output...";
mkdir -p ${OUTPUT_DIR}
mkdir -p ${MAP_DIR}
cp build/webpack-output.js ${OUTPUT}.js;
cp build/webpack-output.js.map ${MAP_OUTPUT}.js.map;

# cleanup
rm -rf build;

echo "*** ClickHandler Webpack Build Complete ***";