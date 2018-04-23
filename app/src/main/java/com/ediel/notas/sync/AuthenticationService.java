package com.ediel.notas.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by dev2 on 23/04/2018.
 */

public class AuthenticationService extends Service {

    // Instancia del autenticador
    private ExpenseAuthenticator autenticador;

    @Override
    public void onCreate() {
        // Nueva instancia del autenticador
        autenticador = new ExpenseAuthenticator(this);
    }

    /*
     * Ligando el servicio al framework de Android
     */
    @Override
    public IBinder onBind(Intent intent) {
        return autenticador.getIBinder();
    }
}
