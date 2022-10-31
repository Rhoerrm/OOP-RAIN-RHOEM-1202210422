import javax.swing.event.ListSelectionEvent;

public class AcademicApp {
    public static void main(String[]args){
        Tridharma dosen = new Lecturer();
        Tridharma mahasiswa = new Student();
        Project dosen1 = new Lecturer();
        ExtraCampus mahasiswa2 = new Student();

        dosen.doTeaching();
        dosen.doResearch();
        dosen.doCommunityService();

        mahasiswa.doTeaching();
        mahasiswa.doResearch();
        mahasiswa.doCommunityService();

        dosen1.doInformationTechnologyProject();
        dosen1.doInfrastructureProject();

        mahasiswa2.joinCompetition();
        mahasiswa2.joinOlympic();
    }
}
