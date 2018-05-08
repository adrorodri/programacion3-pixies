package com.programacion3.pixies.app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.LinkedList;
import java.util.List;

public class DBController extends SQLiteOpenHelper {

    //Cereales
    String nombre = "Nesquick";
    String categoria = "Cereales";
    int precio = 30;
    int cantidad = 10;
    int imagen = R.drawable.cereal_nesquick;
    String nombre2 = "Cornflex";
    String categoria2 = "Cereales";
    int precio2 = 20;
    int cantidad2 = 10;
    int imagen2 = R.drawable.cereal_corn;
    String nombre3 = "Reeses";
    String categoria3 = "Cereales";
    int precio3 = 30;
    int cantidad3 = 10;
    int imagen3 = R.drawable.cereal_reeses;
    String nombre4 = "Chocapic";
    String categoria4 = "Cereales";
    int precio4 = 15;
    int cantidad4 = 10;
    int imagen4 = R.drawable.cereal_trix;
    String nombre5 = "Minis";
    String categoria5 = "Cereales";
    int precio5 = 20;
    int cantidad5 = 10;
    int imagen5 = R.drawable.cereal_minis;

    //Lacteos
    String nombre6 = "Bonle";
    String categoria6 = "Lacteos";
    int precio6 = 30;
    int cantidad6 = 10;
    int imagen6 = R.drawable.lacteos_bonle;
    String nombre7 = "Chicolac";
    String categoria7 = "Lacteos";
    int precio7 = 20;
    int cantidad7= 10;
    int imagen7 = R.drawable.lacteos_chicolac;
    String nombre8 = "Gloria";
    String categoria8 = "Lacteos";
    int precio8 = 30;
    int cantidad8 = 10;
    int imagen8 = R.drawable.lacteos_gloria;
    String nombre9 = "Silk";
    String categoria9 = "Lacteos";
    int precio9 = 15;
    int cantidad9 = 10;
    int imagen9 = R.drawable.lacteos_silk;
    String nombre10= "Yogurt";
    String categoria10 = "Lacteos";
    int precio10 = 20;
    int cantidad10 = 10;
    int imagen10 = R.drawable.lacteos_yougurt;

    //Bebidas
    String nombre11 = "Fanta";
    String categoria11 = "Bebidas";
    int precio11 = 30;
    int cantidad11 = 10;
    int imagen11 = R.drawable.bebida_fanta;
    String nombre12 = "Sprite";
    String categoria12 = "Bebidas";
    int precio12 = 20;
    int cantidad12 = 10;
    int imagen12 = R.drawable.bebida_sprite;
    String nombre13 = "Jugo DelValle";
    String categoria13 = "Bebidas";
    int precio13 = 30;
    int cantidad13 = 10;
    int imagen13 = R.drawable.bebida_valle;
    String nombre14 = "Agua Vital";
    String categoria14 = "Bebidas";
    int precio14 = 15;
    int cantidad14 = 10;
    int imagen14 = R.drawable.bebida_vital;
    String nombre15 = "Coca-Cola";
    String categoria15 = "Bebidas";
    int precio15 = 20;
    int cantidad15 = 10;
    int imagen15 = R.drawable.bebidas_coca;

    //Panaderia
    String nombre16 = "Bimbo";
    String categoria16 = "Panaderia";
    int precio16 = 30;
    int cantidad16 = 10;
    int imagen16 = R.drawable.panaderia_bimbo;
    String nombre17 = "Croissant";
    String categoria17 = "Panaderia";
    int precio17 = 20;
    int cantidad17= 10;
    int imagen17 = R.drawable.panaderia_croissant;
    String nombre18 = "Pan Hamburguesa";
    String categoria18 = "Panaderia";
    int precio18 = 30;
    int cantidad18 = 10;
    int imagen18 = R.drawable.panaderia_hamburguesa;
    String nombre19 = "Baguette";
    String categoria19 = "Panaderia";
    int precio19 = 15;
    int cantidad19 = 10;
    int imagen19 = R.drawable.panaderia_panbaguette;
    String nombre20= "Pan de Leche";
    String categoria20 = "Panaderia";
    int precio20 = 20;
    int cantidad20 = 10;
    int imagen20 = R.drawable.panaderia_panleche;

