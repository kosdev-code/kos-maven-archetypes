# kos archetypes

This repository contains Maven archetypes for creating new projects.
To use one of these archetypes, you can clone this repo, then do the following.
1. cd to the archetype directory you want to use.
2. run `mvn install` to install the archetype to your local Maven repository.

Now you can run the `mvn archetype:generate` command with the appropriate parameters.

system-app-archetype: is a single module system application archetype.
```
mvn archetype:generate \
  -DarchetypeGroupId=com.kos.archetypes \
  -DarchetypeArtifactId=system-app \
  -DarchetypeVersion=1.0 \
  -DgroupId=com.nou.project \
  -DartifactId=my-nou-project
```

basic-app-archetype: is a single module basic application archetype.
```
mvn archetype:generate \
 -DarchetypeGroupId=com.kos.archetypes \
 -DarchetypeArtifactId=basic-app \
 -DarchetypeVersion=1.0 \
 -DgroupId=com.nou.project \
 -DartifactId=my-nou-project
```
sdk-app-archetype: is a multi module project for apps that also include SDKs.
```
mvn archetype:generate \
 -DarchetypeGroupId=com.kos.archetypes \
 -DarchetypeArtifactId=sdk-app \
 -DarchetypeVersion=1.0 \
 -DgroupId=com.nou.project \
 -DartifactId=my-nou-project
```
multi-module-archetype: is a multi module system application archetype.
```
mvn archetype:generate \
 -DarchetypeGroupId=com.kos.archetypes \
 -DarchetypeArtifactId=multi-module \
 -DarchetypeVersion=1.0 \
 -DgroupId=com.nou.project \
 -DartifactId=my-nou-project
```

example-projects
single-module-example-project: is the project used to create the single module archetypes.
multi-module-example-project: is the project used to create the multi module archetypes.
sdk-app-example-project: is the project used to create the SDK app archetype.



