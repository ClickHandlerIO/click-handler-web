var gulp = require('gulp');
var sass = require('gulp-sass');
var postcss = require('gulp-postcss');
var autoprefixer = require('autoprefixer');
var sourcemaps = require('gulp-sourcemaps');
var concat = require('gulp-concat');
var nano = require('gulp-cssnano');

/* local vars */
var sources = ['./style.scss'];
var watchSources = ['../**/*.scss'];
var autoprefixVersions = 'last 2 versions';
var outputLocation = '../public/css/';
var outputFile = 'camber.min.css';


/* For Dev (with source maps) */

gulp.task('default', ['dev', 'watch']);

gulp.task('watch', function () {
    gulp.watch(watchSources, ['dev']);
});

gulp.task('dev', function () {
    gulp.src(sources)
        .pipe(sourcemaps.init())
        .pipe(sass().on('error', sass.logError))
        .pipe(postcss([ autoprefixer({ browsers: [autoprefixVersions] }) ]))
        .pipe(concat(outputFile))
        .pipe(nano({"zindex": false, "reduceIdents": false}))
        .pipe(sourcemaps.write())
        .pipe(gulp.dest(outputLocation));
});


/* For Deploy (no source maps) */

gulp.task('deploy', function () {
    gulp.src(sources)
        .pipe(sass().on('error', sass.logError))
        .pipe(postcss([ autoprefixer({ browsers: [autoprefixVersions] }) ]))
        .pipe(concat(outputFile))
        .pipe(nano({"zindex": false, "reduceIdents": false}))
        .pipe(gulp.dest(outputLocation));
});






