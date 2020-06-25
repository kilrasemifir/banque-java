# __Compagnie__

## Exercice 0 : Création du projet
Créer un projet Java.
Créer le package parent `compagnie`. Tous les packages, classes et interfaces seront dans un package enfants a compagnie.
Créer la classe principale du programme Application avec la méthode statique main et afficher "Hello world".

```Java
package company;

class Application {

    public static void main(String[] args){
        Systeme.out.println("Hello world");
    }
}
```

## Exercice 1 : Les employés
Créer une classe __Employe__ avec les attributs nom, prénom et email. Ajouter les Getters, Setters et constructeurs nécessaires.

## Exercice 2 : La __Compagnie__
Créer une classe __Compagnie__ dans le même package. Une __Compagnie__ possède un nom et une liste d’employé. Ne pas oublier les getters/setters/constructeurs.

## Exercice 3 : Les développeurs
Créer un package `compagnie.competences`.
Dans ce package créer une interface Codeur qui définit la méthodes void _coder()_.

Créer un package `compagnie.postes`.
Dans ce package, créer une classe Developpeur qui hérite d’Employe et qui implémente Codeur. La méthode _coder_ affichera un message « [nom prenom] : code »
Dans la classe __Compagnie__ :
-	Ajouter une liste codeurs qui prend des Codeurs.
-	Ajouter une méthode void _ajouterCodeur(__Codeur__ codeur)_ qui ajoute a un codeur a la liste des codeurs.
-	Ajouter une méthode void _lancerProjet()_ qui appel la méthode coder de tous les codeurs.

## Exercice 4 : Les Managers
Créer une interface __Manager__ dans le package `compagnie.competences` qui définit la méthode void _manager()_.

Créer une classe __ProjetManager__ dans le package `compagnie.postes`. Elle hérite de la classe __Employe__ et implémente l’interface __Manager__. La méthode manager affiche « [nom prénom] : manage »
Ajouter a la classe __Compagnie__ une liste de manager, une méthode pour ajouter un manager (_ajouterManager()_) et une méthode pour appeler toutes les méthode _manager_ des managers.

## Exercice 5 : L’embauche
Dans la classe __Compagnie__, créer une méthode void embaucher(Employe employe) qui :
-	Si employé est __Codeur__ et qu’il y a moins de 10 codeurs, alors il est ajouté à la liste des employés et des codeurs. 
-	Si employé est __Manager__ et qu’il y a moins de 3 managers, alors il est ajouté aux employés de la compagnie ainsi qu’aux managers. 

## Exercice 6 : Lead-Dev
Créer une classe __LeadDeveloppeur__ qui hérite de développeur mais qui implémente aussi __Manager__.
La méthode _manager_ affiche « [nom prenom] : manager technique ».
En l’embauchant, il doit être considéré comme un Codeur et un Manager mais doit n’être qu’un seul employé (attention aux doublons dans la liste des employés). 

## Exercice 7 : Administration
Créer une interface __Administratif__ dans le package compagnie.competences qui définie la méthode administrer().
Créer une classe __AgentAdministratif__ qui hérite de la classe __Employe__ et qui implémente les interfaces __Administratif__ et Manager. La méthode administrer() affiche « [nom prénom] : administre.
Dans la classe __Compagnie__, ajouter une liste d’Administratifs. Il ne peut y avoir que 3 administratifs. Ajouter une méthode _ajouterAdministratif(__Administratif__ administratif)_ qui ajout un administratif a la liste des administratif . Ajouter une méthode _administrer()_ qui appel toutes les méthodes _administrer()_ des __Administratif__s. 

## Exercice 8 : Statistique de la compagnie
Réécrire la méthode toString() qui retourne le format suivent :
__Compagnie__ <Nom de la compagnie>
Nombre de codeurs : <codeurs>
Nombre de managers : <managers>
Nombre d’administratif : <administratifs>
Effectif Total : <nombre d’employé total>



