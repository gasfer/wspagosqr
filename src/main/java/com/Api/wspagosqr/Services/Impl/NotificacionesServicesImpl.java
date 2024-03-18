package com.Api.wspagosqr.Services.Impl;

import com.Api.wspagosqr.Models.Notificaciones;
import com.Api.wspagosqr.Repository.NotificacionesRepository;
import com.Api.wspagosqr.Services.NotificacionesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
