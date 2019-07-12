# training-quarkus

## Informations préalables
Projet découverte de quarkus.
Basé sur le tuto https://blog.zenika.com/2019/04/23/zoom-sur-quarkus/

## Création du projet

Basé sur un archetype
```
mvn io.quarkus:quarkus-maven-plugin:0.13.3:create -DprojectGroupId=fr.psoi.training.quarkus -DprojectArtifactId=training-quarkus -DclassName="fr.psoi.training.quarkus.rest.PersonRest" -Dpath="/persons" -Dextensions="resteasy-jsonb"
```

## Projet (en mode dev)

```
[INFO] ========================================================================================
[INFO] Your new application has been created in ...
[INFO] Navigate into this directory and launch your application with mvn compile quarkus:dev
[INFO] Your application will be accessible on http://localhost:8080
[INFO] ========================================================================================
```