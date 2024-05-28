
Objectifs
---------

L'objectif de ce TP est:
------------------------

- Apprendre a generer un programme POO 
- Apprendre a manipuler les interfaces , paquetages et tests
- Creation d'un fichiier executable .jar

La Documentation
----------------

Pour générer la documentation, il faut se placer dans le dossier contenant la classe ( nomClasse.java) , et éxécuter la commande: javadoc nomClasse.java -d docs

L’option « -d docs » permet de placer les fichiers générés dans un dossier docs

Pour voir la documentation générée, il suffit de consulter le fichier index.html qui se trouve dans le dossier "docs"


La Compilation Des Classes
--------------------------

Le dossier racine "pfc" contient:

un dossier "src" qui contient:

un paqutage "game" qui contient: 

*Game.java : en se placent dans le dossier "src" , compiler en éxécutant la commande "javac game/Game.java -d ../classes"

*GameMain.java : en se placent dans le dossier "src" compiler en éxécutant la commande "javac game/GameMain.java -d ../classes"

*Coup.java : en se placent dans le dossier "src" compiler en éxécutant la commande "javac game/Coup.java -d ../classes"

*Player.java : en se placent dans le dossier "src" compiler en éxécutant la commande "javac game/Player.java -d ../classes"


*Un sous paquetage "util" qi contient lui meme un sous paquetage io et qui contient:

*Input.java : en se placent dans le dossier "src" , compiler en éxécutant la commande "javac game.util.io/Input.java -d ../classes"

*InputMain.java : en se placent dans le dossier "src" , complier en éxécutant la commande " javac game.util.io/InputMain.java -d ../classes"

*on peut aussi faire "javac game.util/*.java -d ../classes" pour toutes les classe a la fois

*Un sous paquetage "strat" qui contient:

*Strategie.java: l'interface Strategie

*StrategieHumaine.java: la strategie qui permet a l'utilisateur d'ecrire le coup a jouer

*StrategieAleatoir.java: la strategie qui jour un random de Coup

*StrategiePierre.java

*StrategieFeuille.java

*StrategieCiseaux.java

*pour la compilation on se place dans le dossier "src" on execute la commande : -"javac game.strat/Nameofclass.java" pour un seul classe 
										-"javac game.strat/*.java -d ../classes" pour toutes les classe a la fois


Test 
------
*Le dossier racine "pfc" contien aussi un dossier "test" qui contiens:

*Une classe "GameTest.java" et une classe "StrategieTest.java":
	*Compilation:
	 ------------
	  *En se placent dans le dossier racine "pfc" on execute la commande "javac -classpath test4poo.jar GameTest.java -d ../"
	  *En se placent dans le dossier racine "pfc" on execute la commande "javac -classpath test4poo.jar StrategieTest.java -d ../"
	*Execution:
	 ----------
	  *En se placent dans le dossier racine "pfc" o, execute la commande " java -jar test4poo.jar GameTest"
	  *En se placent dans le dossier racine "pfc" o, execute la commande " java -jar test4poo.jar StrategieTest"

Main
-----

*Une classe "GameMain.java" dans le paquetage game:
	*Execution:
	 ----------
	  *En se placent dans le dossier "src" on execute la commande  java -cp ../classes game.GameMain X (PS: "X": un paramétre pour la methode main de cette classe;)


Creation d'un "jar" executable pour la methode main
----------------------------------------------------
*On doit d'abord cree un fichier text nommer "manifest-pfc" dans le dossier racine "pfc" qui contiendra "Main-Class: game.GameMain"
*On se place dans le fichier "classes" lui meme est dans la racine "pfc":
	* on execute la commande suiivante sur le terminale: "jar cvfm ../pfc.jar ../manifest-pfc game "

Execution du fichier "pfc.jar"
------------------------------
*On execute la commande "java -jar pfc.jar X" (PS: "X" est le paramétre qu'on doit fourinir pour l'execution de la methode main de la classe GameMain)


Creation et ajout d'une strategie
---------------------------------
* On cree un fichier .java dans le paquetage "game.strat" , on le nomera NomDeLaStrategie.java, on ouvre un editeur de texte, on ecrit les paquetage d'abord,"package game.strat;" , on revien a la ligne l'importation de "Coup.java" avec "import Coup.java"
*On commence maintenant par cree la classe toute en lui precisant que c'est une implementation de l'interface "Strategie.java" , avec "public NomDeLaClass implements Strategie"
* Vu qu'elle est une implementation de "Strategie.java" elle doit obligatoirment avoir la methode "prochainCoup()" donc on fait "public prochainCoup(){...}"
