Lab1. Hello, Java World!
====

### Configuring Java development environment ###
#### Java Development Kit (JDK) distributions
* Oracle Java SE Development Kit 8 (Java8) http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* OpenJDK 8 http://jdk.java.net/8/

#### Install JDK on Windows #####
1. Download a JDK installer from a website.
2. Run the installer
  - Note at which directory the JDK is installed
  - Suppose that the JDK is installed at *JDK* (e.g., C:\Program Files\Java\jdk1.8.0_192)
3. After install, update (or create) system environment variable `PATH` and `JAVA_HOME`
  1. Right click on `My Computer` to open `Properties (R)`
  2. Click `Advanced System Setting`
  3. Click `Environment Variable (N)`
  4. Edit a User Variable `Path` to add a new entry *JDK/bin*
  5. Create a new System Variable `JAVA_HOME` with a value *JDK/bin*

#### Install JDK on Mac OS ####
1. Download a JDK installer from a website.
2. Run the installer

#### Editor for Programming #####
* Vim
  - Graphic Vim: https://www.vim.org/download.php
* Atom: https://atom.io/
* Sublime Text 3: https://www.sublimetext.com/3  

### Example Code ###
1. [Hello.java](Hello.java)
1. [HelloCLA.java](HelloCLA.java)
1. [HelloStdIn.java](HelloStdIn.java)
1. [HelloFileIn.java](HelloFileIn.java)
1. [HelloMultiplejava](HelloMultiple.java)
1. [HelloGUI.java](HelloGUI.java)
1. [HelloPaint.java](HelloPaint.java)

### Compiling and Executing Java Programs ###
1. Launch a shell (e.g., Bash, Powershell of Windows)
2. Move to a directory where the source file is located
3. For a Java source file `ClassName.java`, give the compliation command `javac ClassName.java`
  - If succeeded, `ClassName.class` will be created as the result
4. Execute the compiled program by giving a command `java ClassName`
  - If the program has a package name `X.Y.Z`, place `ClassName.class` at `X/Y/Z`. And then, command `java X.Y.Z.ClassName`

### Classwork Description ###
* Mission: [cw1.pdf](cw1.pdf)
