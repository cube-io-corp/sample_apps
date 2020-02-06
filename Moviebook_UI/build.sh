#!/usr/bin/env bash

IMAGE_NAME="cubeiocorp/movieinfoui"
VERSION=`git rev-parse HEAD`
docker build --no-cache --tag $IMAGE_NAME:$VERSION .
