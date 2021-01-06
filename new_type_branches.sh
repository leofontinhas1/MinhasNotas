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

cd ./koncilier_rules/
git checkout -b $BRANCH_NAME
echo "rules pronto"
cd ..

cd ./koncilier_api/
git checkout -b $BRANCH_NAME
echo "api pronto"
cd ..

cd ./koncilier_swagger/
git checkout -b $BRANCH_NAME
echo "swagger pronto"
cd ..

cd ./koncilier_$CHANNEL_NAME/
git checkout -b $BRANCH_NAME
echo $CHANNEL_NAME " pronto"
cd ..
