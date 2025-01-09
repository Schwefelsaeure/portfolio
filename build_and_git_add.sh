#!/bin/bash

# Switch to "main" branch, clean the directory from Jekyll artifacts,
# build the site in the upper directory, switch to "site" branch and add build artifacts there.

set -e

git checkout main
git reset --hard HEAD

bundle exec jekyll clean
bundle exec jekyll build --destination ../_site

git checkout site
rm -fr *
mv -t . ../_site/*
git add -A .
rm -r ../_site

echo "Changes on \"main\": $(git show -s --format=%s main)"
