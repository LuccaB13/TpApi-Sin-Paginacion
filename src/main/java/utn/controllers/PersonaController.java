package utn.controllers;
import utn.entities.Persona;
import utn.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/personas")
public class PersonaController extends BaseControllerimpl<Persona, PersonaServiceImpl> {

}
