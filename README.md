# JOOQTest

You will need the latest jdbc driver ojdbc7.jar 

<dependency>
  <artifactId>com.avon</artifactId>
  <groupId>ojdbc7</groupId>
  <version>1.0-SNAPSHOT</version>
  <scope>system</scope>
  <systemPath><!-- CHANGE THIS! -->/ojdbc7.jar</systemPath>
</dependency>

I'm using:
```
<dependency>
            <groupId>org.jooq.trial</groupId>
            <artifactId>jooq</artifactId>
            <version>3.7.2</version>
</dependency>
```
and the trial needs JAVA 8...

to run the test:

mvn install

to generate the code (not needed):

install -Dmaven.test.skip=true

and in the profiles line (just next line in IDEA):

generation

