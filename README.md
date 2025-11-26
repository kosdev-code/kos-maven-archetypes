# kos archetypes

This repository contains Maven archetypes for creating new projects.
To use one of these archetypes, you can clone this repo, then run the install script.

```bash
git clone https://github.com/kosdev-code/kos-maven-archetypes
```

```bash
cd kos-maven-archetyps
```

```bash
./install_archetypes.sh
```

Now you can run the `mvn archetype:generate` command with the appropriate parameters.

system-app-archetype: is a single module system application archetype.

```
mvn archetype:generate \
  -DarchetypeGroupId=com.kos.archetypes \
  -DarchetypeArtifactId=system-app
```

basic-app-archetype: is a single module basic application archetype.

```
mvn archetype:generate \
 -DarchetypeGroupId=com.kos.archetypes \
 -DarchetypeArtifactId=app
```

sdk-app-archetype: is a multi module project for apps that also include SDKs.

```
mvn archetype:generate \
 -DarchetypeGroupId=com.kos.archetypes \
 -DarchetypeArtifactId=sdk-app
```

multi-module-archetype: is a multi module system application archetype.

```
mvn archetype:generate \
 -DarchetypeGroupId=com.kos.archetypes \
 -DarchetypeArtifactId=multi-module
```

When generating any of these projects you can specify from the beginning
the artifactID, the groupID, the version of the artifact and the package path,
you want to use. By default the version is 0.0.0-SNAPSHOT

```
-DgroupId=com.myorg.myproject \
-DartifactId=my-artifact \
-Dversion=0.0.0-SNAPSHOT \
-Dpackage=com.my.package
```

example-projects
single-module-example-project: is the project used to create the single module archetypes.
multi-module-example-project: is the project used to create the multi module archetypes.
sdk-app-example-project: is the project used to create the SDK app archetype.
