package imageSimulationByN25XML

import com.kms.katalon.core.annotation.Keyword
import com.osi.ss.simulator.SimulatorInvoke

public class Simulation {
	@Keyword
	def simulateN25(){
		SimulatorInvoke invove = new SimulatorInvoke();
		SimulatorInvoke.main(null);
		System.out.println("Scan Completed");
	}

	@Keyword
	def simulateFileToGivenScanner(String scnType, String scnModel){
		SimulatorInvoke invove = new SimulatorInvoke();
		SimulatorInvoke.main(null);
		System.out.println("Scan Completed");
	}
}
