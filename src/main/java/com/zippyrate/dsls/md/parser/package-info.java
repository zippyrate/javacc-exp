/**
 * In addition to the parser itself, this package contains JJTree-generated node files that had to be manually modified to add extra state.
 * (JJTree has no way of specifying the addition of this state to generated node classes.) 
 * These generated files are by default placesds in the generate-sources directory of the project target directory.
 * We would like these files to be under source control so they are copied into the project source tree.
 *
 * (One option would be to tell the JavaCC Maven plugin to place the generated node files directly into the source three but
 * this plugin seems to overwrite these files even if they are modified using this approach - so we thus need to copy
 * any modified node files into this source package directory and keep other unmodified node files in the default
 * generated-sources directory in the project tarhger directory.)
 *
 */
package com.zippyrate.dsls.md.parser;
