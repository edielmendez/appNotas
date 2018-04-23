package com.ediel.notas.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dev2 on 23/04/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void onCreate(SQLiteDatabase database) {
        createTable(database); // Crear la tabla "gasto"
    }

    /**
     * Crear tabla en la base de datos
     *
     * @param database Instancia de la base de datos
     */
    private void createTable(SQLiteDatabase database) {
        String cmd = "CREATE TABLE " + ContractParaNotas.NOTA + " (" +
                ContractParaNotas.Columnas._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ContractParaNotas.Columnas.TITULO + " TEXT, " +
                ContractParaNotas.Columnas.TEXTO + " TEXT, " +
                ContractParaNotas.Columnas.CREATED_AT + " TEXT, " +
                ContractParaNotas.Columnas.LAST_MODIFICATION + " TEXT," +
                ContractParaNotas.Columnas.ID_REMOTA + " TEXT UNIQUE," +
                ContractParaNotas.Columnas.ESTADO + " INTEGER NOT NULL DEFAULT "+ ContractParaNotas.ESTADO_OK+"," +
                ContractParaNotas.Columnas.PENDIENTE_INSERCION + " INTEGER NOT NULL DEFAULT 0)";
        database.execSQL(cmd);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try { db.execSQL("drop table " + ContractParaNotas.NOTA); }
        catch (SQLiteException e) { }
        onCreate(db);
    }
}
