package com.javamasterclass.dependencyinversionexample;

interface DBConnectionInterface {
    int connect();
}

class MySqlConnection implements DBConnectionInterface {

    @Override
    public int connect() {
        return 1;
    }
}

class PasswordReminder {
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}

public class Main {
}
