package com.Api.wspagosqr.Services;

import com.Api.wspagosqr.Models.Notificaciones;

import java.util.List;

public interface NotificacionesServices {

    List<Notificaciones> GetNotificaciones();
    String DeleteNotificaciones(Long id);
    String PostNotificaciones(Notificaciones notificacion);
  String PutNotificaciones(Notificaciones notificacion, Long id);


}
