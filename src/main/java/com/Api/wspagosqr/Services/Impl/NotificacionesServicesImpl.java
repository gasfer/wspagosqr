package com.Api.wspagosqr.Services.Impl;

import com.Api.wspagosqr.Models.Notificaciones;
import com.Api.wspagosqr.Repository.NotificacionesRepository;
import com.Api.wspagosqr.Services.NotificacionesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

@Service
public class NotificacionesServicesImpl implements NotificacionesServices {


    @Autowired
    private NotificacionesRepository notificacionesRepository;


    @Override
    public List<Notificaciones> GetNotificaciones() {
        return notificacionesRepository.findAll();
    }

    @Override
    public String DeleteNotificaciones(Long id) {
        notificacionesRepository.deleteById(id);
        return "notificacion eliminado con exito!";
    }

    @Override
    public String PostNotificaciones(Notificaciones notificacion) {

        notificacionesRepository.save(notificacion);
        return "notificacion guardado con exito";
    }

    @Override
    public String PutNotificaciones(Notificaciones notificacion, Long id) {

        Notificaciones notificacionList =  notificacionesRepository.findById(id).get();
        if (notificacion != null){

            notificacionList.setFinalizado(notificacion.isFinalizado());
            notificacionList.setFuente(notificacion.getFuente());
            notificacionList.setEstado(notificacion.getEstado());
            notificacionList.setCodigoSeguimiento(notificacion.getCodigoSeguimiento());
            notificacionList.setFecha(notificacion.getFecha());
            notificacionList.setMensaje(notificacion.getMensaje());
            notificacionList.setDetalle(notificacion.getDetalle());
            return "notificacion actualizado con exito";
        }else{
            return "hubo un error";
        }
    }

  /*  public  boolean consultaPago(){
        try {
            // Realizar la petición
            URL url = new URL("https://api.frankfurter.app/latest");
            HttpURLConnection conexion = (HttpURLConnection)url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.connect();

            // Comprobar si la respuesta es correcta
            int respuesta = conexion.getResponseCode();
            if (respuesta != 200) {
                // Si no es correcta, mostramos mensaje de error
                System.out.println("Ha ocurrido el error " + respuesta + " procesando la petición.");
                return;
            }

            // Si es correcta, mostramos la respuesta
            StringBuilder respuestaStr = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                respuestaStr.append(scanner.nextLine());
            }
            scanner.close();
            System.out.println("Respuesta: ");
            System.out.println(respuestaStr);
        } catch (IOException ex) {
            System.out.println("Error inesperado al procesar la petición: " + ex.getMessage());
        }
    }
    openssl s_client -connect localhost:1433  /dev/null | sed -ne '/-BEGIN CERTIFICATE-/,/-END CERTIFICATE-/p' > sqlserver.crt


    */
}
