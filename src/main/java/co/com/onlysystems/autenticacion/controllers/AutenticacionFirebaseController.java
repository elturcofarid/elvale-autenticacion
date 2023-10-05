package co.com.onlysystems.autenticacion.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class AutenticacionFirebaseController {

    //private static Logger logger = LoggerFactory.getLogger(ServicioController.class);

    @RequestMapping(value = "crearUsuario")
    public String getServicio(){
        log.trace("Log level: TRACE");
        log.info("Log level: INFO");
        log.debug("Log level: DEBUG");
        log.error("Log level: ERROR");
        log.warn("Log level: WARN");
        return "estamos en el controlador";
    }
}
