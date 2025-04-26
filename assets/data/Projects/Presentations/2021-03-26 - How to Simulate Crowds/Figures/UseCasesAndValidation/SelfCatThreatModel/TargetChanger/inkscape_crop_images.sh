for file in $(ls *.pdf)
do
    inkscape --without-gui --export-area-page --export-pdf="${file%.pdf}-Cropped.pdf" "${file}"
done
