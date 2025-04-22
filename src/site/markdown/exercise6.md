# exercise_6 Documentation

## Was ist notwendig um Maven Site Dokumentation zu generieren?

### 1.Installiertes Maven auf dem System (Pruefung mit mvn -v)

### 2.Korrektes pom.xml, das folgende Elemente enthaelt

* Projektkoordinaten (groupId, artifactId, version).

* `<build>` buildAbschnitt mit Plugins wie maven-site-plugin, maven-javadoc-plugin und jacoco-maven-plugin.

### 3.Ordnerstruktur unter src/site/

* src/site/site.xml zur Konfiguration der Navigationsstruktur und des Layouts.

* src/site/markdown/ für eigene Markdown-Seiten (exercise6.md, good_style.md).

-------------------------------------------------------------------------------------------------------

## Welche unterschiedlichen Aspekte, Konfigurationen, Informationen, usw. werden in site.xml bzw. pom.xml konfiguriert?

### Site.xml

* Menuestruktur: Definition von `<menu>` und `<item>` fuer Navigation.

* Pfadzuweisungen: Links (href) zu HTML- oder Markdown-Seiten.

* Dekoration: Header, Footer, Logos (optional über `<decoration>`-Elemente).

### pom.xml

### Projektmetadaten: `<name>`, `<description>`, `<url>`, `<developers>`, `<scm>`

### Dependencies: Bibliotheken wie JUnit, Log4j mit ihren Versionen

### Build-Plugins

* maven-compiler-plugin fuer Java-Version.

* maven-site-plugin fuer Site-Erstellung.

* maven-javadoc-plugin fuer API-Dokumentation.

* jacoco-maven-plugin fuer Code-Coverage.

### Reporting: Konfiguration, um Berichte automatisch bei mvn site zu integrieren
