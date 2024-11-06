package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component("32bit")
public class Chip32Bit implements IChip {

	public Chip32Bit() {
		System.out.println("Chip32Bit.Chip32Bit() constructor");
	}
	
	@Override
	public boolean process() {
		
		System.out.println("32bit chip is processs...");
		
		return true;
	}

}
