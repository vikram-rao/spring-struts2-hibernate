### SETUP
Works out of the box with IntelliJ IDEA
1. Install open-jdk 11
2. Install apache-tomcat 9
3. Install mysql server 8
4. Install maven globally (use homebrew in mac)
5. Create database named `calc`
6. Create table as below in `calc` database
```sql
create table calc_history
(
    id   int(10) unsigned NOT NULL AUTO_INCREMENT,
    name varchar(100),
    primary key (id)
)
```
7. update db server credentials in `applicationContext.xml`


