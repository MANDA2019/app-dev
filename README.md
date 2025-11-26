# GLBARViewer

GLBARViewer est une application Android permettant d’afficher des modèles 3D au format GLB en réalité augmentée à partir d’un lien hébergé (par exemple sur GitHub).

## Fonctionnalités

- Chargement d’un modèle 3D au format `.glb`
- Ouverture de la visionneuse AR (Scene Viewer / ARCore compatible)
- Interface simple pour tester rapidement un modèle 3D

## Prérequis

- Android Studio (version récente)
- Appareil Android compatible ARCore (Android 7.0+ recommandé)
- Java/Kotlin et Gradle configurés

## Installation

1. Cloner le dépôt :

git clone https://github.com/MANDA2019/app-dev.git
cd app-dev

2. Ouvrir le projet dans Android Studio.
3. Laisser Android Studio synchroniser Gradle et construire le projet.

## Utilisation

- Lancer l’application depuis Android Studio sur un appareil ou un émulateur.
- Appuyer sur le bouton permettant d’ouvrir le modèle en AR.
- Vérifier que l’URL du fichier `.glb` est correcte et accessible en public.

## Structure du projet

- `app/src/main/java/...` : code source Kotlin/Java de l’application.
- `app/src/main/res/` : ressources (layouts, valeurs, icônes, etc.).
- `build.gradle` et fichiers Gradle : configuration de la construction du projet.

## Contributions

Les suggestions d’amélioration et les rapports de bugs sont les bienvenus via les issues GitHub ou des pull requests.

## Licence

Ce projet est distribué sous la licence de ton choix (par exemple MIT, Apache 2.0, GPLv3, etc.). Met à jour cette section et ajoute un fichier `LICENSE` si nécessaire.
