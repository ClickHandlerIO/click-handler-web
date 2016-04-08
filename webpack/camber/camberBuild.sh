#!/usr/bin/env bash

FILE_NAME=camber-webpack
OUTPUT_DIR=../src/main/java/io/clickhandler/web/camber/resources
OUTPUT=${OUTPUT_DIR}/${FILE_NAME}
MAP_DIR=../src/main/java/io/clickhandler/web/camber/public
MAP_OUTPUT=${MAP_DIR}/${FILE_NAME}

echo "*** Starting Camber Webpack Build ***";

# remove files
rm -f ${OUTPUT}.js;
rm -f ${MAP_OUTPUT}.js.map;

# run webpack
webpack --config camberWebpack.config.js --progress --color;

# copy files
echo "Copying Camber Output...";
mkdir -p ${OUTPUT_DIR}
mkdir -p ${MAP_DIR}
cp build/camber-webpack.js ${OUTPUT}.js;
cp build/camber-webpack.js.map ${MAP_OUTPUT}.js.map;

# cleanup
rm -rf build;

echo "*** Camber Webpack Build Complete ***";