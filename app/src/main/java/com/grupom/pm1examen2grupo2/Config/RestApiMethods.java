package com.grupom.pm1examen2grupo2.Config;

public class RestApiMethods {
    private static final String ipaddress = "elkinwebhn.com";
    public static final String StringHttp = "https://";
    //EndPoint Urls
    private static final String GetEmple = "/API_Examen/listacontactos.php";
    private static final String GetBuscar = "/API_Examen/listasinglecontacto.php?nombre=";
    private static final String setUpdate = "/API_Examen/actualizarcontacto.php";
    private static final String CreateUsuario = "/API_Examen/crearcontacto.php";

    //metodo get
    public static final String EndPointGetContact = StringHttp + ipaddress + GetEmple;
    public static final String EndPointGetBuscarContact = StringHttp + ipaddress + GetBuscar;
    public static final String EndPointSetUpdateContact = StringHttp + ipaddress + setUpdate;
    public static final String EndPointCreateUsuario = StringHttp + ipaddress + CreateUsuario;
}
