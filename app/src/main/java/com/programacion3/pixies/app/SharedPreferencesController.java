package com.programacion3.pixies.app;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

/**
 * Created by adro_ on 5/4/2018.
 */

public class SharedPreferencesController {

    private SharedPreferences sharedPreferences;
    private String SHARED_PREFERENCES_NAME = "SharedPrefs";
    private String KEY_USUARIO = "LoggedUser";

    public String getUsuario(){
            return sharedPreferences.getString(KEY_USUARIO,null);
    }


    public SharedPreferencesController(Context context) {
        sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public boolean isUserLoggedIn() {
        return sharedPreferences.getString(KEY_USUARIO, null) != null;
    }

    public boolean saveLoggedUser(Usuario usuario) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_USUARIO, new Gson().toJson(usuario));
        editor.apply();
        return true;
    }

    public boolean deleteLoggedUser() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(KEY_USUARIO);
        editor.apply();
        return true;
    }
}
