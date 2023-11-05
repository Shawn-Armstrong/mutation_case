# Mutation Case

### Summary
- This repository is a minimal recreation of a Java 17 mutation observed using Pitest _(1.15.0)_ in cojunction with JUnit5 _(5.9.3)_ test cases
- The complete report containing the mutant can be reviewed [here](https://shawn-armstrong.github.io/mutation_case/)

  <p align="center">
    <kbd><img src="https://github.com/Shawn-Armstrong/mutation_case/assets/80125540/4ff9cdff-796c-4191-bd7f-dbf98ab9436c.png" alt="Descriptive text for the image"><kbd></kbd>
  </p>
- The mutant of interest lives at `MyJavaProject2/app/src/main/java/myjavaproject2/Toto.java` and can be recreated locally with the following:
    
  ```Console
  git clone https://github.com/Shawn-Armstrong/mutation_case.git
  cd mutation_case
  gradlew clean build
  gradlew pitest 
  ```
