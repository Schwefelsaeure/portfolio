FDS+Evac:
cloc
--report-file=fds-5c0149698-cloc_report.txt
.

GAMA:
cloc
--report-file=gama-d81fcb858-cloc_report.txt
.

JuPedSim:
cloc
--exclude-dir=Utest
--exclude-lang=XML
--report-file=jupedsim-d942c947-cloc_report.txt
jpscore/ jpseditor/ jpsreport/ jpsvis/
.
Menge:
cloc
--match-d=src
--exclude_dir=test
--report-file=menge-menge-c3eb429-cloc_report.txt
.
MomenTUMv2:
cloc
--exclude-dir=momentum-documentation,tests
--exclude-lang=HTML,CSS,XML
--report-file=momentumv2-55c8f3a-cloc_report.txt
.
SUMO:
cloc
--match-d=src
--report-file=sumo-1.0.1-cloc_report.txt
.
Vadere:
cloc
--exclude-dir=tests
--exclude-lang=JSON --report-file=vadere-87b4fe32-cloc_report.txt
. 
