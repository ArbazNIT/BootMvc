package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("64bit")
@Primary
public class Chip64Bit implements IChip {
	
	public Chip64Bit() {
		System.out.println("Chip64Bit.Chip64Bit() Constructor..");
	}

	@Override
	public boolean process() {
		System.out.println("64bit chip is execute....");
		return true;
	}

}
