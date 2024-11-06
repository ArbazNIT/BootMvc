package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Robat {
	
	@Autowired
	private IChip chip;
	
	public void doWork()
	{
					boolean process = chip.process();
					
					if(process)
					{
						System.out.println("Robat is working.....");
					}else
						System.out.println("Robot is not working......");
		
	}
	
	
	

}
