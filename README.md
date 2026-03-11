Eclipse Kura-Position™
=============
Eclipse Kura™ Position addon

<p align="center">
<img src="https://eclipse.dev/kura/images/kura.png" alt="Kura™ logo" width="500"/>
</p>

Install
-------

Eclipse Kura-Position™ is compatible with Java 17.

### Target Installer
Eclipse Kura-Position™ provides an Eclipse Kura™ addon for position tracking, and the REST API to access position data.

### Documentation
Eclipse Kura-Position™ Documentation can be found at:

- [Kura Position Addon](https://eclipse-kura.github.io/kura/latest/core-services/position-service/)
- [Kura Position REST API](https://eclipse-kura.github.io/kura/latest/references/rest-apis/rest-position-api/)

Build
-----

### Prerequisites

In order to be able to build Eclipse Kura™ on your development machine, you need to have the following programs installed in your system:
* JDK 21
* Maven 3.9.9+

<details>
<summary>

#### Installing Prerequisites in Mac OS 

</summary>

To install Java 17, download the JDK tar archive from the [Adoptium Project Repository](https://adoptium.net/en-GB/temurin/releases/?variant=openjdk8&jvmVariant=hotspot&version=17).

Once downloaded, copy the tar archive in `/Library/Java/JavaVirtualMachines/` and cd into it. Unpack the archive with the following command:

```bash
sudo tar -xzf <archive-name>.tar.gz
```

The tar archive can be deleted afterwards.

Depending on which terminal you are using, edit the profiles (.zshrc, .profile, .bash_profile) to contain:

```bash
export JAVA_HOME=/Library/Java/JavaVirtualMachines/<archive-name>/Contents/Home
```

Reload the terminal and run `java -version` to make sure it is installed correctly.

Using [Brew](https://brew.sh/) you can easily install Maven from the command line:

```bash
brew install maven@3.9
```
Run `mvn -version` to ensure that Maven has been added to the PATH. If Maven cannot be found, try running `brew link maven@3.9 --force` or manually add it to your path with:

```bash
export PATH="/usr/local/opt/maven@3.9/bin:$PATH"
```

</details>

<details>
<summary>

#### Installing Prerequisites in Linux

</summary>

For Java
```bash
sudo apt install openjdk-21-jdk
```
For Maven   

You can follow the tutorial from the official [Maven](http://maven.apache.org/install.html) site. Remember that you need to install the 3.9.9+ version.

</details>

### Build Eclipse Kura-Position™

Change to the new directory and clone the Eclipse Kura™ repo:

```bash
git clone https://github.com/eclipse-kura/kura-position.git
```

Move inside the newly created directory and build the project:

```bash
mvn clean install
```

> [!TIP]
You can skip tests by adding `-Dmaven.test.skip=true` in the command above.
