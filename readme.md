#Data Engineering

##Assignment 1: Big Data in Ihrem Umfeld (4 Punkte)
1. Schauen Sie sich in Ihrem Umfeld um. FH Technikum oder Ihr Job. Nennen Sie mindestens ein Beispiel für Daten, die schemalos (unstrukturiert) sind und mindestens ein Bespiel für Daten, die strukturiert (schematisch) sind. (2 Punkte)
2. Nennen Sie ein Beispiel für Daten in Ihrem Umfeld, die gestreamt verarbeitet werden, nennen Sie ein Beispiel für Daten in Ihrem Umfeld, die über Batchverarbeitung verarbeitet werden. (2 Punkte)

Antworten:
  1. Strukturierte Daten:
  	* unternehmensinterne Zeitaufzeichnung
  	* Urlaubsbuchungen
  	* Rechnungen welche für den Kunden automatisch generiert werden
  2. Unstrukturierte Daten: 
  	* Emails 
  	* Blogbeiträge auf Unternehmenswebseite
  	* Kommunikation via _Skype for Business_
  3. Gestreamte Daten: 
  	* Twitter Stream wird analysiert um für das Unternehmen relevante Posts zu erkennen
  	* Logging von Anwendungen wird in Echtzeit ausgelesen und grafisch dargestellt
  4. Batchdaten: 
  	* altere Anwendungen/Systeme arbeiten noch nicht mit dem neuen Loggingsystem und erzeugen pro Tag und Uhrzeit eigene Logfiles
  	* Veränderungen der Datenbank werden in Files geschrieben, durch welche die Datenbank Schemaanpassungen nachgezogen werden können
  
##Assignment 2: Big Data in Ihrem Umfeld (4 Punkte)
Entscheiden Sie sich für eine Data Engineering Plattform. Apache Flink oder Apache Spark. Installieren Sie die auf Ihrem Arbeitsgerät.
* Erklären Sie ihre Entscheidung  
	Ich habe zuvor weder mit __Spark__ noch mit __Flink__ gearbeitete, weshalb mir eine Entscheidung natürlich entsprechend schwer fiel. Beide Frameworks bieten ähnliche Features und auch eine umfangreiche Dokumentation. 
    Ich habe versucht mir auf _stackoverflow_ einen Überblick zu verschaffen, welches Framework zur Zeit beliebter ist bzw. von der Community besser supported wird. Ich habe mich dadurch schlussendlich für __Flink entschieden__, auch weil ich die Anleitungne/Hilfestellungen auf der entsprechenden Website ansprechender fand.
