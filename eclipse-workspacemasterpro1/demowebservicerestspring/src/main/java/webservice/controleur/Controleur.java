package webservice.controleur;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webservice.entity.Personne;

@RestController
@RequestMapping("/api")
public class Controleur {
	List<Personne> liste=new ArrayList<>();
	@PostConstruct
	public void charger()
	{
		liste.add(new Personne(1, "saoudi"));
		liste.add(new Personne(2, "mtar"));
		liste.add(new Personne(3, "hammouda"));
		liste.add(new Personne(4, "ben selem"));
	}
	@GetMapping("/index")
	public String get()
	{
		return "hello";
	}
	@GetMapping("/personnes")
	public List<Personne> getListes()
	{
		return liste;
	}
	
	@GetMapping("/personnes/{id}")
	public Personne getPersonne(@PathVariable("id")int id)
	{ for(Personne p:liste)
		if(p.getId()==id)
		return p;
	return null;
	}

}
