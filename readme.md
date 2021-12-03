### 1. Membuat Project Maven 
    mvn archetype:generate
    maven-archetype-quickstart

### 2. Lifecycle
    maven lifecycle yang sering digunakan
    - clean -> menghapus folder target (hasil compile)
    - compile -> kompilasi source code project
    - test-compile -> kompilasi source code test
    - test -> menjalankan uni test
    - package -> membuat distribution file
    - install -> install project ke local repositoy
    - deploy -> deploy project ke remote repository

### 3. Scope
    - compile -> sebuah dependency akan digunakan untuk build, test dan run project
    - test -> scope untuk test project


### 4. Repository
    Kadang kita membutuhkan dependency yang tidak berada di maven central. Kita bisa menambahkan remote repository milik kita sendiri
    contoh dibawah ini adalah menggunakan blibli
    <repositories>
        <repository>
          <id>bintray-bliblidotcom-maven</id>
          <name>bintray</name>
          <url>https://dl.bintray.com/bliblidotcom/maven/</url>
        </repository>
    </repositories>

### 5. Membuat distribution file
    Kita bisa membuat distribution file menggunakan lifecycle package
    namun hasil distribution file nya hanya berisi binary code dari project kita (tanpa dependency) sehingga tidak bisa langsung dijalankan
    
    Untuk membuat distribution file beserta dependency nya salah satu caranya dalah menggunakan assembly plugin
    1. Tambahkan plugin di pom.xml
    2. set main class dari project kita
    
    detail : https://maven.apache.org/plugins/maven-assembly-plugin/usage.html

### 6. Membuat multi module project
    - Harus ada parentnya
    - Tambahkan  <packaging>pom</packaging> pada pom parent
    - Tambahkan <modules>...........</modules> pada pom parent
    