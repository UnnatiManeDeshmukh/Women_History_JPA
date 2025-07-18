# 📜 Digital Museum for Historical Women

A **menu‑driven Java console application** built with **Maven**, **JPA**, and **Hibernate 7.x** that stores and manages records of women in history using a **PostgreSQL** database.

---

## ✨ Features
✅ **Insert** new historical women into the database  
✅ **Display all** records from the database  
✅ **Update** an existing record by ID  
✅ **Delete** a record by ID  
✅ **Menu‑driven console interface**

---

## 🏗️ Technologies Used
- ☕ **Java 17**
- 🏗️ **Maven**
- 📦 **JPA (Jakarta Persistence)**
- ⚡ **Hibernate ORM 7.0.5**
- 🐘 **PostgreSQL**

---

## 📂 Project Structure
```
src
├─ main
│ ├─ java
│ │ ├─ app
│ │ │ └─ MainApp.java
│ │ └─ entity
│ │ └─ WomenEntity.java
│ └─ resources
│ └─ META-INF
│ └─ persistence.xml
└─ pom.xml
```
---

## ⚙️ Prerequisites
- ✅ JDK 17 installed
- ✅ PostgreSQL installed and running
- ✅ Maven installed

---

## 🗄️ Database Setup

Run these SQL commands in PostgreSQL before running the app:

```sql
CREATE TABLE IF NOT EXISTS women_in_history (
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    birth_year INT,
    country TEXT,
    contribution TEXT NOT NULL
);

INSERT INTO women_in_history (name, birth_year, country, contribution) VALUES
('Kittur Rani Chennamma', 1778, 'India', 'One of the first Indian female rulers to rebel against British rule'),
('Anandi Gopal Joshi', 1865, 'India', 'First Indian woman to become a doctor of Western medicine'),
('Amrita Sher-Gil', 1913, 'India', 'Famous Indian-Hungarian painter considered a pioneer in modern Indian art'),
('Aruna Asaf Ali', 1909, 'India', 'Prominent freedom fighter and Delhi’s “Heroine of 1942”'),
('Begum Rokeya', 1880, 'India (now Bangladesh)', 'Early advocate of women’s rights and education in South Asia'),
('Rosalind Franklin', 1920, 'UK', 'Contributed to the discovery of DNA structure'),
('Jhansi Ki Rani Avantibai', 1831, 'India', 'Fought against British during 1857 rebellion'),
('Durgabai Deshmukh', 1909, 'India', 'Freedom fighter and founder of the Andhra Mahila Sabha'),
('Kamala Sohonie', 1912, 'India', 'First Indian woman to receive a PhD in science'),
('Usha Mehta', 1920, 'India', 'Organized underground radio during Quit India Movement');
```
---
## 📦 Maven Dependencies

Below are the dependencies required in your pom.xml:
```
<properties>
  <maven.compiler.source>17</maven.compiler.source>
  <maven.compiler.target>17</maven.compiler.target>
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>

<dependencies>
  <dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>7.0.5.Final</version>
  </dependency>
  <dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.7</version>
  </dependency>
  <dependency>
    <groupId>jakarta.persistence</groupId>
    <artifactId>jakarta.persistence-api</artifactId>
    <version>3.2.0</version>
  </dependency>
  <dependency>
    <groupId>jakarta.transaction</groupId>
    <artifactId>jakarta.transaction-api</artifactId>
    <version>2.0.1</version>
  </dependency>
</dependencies>

```
------
## 📦Persistence.xml
```
<?xml version="1.0" encoding="UTF-8"?>

<persistence xmlns="https://jakarta.ee/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence https://jakarta.ee/xml/ns/persistence/persistence_3_0.xsd"
             version="3.0">
    <!-- Define a persistence unit named myPersistence -->
    <persistence-unit name="myPersistence" transaction-type="RESOURCE_LOCAL">
        
        
        <class>women_entity.WomanEntity</class>

        <properties>
            <property name="jakarta.persistence.jdbc.driver" value="org.postgresql.Driver"/>
            
            <property name="jakarta.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/Historical_Womens"/>
            
            <property name="jakarta.persistence.jdbc.user" value="postgres"/>
            
            <property name="jakarta.persistence.jdbc.password" value="unnatimd22"/>
            
            <property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQLDialect"/>
            
            <property name="hibernate.show_sql" value="false"/>

            <property name="hibernate.format_sql" value="true"/>
            
          <property name="jakarta.persistence.schema-generation.database.action" value="update"/>
        
        </properties>
    </persistence-unit>
</persistence>
```


---
## 🖼️ Output Screenshot

![output](https://github.com/user-attachments/assets/130fbffb-9ca2-4c0f-84d1-b7c0cc3cc329)

----
## 📞 Contact

For any questions or feedback, feel free to reach out:

- **Your Name** : Unnati Mane Deshmukh
- **Email**: unnatimd@22gmail.com
- **GitHub**: UnnatiManeDeshmukh

---

