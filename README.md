# openmucProject
Project that includes the openmuc/jrxtx module


```bash
# Had to install this for the openmuc stuff to work
sudo apt-get install librxtx-java
```


To build project;
- Open _Maven Projects_ tab on right side of IntelliJ screen
- Select _clean_ to wipe the `\target` directory
- Select _package_ to recompile to the `\target` directory
- Executable JAR will be located at `\target\OpenmucRunner.jar`


Set up the debug configuration as shown in issue
~ https://github.com/andrewalexanderbalogh/openmucProject/issues/1

If just trying to run the executable JAR, have to specify a VM Option in command;
```bash
# Also have to set following VM-Option when running the JAR (or in debug)
java -Djava.library.path=/usr/lib/jni -jar target/OpenmucRunner.jar
```

References
- https://github.com/openmuc/jrxtx
- https://openmuc.github.io/jrxtx/javadoc/index.html
- https://mvnrepository.com/artifact/org.openmuc/jrxtx/1.0.1
 


