#!/usr/bin/env bash

FILE_NAME=reactGwt-webpack
OUTPUT_DIR=../src/main/java/io/clickhandler/web/reactGwt/resources
OUTPUT=${OUTPUT_DIR}/${FILE_NAME}
MAP_DIR=../src/main/java/io/clickhandler/web/reactGwt/public
MAP_OUTPUT=${MAP_DIR}/${FILE_NAME}

echo "*** Starting ReactGwt Webpack Build ***";

# remove files
rm -f ${OUTPUT}.js;
rm -f ${MAP_OUTPUT}.js.map;

# run webpack
webpack --config reactGwtWebpack.config.js --progress --color;

# copy files
echo "Copying Webpack Output...";
mkdir -p ${OUTPUT_DIR}
mkdir -p ${MAP_DIR}
cp build/reactGwt-webpack.js ${OUTPUT}.js;
cp build/reactGwt-webpack.js.map ${MAP_OUTPUT}.js.map;

# cleanup
rm -rf build;

echo "*** ReactGwt Webpack Build Complete ***";