* Schicken Sie einen Screenshot der installierten Umgebung mit  
	Die Installation erfolgte sehr einfach und ware eigentlich durchgehend auf der Apache-Flink-Seite dokumentiert. Nach Download eines __Zip Packets__ muss diese entpackt werden und auf der Bash ausgeführt werden. Danach kann man via __localhost:8081__ die Administrationsoberfläche starten.  
    - _Flink Start:_  
	![Flink Start](https://github.com/duffleit/bld_2016/blob/master/screenshots/console.png?raw=true)
	- _Flink Weboberfläche_  
	![Flink Oberfläche](https://github.com/duffleit/bld_2016/blob/master/screenshots/webinterface.png?raw=true)
* Beschreiben Sie Ihre Toolchain, die Sie mit dem Framework nutzen würden (z.B. IDE)  
	Wenn ich nicht im .Net Umfeld arbeite, verwende ich zur Entwicklung eigentlich sehr gerne __Jetbrains__ Produkte, so auch in diesem Fall: IntelliJ IDEA (& Maven). 
    Damit Flink unter Maven lauffähig ist müssen 3 Maven Dependencies hinzugefügt werden, welche auf der Apache-Flink-Seite dokumentiert sind.

##Assignment 3: Big Data in Ihrem Umfeld (4 Punkte)
Schreiben Sie ein simples Program mit dem Framework (z.B. Helloworld) und laden Sie es hoch.

* 2 Punkte für Programm
* 2 Punkte, wenn das Programm auch ausführbar ist.

Eine _Hello-World-Anwendung_ im __Daten-Engineering Umfeld__ ist in der Regel ein einfacher __Wordcount__. Dieser wird so ähnlich auch in der Apache Fink Dokumentation erklärt und beschrieben. Ich habe einen solchen Wordcount als Beispielimplementierung mittels Flink umgesetzt. Es handelt sich hierbei um ein IntelliJ Maven-Projekt, welches zwei Unit Tests beinhaltet. Nach dem Wiederherstellen der Maven Dependencies können diese durchgeführt werden.
  
#Data Science
##Assignment 1: Technologien (4 Punkte)
1. Sie haben in der LVA zwei Frameworks kennengelernt (R und Python). Nennen Sie zwei weitere Technologien, um Daten zu analysieren (müssen nicht open source sein).

    Scala, Matlab, SPSS aber auch Perl empfehlen sich meiner Meinung nach auch sehr gut zum Analysieren von Daten.   
	Ich habe hierzu auch Statistiken gefunden, welche beschreiben, welche
	Programmiersprache bzw. welche Analyse Tools in Jobangeboten für Data-Scientists gefragt sind:

	![Programmiersprachen](http://api.ning.com/files/HRXB3pTHxIoFxP8VG2ML5FPV5KzCia0LUG5goGrn*ytWqT10vfPhsY*vN*EXPy0rFRASaoKy-6Mt4vPswNGLz4owrc8JhL*A/ProgrammingLanguagesListedinDataScientistJobDescriptions.jpg")

	![Tools](http://api.ning.com/files/HRXB3pTHxIpxa-3eGV*kMF8eukv6ZoX3l2R*VuRqHjZFo1WK3zPg0KSa324eIz*NUZwW2feJtMx3qL1Zs0PAtOu5skjYS-Wv/StatisticalAnalysisToolsListedinDataScientistJobDescriptions.jpg)

	_Quelle: http://www.datasciencecentral.com/profiles/blogs/what-technology-tool-skills-do-data-scientists-jobs-require_

2. Sie bekommen den Auftrag, sich mit einer Data Science Technologie zu arbeiten. Nennen Sie Technologie, die ihnen auf dem ersten Blick am besten für Sie ersscheint und begründen Sie das!

	Ich würde meinen Auftrag mit __Python__ durchführe, da es ein sehr leicht gewichtiges Tool ist dessen Syntax sehr einfach zu verstehen ist. Zusätzlich findet man im Internet (Stackoverflow und co.) eine Menge Hilfestellungen welche auch aufgrund der großen Community die hinter Python steht entsprechend qualitativ hochwertig und gewartet ist. Zusätzlich habe ich bereits Erfahrungen damit.  
    Probleme gibt es meiner Meinung nach jedoch bei komplexeren Anwendungen, da beispielsweise das Python DependencyManagment nicht besonders wartbar und fehleranfällig ist. Hier wäre wohl __Java__ eine bessere Alternative. 

##Assignment 2: Technologien
Entscheiden Sie sich für eine Data Science Plattform. R oder Python Installieren Sie die auf Ihrem Arbeitsgerät.
* 1 Punkt: Begründen Sie ihre Entscheidung (Warum ziehen Sie persönlich aus ihrer Ausgangssituation die eine Technologie der anderen vor).  
	Wie bereits oben beschrieben, fällt meine Wahl auf __Python__, da ich mit dieser Technologie bereits vertraut bin und sie auch entsprechend leichtgewichtig ist. Zusätzlich bin ich jedoch der Meinung, dass die Wahl der Technologie immer aufgrund der Vorgaben im Projekt getroffen werden sollte. Man sollte also zu Projektbeginn eine Evaluierung der Technologien auf Basis der Anforderungen durchführen.
* 2 Punkte: Schicken Sie einen Screenshot der installierten Umgebung mit  
	- _Python-Installation:_  
	![Python Installation](https://github.com/duffleit/bld_2016/blob/master/screenshots/python.jpg?raw=true)
    
    - _Python Hello-World in Console:_  
	![Python Hello World](https://github.com/duffleit/bld_2016/blob/master/screenshots/pythonConsole.png?raw=true)
    
* 3 Punkt: Beschreiben Sie Ihre Toolchain, die Sie mit dem Framework nutzen (z.B. IDE)  
	Wie bereits oben beschrieben verwende ich sehr gerne Jetbrains Entwicklungsprodukte, welche auch einen Python IDE anbieten (PyCharm), zusätzlich bietet sich zum schnellen Editieren auch Sublime mit Syntax Unterstützung an. 

##Assignment 3: Big Science
Der Cheatsheet auf http://scikit-learn.org/stable/tutorial/machine_learning_map/ ist eine einfache Anleitung, wie man den richtigen Algorithmus zum richtigen Data Science Problem findet.  
Schauen Sie in Google nach und lernen Sie classificatiom, regression, clusting und dimensional reduction unterscheiden. 
Nennen Sie ein Beispiel aus ihrem Umfeld, wo Sie mit dem Algorithmus zu tun haben. Das kann ein Beispiel sein, wie: Wenn Sie bei Amazon einkaufen. Wenn Sie von einem Marketinginstitut angerufen werden, etc.  
