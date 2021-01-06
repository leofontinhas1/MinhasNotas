#!/bin/bash

CHANNEL_NAME="$1"

cd ./koncilier-core/
git checkout develop
git pull origin develop
echo "core pronto"
cd ..

cd ./koncilier_front/
git checkout develop
git pull origin develop
echo "front pronto"
cd ..

cd ./koncilier_i18n/
git checkout develop
git pull origin develop
echo "i18n pronto"
cd ..

cd ./koncilier_report/
git checkout develop
git pull origin develop
echo "report pronto"
cd ..

cd ./koncilier_rules/
git checkout develop
git pull origin develop
echo "rules pronto"
cd ..

cd ./koncilier_api/
git checkout develop
git pull origin develop
echo "api pronto"
cd ..

cd ./koncilier_swagger/
git checkout develop
git pull origin develop
echo "swagger pronto"
cd ..


cd ./koncilier_$CHANNEL_NAME/
git checkout develop
git pull origin develop
echo $CHANNEL_NAME " pronto"
cd ..
