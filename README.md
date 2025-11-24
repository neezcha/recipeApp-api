# recipeApp-api
recipeApp-API

## Java Spring Boot Maven
mvn spring-boot:run
/greeting?name=meeee
/recipes

## SQLite 
https://www.sqlitetutorial.net/
ACID-compliant transactions
- all or nothing
- dynamic types for tables and columns 
- single db connection to acces multiple db
- db saved to local disk 

Location: 
/Users/me/sqlite

Commands: 
sqlite3 > .help > .open thisdb.db  > .quit
sqlite3 ./db/thisdb.db 
> .databases > .open thisdb.db > .tables > .schema TABLE > .indexes TABLE
> attach database "./thisdb.db" AS thisData;

> type into sqlite3 conolse, new lines [enter], terminate query [; enter]
> .mode column > .header on > .nullvalue NULL
> .output FILENAME.txt > .output // to view 
> .read ./commands.txt  >

GUI tool: https://github.com/pawelsalawa/sqlitestudio/releases
