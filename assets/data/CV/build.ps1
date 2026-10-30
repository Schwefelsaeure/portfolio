# Usage: .\build.ps1 "CV (Deutsch)\Lebenslauf.tex" -LatexBin "C:\Users\kleinmeier\scoop\apps\miktex\current\texmfs\install\miktex\bin\x64"
# Clean build artifacts instead of building: .\build.ps1 "CV (Deutsch)\Lebenslauf.tex" -Clean
#
# Four runs are required (lualatex, biber, lualatex, lualatex):
#   1. lualatex: writes the citation keys to the .bcf file.
#   2. biber:    reads the .bcf and the .bib file and writes the formatted bibliography (.bbl).
#   3. lualatex: includes the .bbl; citations and page numbers may still shift.
#   4. lualatex: resolves the remaining cross-references and the final layout.
param([Parameter(Mandatory)][string]$File, [string]$LatexBin = '', [switch]$Clean)
$file_basename = [IO.Path]::GetFileNameWithoutExtension($File); Push-Location (Split-Path (Resolve-Path $File))
if ($Clean) { 'aux', 'bbl', 'bcf', 'blg', 'log', 'run.xml' | ForEach-Object { Remove-Item "$file_basename.$_" -ErrorAction SilentlyContinue }; Pop-Location; return }
foreach ($tool in 'lualatex', 'biber', 'lualatex', 'lualatex') {
    $tool_path = if ($LatexBin) { Join-Path $LatexBin $tool } else { $tool }
    & $tool_path @(if ($tool -ne 'biber') { '-interaction=nonstopmode' }) $file_basename
    if ($LASTEXITCODE) { Pop-Location; exit $LASTEXITCODE }
}
Pop-Location
