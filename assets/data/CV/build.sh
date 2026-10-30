#!/usr/bin/env bash
# Usage: [LATEX_BIN=/path/to/tex/bin] ./build.sh "CV (Deutsch)/Lebenslauf.tex"
# Git Bash on this machine: LATEX_BIN=/c/Users/kleinmeier/scoop/apps/miktex/current/texmfs/install/miktex/bin/x64 ./build.sh "CV (Deutsch)/Lebenslauf.tex"
# Clean build artifacts instead of building: ./build.sh --clean "CV (Deutsch)/Lebenslauf.tex"
#
# Four runs are required (lualatex, biber, lualatex, lualatex):
#   1. lualatex: writes the citation keys to the .bcf file.
#   2. biber:    reads the .bcf and the .bib file and writes the formatted bibliography (.bbl).
#   3. lualatex: includes the .bbl; citations and page numbers may still shift.
#   4. lualatex: resolves the remaining cross-references and the final layout.

set -e

tools_path="${LATEX_BIN:+$LATEX_BIN/}"
tex_file="${!#}" # last argument, so an optional leading --clean does not shift the file
cd "$(dirname "$tex_file")"; file_basename="$(basename "$tex_file" .tex)"

if [ "$1" = "--clean" ]; then rm -f "$file_basename".{aux,bbl,bcf,blg,log,run.xml}; exit; fi

"${tools_path}lualatex" -interaction=nonstopmode "$file_basename"
"${tools_path}biber" "$file_basename"
"${tools_path}lualatex" -interaction=nonstopmode "$file_basename"
"${tools_path}lualatex" -interaction=nonstopmode "$file_basename"
