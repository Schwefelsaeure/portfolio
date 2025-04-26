#!/bin/bash

used_software=(latex texstudio jabref java python3 git)

for software in "${used_software[@]}"
do
    "${software}" --version
done
