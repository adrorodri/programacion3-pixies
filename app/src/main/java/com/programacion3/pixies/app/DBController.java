package com.programacion3.pixies.app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DBController extends SQLiteOpenHelper {
    String nombre,categoria;
    int precio,imagen;


    public DBController(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Productos (_id INTEGER PRIMARY KEY AUTOINCREMENT, Nombre TEXT, Precio INTEGER, Categoria TEXT, Imagen INTEGER);");
        ContentValues contentValues = new ContentValues();
        contentValues.put("Nombre",nombre);
        contentValues.put("Precio",precio);
        contentValues.put("Categoria",categoria);
        contentValues.put("Imagen",imagen);
        db.insert("Productos", null, contentValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Productos;");
        onCreate(db);
    }

    public List<Producto> select(){
        List<Producto> productoList = new LinkedList<>();
        Cursor cursor = getReadableDatabase().rawQuery("SELECT * FROM Producto",null);
        while(cursor.moveToNext()){
            productoList.add(new Producto(cursor.getInt(1),cursor.getInt(2),cursor.getInt(3),cursor.getString(4)));
        }
        return productoList;
    }
}
