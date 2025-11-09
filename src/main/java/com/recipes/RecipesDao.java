package com.recipes;

public class RecipesDao {

    /***
     * SQLite 
     * https://www.sqlitetutorial.net/
     * ACID-compliant transactions - all or not
     * dynamic types for tables and columns 
     * single db connection to acces multiple db
     * db saved to local disk 
     * 
     * Location: 
     * /Users/neezcha/sqlite
     * 
     * Commands: 
     * sqlite3 > .help > .open thisdb.db > .databases > .quit
     * sqlite3 ./db/thisdb.db 
     * > attach database "./thisdb.db" AS thisData;
     * > .schema TABLE > .indexes TABLE 
     * > type into sqlite3 conolse, new lines [enter], terminate query [; enter]
     * > .mode column > .header on > .nullvalue NULL
     * > .output FILENAME.txt > .output // to view 
     * > .read ./commands.txt  >
     * 
     * GUI tool: https://github.com/pawelsalawa/sqlitestudio/releases
     * 
     * https://www.baeldung.com/spring-boot-sqlite
     * 
    ***/ 

    private void dbTestCall() {
        String sqlQuery = "SELCT name FROM name WHERE ";
         
    }
    
}