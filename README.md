## Employee Management System
###### In this project there are 4 types of employees Consultant,Manager,SrManager,President.
###### Employees can mark thier attendence on manual given time or default time

## Requirements
##### 1.scala 2.13.6
##### 2. sbt 1.3.8
##### 3. IDE


## Installation of Sbt and scala
#### 1.You must first install a JDK. We recommend AdoptOpenJDK JDK 8 or JDK 11.

#### 2.Next, install Sbt by typing the following commands:

```bash
echo "deb https://repo.scala-sbt.org/scalasbt/debian all main" | sudo tee /etc/apt/sources.list.d/sbt.list
echo "deb https://repo.scala-sbt.org/scalasbt/debian /" | sudo tee /etc/apt/sources.list.d/sbt_old.list
curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | sudo apt-key add
sudo apt-get update
sudo apt-get install sbt
```
#### 3.Verify the installation by running command:
```bash
sbt sbt version
```

## Usage

#### 1. Clone the project.
```bash
git clone https://github.com/akashkr17/UT-IT-assign.git
```

#### 2. Compile the code 
```bash
sbt compile
```
#### 2. Test the code 
```bash
sbt test
```
#### 2. Execute the code 
```bash
sbt test
```