    //Aseo
    String nombre21 = "Ace";
    String categoria21 = "Aseo";
    int precio21 = 30;
    int cantidad21 = 10;
    int imagen21 = R.drawable.aseo_ace;
    String nombre22 = "Colgate";
    String categoria22 = "Aseo";
    int precio22 = 20;
    int cantidad22 = 10;
    int imagen22 = R.drawable.aseo_colgate;
    String nombre23 = "Dove";
    String categoria23 = "Aseo";
    int precio23 = 30;
    int cantidad23 = 10;
    int imagen23 = R.drawable.aseo_dove;
    String nombre24 = "Head&Shoulders";
    String categoria24 = "Aseo";
    int precio24 = 15;
    int cantidad24 = 10;
    int imagen24 = R.drawable.aseo_head;
    String nombre25 = "Scott";
    String categoria25 = "Aseo";
    int precio25 = 20;
    int cantidad25 = 10;
    int imagen25 = R.drawable.aseo_scott;



    public DBController(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Productos (_id INTEGER PRIMARY KEY AUTOINCREMENT, Imagen INTEGER, Cantidad INTEGER, Precio INTEGER, Nombre TEXT, Categoria TEXT);");
        db.execSQL("CREATE TABLE Carrito (_id INTEGER PRIMARY KEY AUTOINCREMENT, Imagen INTEGER, Cantidad INTEGER, Precio INTEGER, Nombre TEXT,Usuario TEXT);");

        ContentValues contentValues = new ContentValues();
        ContentValues contentValues2 = new ContentValues();
        ContentValues contentValues3 = new ContentValues();
        ContentValues contentValues4 = new ContentValues();
        ContentValues contentValues5 = new ContentValues();
        ContentValues contentValues6 = new ContentValues();
        ContentValues contentValues7 = new ContentValues();
        ContentValues contentValues8 = new ContentValues();
        ContentValues contentValues9 = new ContentValues();
        ContentValues contentValues10 = new ContentValues();
        ContentValues contentValues11 = new ContentValues();
        ContentValues contentValues12 = new ContentValues();
        ContentValues contentValues13 = new ContentValues();
        ContentValues contentValues14 = new ContentValues();
        ContentValues contentValues15 = new ContentValues();
        ContentValues contentValues16 = new ContentValues();
        ContentValues contentValues17 = new ContentValues();
        ContentValues contentValues18 = new ContentValues();
        ContentValues contentValues19 = new ContentValues();
        ContentValues contentValues20 = new ContentValues();
        ContentValues contentValues21 = new ContentValues();
        ContentValues contentValues22 = new ContentValues();
        ContentValues contentValues23 = new ContentValues();
        ContentValues contentValues24 = new ContentValues();
        ContentValues contentValues25 = new ContentValues();

        //Cereales
        contentValues.put("Imagen",imagen);
        contentValues.put("Cantidad",cantidad);
        contentValues.put("Precio",precio);
        contentValues.put("Nombre",nombre);
        contentValues.put("Categoria",categoria);
        contentValues2.put("Imagen",imagen2);
        contentValues2.put("Cantidad",cantidad2);
        contentValues2.put("Precio",precio2);
        contentValues2.put("Nombre",nombre2);
        contentValues2.put("Categoria",categoria2);
        contentValues3.put("Imagen",imagen3);
        contentValues3.put("Cantidad",cantidad3);
        contentValues3.put("Precio",precio3);
        contentValues3.put("Nombre",nombre3);
        contentValues3.put("Categoria",categoria3);
        contentValues4.put("Imagen",imagen4);
        contentValues4.put("Cantidad",cantidad4);
        contentValues4.put("Precio",precio4);
        contentValues4.put("Nombre",nombre4);
        contentValues4.put("Categoria",categoria4);
        contentValues5.put("Imagen",imagen5);
        contentValues5.put("Cantidad",cantidad5);
        contentValues5.put("Precio",precio5);
        contentValues5.put("Nombre",nombre5);
        contentValues5.put("Categoria",categoria5);

        //Lacteos
        contentValues6.put("Imagen",imagen6);
        contentValues6.put("Cantidad",cantidad6);
        contentValues6.put("Precio",precio6);
        contentValues6.put("Nombre",nombre6);
        contentValues6.put("Categoria",categoria6);
        contentValues7.put("Imagen",imagen7);
        contentValues7.put("Cantidad",cantidad7);
        contentValues7.put("Precio",precio7);
        contentValues7.put("Nombre",nombre7);
        contentValues7.put("Categoria",categoria7);
        contentValues8.put("Imagen",imagen8);
        contentValues8.put("Cantidad",cantidad8);
        contentValues8.put("Precio",precio8);
        contentValues8.put("Nombre",nombre8);
        contentValues8.put("Categoria",categoria8);
        contentValues9.put("Imagen",imagen9);
        contentValues9.put("Cantidad",cantidad9);
        contentValues9.put("Precio",precio9);
        contentValues9.put("Nombre",nombre9);
        contentValues9.put("Categoria",categoria9);
        contentValues10.put("Imagen",imagen10);
        contentValues10.put("Cantidad",cantidad10);
        contentValues10.put("Precio",precio10);
        contentValues10.put("Nombre",nombre10);
        contentValues10.put("Categoria",categoria10);

        //Bebidas
        contentValues11.put("Imagen",imagen11);
        contentValues11.put("Cantidad",cantidad11);
        contentValues11.put("Precio",precio11);
        contentValues11.put("Nombre",nombre11);
        contentValues11.put("Categoria",categoria11);
        contentValues12.put("Imagen",imagen12);
        contentValues12.put("Cantidad",cantidad12);
        contentValues12.put("Precio",precio12);
        contentValues12.put("Nombre",nombre12);
        contentValues12.put("Categoria",categoria12);
        contentValues13.put("Imagen",imagen13);
        contentValues13.put("Cantidad",cantidad13);
        contentValues13.put("Precio",precio13);
        contentValues13.put("Nombre",nombre13);
        contentValues13.put("Categoria",categoria13);
        contentValues14.put("Imagen",imagen14);
        contentValues14.put("Cantidad",cantidad14);
        contentValues14.put("Precio",precio14);
        contentValues14.put("Nombre",nombre14);
        contentValues14.put("Categoria",categoria14);
        contentValues15.put("Imagen",imagen15);
        contentValues15.put("Cantidad",cantidad15);
        contentValues15.put("Precio",precio15);
        contentValues15.put("Nombre",nombre15);
        contentValues15.put("Categoria",categoria15);

        //Panaderia
        contentValues16.put("Imagen",imagen16);
        contentValues16.put("Cantidad",cantidad16);
        contentValues16.put("Precio",precio16);
        contentValues16.put("Nombre",nombre16);
        contentValues16.put("Categoria",categoria16);
        contentValues17.put("Imagen",imagen17);
        contentValues17.put("Cantidad",cantidad17);
        contentValues17.put("Precio",precio17);
        contentValues17.put("Nombre",nombre17);
        contentValues17.put("Categoria",categoria17);
        contentValues18.put("Imagen",imagen18);
        contentValues18.put("Cantidad",cantidad18);
        contentValues18.put("Precio",precio18);
        contentValues18.put("Nombre",nombre18);
        contentValues18.put("Categoria",categoria18);
        contentValues19.put("Imagen",imagen19);
        contentValues19.put("Cantidad",cantidad19);
        contentValues19.put("Precio",precio19);
        contentValues19.put("Nombre",nombre19);
        contentValues19.put("Categoria",categoria19);
        contentValues20.put("Imagen",imagen20);
        contentValues20.put("Cantidad",cantidad20);
        contentValues20.put("Precio",precio20);
        contentValues20.put("Nombre",nombre20);
        contentValues20.put("Categoria",categoria20);

        //Aseo
        contentValues21.put("Imagen",imagen21);
        contentValues21.put("Cantidad",cantidad21);
        contentValues21.put("Precio",precio21);
        contentValues21.put("Nombre",nombre21);
        contentValues21.put("Categoria",categoria21);
        contentValues22.put("Imagen",imagen22);
        contentValues22.put("Cantidad",cantidad22);
        contentValues22.put("Precio",precio22);
        contentValues22.put("Nombre",nombre22);
        contentValues22.put("Categoria",categoria22);
        contentValues23.put("Imagen",imagen23);
        contentValues23.put("Cantidad",cantidad23);
        contentValues23.put("Precio",precio23);
        contentValues23.put("Nombre",nombre23);
        contentValues23.put("Categoria",categoria23);
        contentValues24.put("Imagen",imagen24);
        contentValues24.put("Cantidad",cantidad24);
        contentValues24.put("Precio",precio24);
        contentValues24.put("Nombre",nombre24);
        contentValues24.put("Categoria",categoria24);
        contentValues25.put("Imagen",imagen25);
        contentValues25.put("Cantidad",cantidad25);
        contentValues25.put("Precio",precio25);
        contentValues25.put("Nombre",nombre25);
        contentValues25.put("Categoria",categoria25);

        db.insert("Productos", null, contentValues);
        db.insert("Productos",null,contentValues2);
        db.insert("Productos",null,contentValues3);
        db.insert("Productos",null,contentValues4);
        db.insert("Productos",null,contentValues5);
        db.insert("Productos", null, contentValues6);
        db.insert("Productos",null,contentValues7);
        db.insert("Productos",null,contentValues8);
        db.insert("Productos",null,contentValues9);
        db.insert("Productos",null,contentValues10);
        db.insert("Productos", null, contentValues11);
        db.insert("Productos",null,contentValues12);
        db.insert("Productos",null,contentValues13);
        db.insert("Productos",null,contentValues14);
        db.insert("Productos",null,contentValues15);
        db.insert("Productos", null, contentValues16);
        db.insert("Productos",null,contentValues17);
        db.insert("Productos",null,contentValues18);
        db.insert("Productos",null,contentValues19);
        db.insert("Productos",null,contentValues20);
        db.insert("Productos", null, contentValues21);
        db.insert("Productos",null,contentValues22);
        db.insert("Productos",null,contentValues23);
        db.insert("Productos",null,contentValues24);
        db.insert("Productos",null,contentValues25);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Productos;");
        onCreate(db);
    }

