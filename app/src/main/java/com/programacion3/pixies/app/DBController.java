package com.programacion3.pixies.app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.LinkedList;
import java.util.List;

public class DBController extends SQLiteOpenHelper {
    String nombre = "Chocapic";
    String categoria = "Cereales";
    int precio = 10;
    int cantidad = 2;
    int imagen = R.drawable.alcancia;
    String nombre2 = "Hola";
    String categoria2 = "Cereales";
    int precio2 = 10;
    int cantidad2 = 2;
    int imagen2 = R.drawable.alcancia2;
    String nombre3 = "Holaaaa";
    String categoria3 = "Lacteos";
    int precio3 = 120;
    int cantidad3 = 42;
    int imagen3 = R.drawable.alcancia3;


    public DBController(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Productos (_id INTEGER PRIMARY KEY AUTOINCREMENT, Imagen INTEGER, Cantidad INTEGER, Precio INTEGER, Nombre TEXT, Categoria TEXT);");
        ContentValues contentValues = new ContentValues();
        ContentValues contentValues1 = new ContentValues();
        ContentValues contentValues2 = new ContentValues();

        contentValues.put("Imagen",imagen);
        contentValues.put("Cantidad",cantidad);
        contentValues.put("Precio",precio);
        contentValues.put("Nombre",nombre);
        contentValues.put("Categoria",categoria);
        contentValues1.put("Imagen",imagen2);
        contentValues1.put("Cantidad",cantidad2);
        contentValues1.put("Precio",precio2);
        contentValues1.put("Nombre",nombre2);
        contentValues1.put("Categoria",categoria2);
        contentValues2.put("Imagen",imagen3);
        contentValues2.put("Cantidad",cantidad3);
        contentValues2.put("Precio",precio3);
        contentValues2.put("Nombre",nombre3);
        contentValues2.put("Categoria",categoria3);
        
        db.insert("Productos", null, contentValues);
        db.insert("Productos",null,contentValues1);
        db.insert("Productos",null,contentValues2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Productos;");
        onCreate(db);
    }

    public List<Producto> getAllProducts(){
        List<Producto> productoList = new LinkedList<>();
        Cursor cursor = getReadableDatabase().rawQuery("SELECT * FROM Productos",null);
        while(cursor.moveToNext()){
            productoList.add(new Producto(cursor.getInt(1),cursor.getInt(2),cursor.getInt(3),cursor.getString(4), cursor.getString(5)));
        }
        return productoList;
    }

    // TODO: ADD FUNCTION TO GET ALL PRODUCTS BY CATEGORY
    public List<Producto> getAllProductsByCategory(String category) {
        List<Producto> productoList = new LinkedList<>();
        Cursor cursor = getReadableDatabase().rawQuery("SELECT * FROM Productos WHERE Categoria = '"+category+"'",null);
        while(cursor.moveToNext()){
            productoList.add(new Producto(cursor.getInt(1),cursor.getInt(2),cursor.getInt(3),cursor.getString(4), cursor.getString(5)));
        }
        return productoList;
    }

}
