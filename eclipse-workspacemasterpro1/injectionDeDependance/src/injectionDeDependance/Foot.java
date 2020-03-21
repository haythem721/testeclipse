package injectionDeDependance;

import org.springframework.stereotype.Component;

@Component("foot")
public class Foot implements Coach  {

	
	
	@Override
	public String getCoach() {
		// TODO Auto-generated method stub
		return "entreneur football";
	}

}
