package com.ediel.notas.utils;

/**
 * Constantes
 */
public class Constantes {

    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta característica.
     */
    //private static final String PUERTO_HOST = ":63343";

    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "http://localhost";

    /**
     * URLs del Web Service
     */
    public static final String GET_URL = IP  + "/Notas/index.php/NotasController/all";
    public static final String INSERT_URL = IP  + "/Crunch%20Expenses/web/insertar_gasto.php";

    /**
     * Campos de las respuestas Json
     */
    public static final String ID_NOTA = "idNota";
    public static final String TEXTO = "texto";
    public static final String CREATED_AT = "created_at";
    public static final String LAST_MODIFICATION = "last_modification";
    public static final String NOTAS = "notas";
    public static final String MENSAJE = "mensaje";
    public static final String ESTADO = "estado";

    /**
     * Códigos del campo {@link ESTADO}
     */
    public static final String SUCCESS = "1";
    public static final String FAILED = "2";

    /**
     * Tipo de cuenta para la sincronización
     */
    public static final String ACCOUNT_TYPE = "com.ediel.notas.account";


}