    public void insertCarrito(int image,int cantidad,int precio,String nombre,String usuario){
        ContentValues contentValues = new ContentValues();
        contentValues.put("Imagen",image);
        contentValues.put("Cantidad",cantidad);
        contentValues.put("Precio",precio);
        contentValues.put("Nombre",nombre);
        contentValues.put("Usuario",usuario);
        getWritableDatabase().insert("Carrito",null,contentValues);
    }

    public void comprarCarrito(String usuario){
        List<Producto> productoList = new LinkedList<>();
        Cursor cursor = getWritableDatabase().rawQuery("DELETE FROM Carrito WHERE Usuario = '"+usuario+"'",null);
        while(cursor.moveToNext()){
            productoList.remove(new Producto(cursor.getInt(1),cursor.getInt(2),cursor.getInt(3),cursor.getString(4), cursor.getString(5)));
        }
    }
    public List<Producto> selectCarrito(String usuario) {
        List<Producto> productoList = new LinkedList<>();
        Cursor cursor = getReadableDatabase().rawQuery("SELECT * FROM Carrito WHERE Usuario = '"+usuario+"'",null);
        while(cursor.moveToNext()){
            productoList.add(new Producto(cursor.getInt(1),cursor.getInt(2),cursor.getInt(3),cursor.getString(4), cursor.getString(5)));
        }
        return productoList;
    }


    public List<Producto> getAllProducts(){
        List<Producto> productoList = new LinkedList<>();
        Cursor cursor = getReadableDatabase().rawQuery("SELECT * FROM Productos",null);
        while(cursor.moveToNext()){
            productoList.add(new Producto(cursor.getInt(1),cursor.getInt(2),cursor.getInt(3),cursor.getString(4), cursor.getString(5)));
        }
        return productoList;
    }
    public List<Producto> getAllProductsByCategory(String category) {
        List<Producto> productoList = new LinkedList<>();
        Cursor cursor = getReadableDatabase().rawQuery("SELECT * FROM Productos WHERE Categoria = '"+category+"'",null);
        while(cursor.moveToNext()){
            productoList.add(new Producto(cursor.getInt(1),cursor.getInt(2),cursor.getInt(3),cursor.getString(4), cursor.getString(5)));
        }
        return productoList;
    }

}
