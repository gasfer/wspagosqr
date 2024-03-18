package com.Api.wspagosqr.Controllers;

import com.Api.wspagosqr.Models.Notificaciones;
import com.Api.wspagosqr.Repository.NotificacionesRepository;
import com.Api.wspagosqr.Services.NotificacionesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionesControllers {

    @Autowired
    private NotificacionesServices notificacionesServices;

    @PostMapping
    public ResponseEntity<?> PostNotificaciones(Notificaciones notificacion){
        return ResponseEntity.ok(notificacionesServices.PostNotificaciones(notificacion));
    }
    @GetMapping
    public ResponseEntity<List<Notificaciones>> GetNotificaciones(){
        return ResponseEntity.ok(notificacionesServices.GetNotificaciones());
    }
    //http://localhost:8080/2
    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeleteNotificaciones(@PathVariable Long id){
        return ResponseEntity.ok(notificacionesServices.DeleteNotificaciones(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> PutNotificaciones(Notificaciones notificacion,@PathVariable Long id){
        return ResponseEntity.ok(notificacionesServices.PutNotificaciones(notificacion,id));
    }

}
