# Makefile for 
#
#
#
JC=javac
JFLAGS=
SOURCE=src/JourneyThroughAvslor
BUILDDIR=build/
OUTDIR=$(BUILDDIR)/obj


SOURCES=\
		Main.java 

default: setupenv build

build: $(SOURCES:.java=.class)

package: build
	cp docs/jarManifest.txt $(OUTDIR)/Manifest.txt
	jar cvfm $(BUILDDIR)/JourneyThroughAvslor.jar $(OUTDIR)/Manifest.txt -C $(OUTDIR) .

setupenv:
	test -d $(BUILDDIR) || mkdir $(BUILDDIR) 
	test -d $(OUTDIR) || mkdir $(OUTDIR)


%.class: 
	$(JC) $(JFLAGS) -d $(OUTDIR) -sourcepath $(SOURCE) $(SOURCE)/$(basename $*).java


clean:
	rm -rf $(BUILDDIR)


.PHONY: setupenv clean
