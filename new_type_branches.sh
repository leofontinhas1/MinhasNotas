#!/bin/bash

CHANNEL_NAME="$1"
BRANCH_NAME="$2"
cd ./koncilier-core/
git checkout -b $BRANCH_NAME
echo "core pronto"
cd ..

cd ./koncilier_front/
git checkout -b $BRANCH_NAME
echo "front pronto"
cd ..

cd ./koncilier_i18n/
git checkout -b $BRANCH_NAME
echo "i18n pronto"
cd ..

cd ./koncilier_report/
git checkout -b $BRANCH_NAME
echo "report pronto"
cd ..

cd ./koncilier_$CHANNEL_NAME/
git checkout -b $BRANCH_NAME
echo $CHANNEL_NAME " pronto"
cd ..
