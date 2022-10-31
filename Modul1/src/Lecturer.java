public class Lecturer {


public Lecturer implements Tridharma, Project {

	@Override
	public void doTeaching() {
		System.out.println("Ini algortima dosen mengajar!");
	}

	@Override
	public void doResearch() {
		System.out.println("Ini algoritma dosen riset");
		
	}

	@Override
	public void doCommunitService() {
		System.out.println("Ini algoritma dosen abdimas");
		
	}

	@Override
	public void doInformationTechnologyProject() {
		System.out.println("Ini algoritma dosen projek SI");
	}

	@Override
	public void doInfrastructureProject() {
		System.out.println("Ini algoritma dosen projek infrastruktur");
		
	}
}
