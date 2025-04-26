source_files := $(shell find . -type f -name "*.tex")
pdf_files := $(patsubst %.tex,%.pdf,$(source_files))
svg_files := $(patsubst %.tex,%.svg,$(source_files))

cc := lualatex  
cflags := -synctex=1 --halt-on-error --file-line-error

pdf: $(pdf_files)

svg: $(svg_files)

%.pdf: %.tex
	$(cc) $(cflags) $<

%.svg: %.pdf
	inkscape --export-plain-svg=$@ --export-area-drawing $<
	
clean:
	rm *.aux *.log *.gz

.PHONY: clean
