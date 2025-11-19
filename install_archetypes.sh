#!/bin/bash

pushd ./app-archetype/
mvn install
popd

pushd ./system-app-archetype/
mvn install
popd

pushd ./sdk-app-archetype/
mvn install
popd

pushd ./multi-module-archetype/
mvn install
popd
