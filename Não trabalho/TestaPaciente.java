//Nome: André Mendes Pinto
public class TestaPaciente {
    public static void main(String[] args) {
        Paciente pacienteA = new Paciente("André", 'M', 1.80, 114, 18);
        Paciente pacienteC = new Paciente("Helena", 'F', 1.60, 50, 18);
        Paciente pacienteB = new Paciente("Luli", 'F');
        
        //verificar o funcionamneto e a concatenização do paraString
        System.out.println(pacienteA.paraString());
        System.out.println(pacienteB.paraString());
        System.out.println(pacienteC.paraString());
        
        
        //validação para o sexo
        pacienteA.setsexo('G');
        pacienteB.setsexo('G');
        pacienteC.setsexo('G');
        System.out.println((pacienteA.getsexo() == 'M') == true);
        System.out.println((pacienteA.getsexo() == 'G') == false);
        System.out.println((pacienteB.getsexo() == 'F') == true);
        System.out.println((pacienteB.getsexo() == 'G') == false);
        System.out.println((pacienteC.getsexo() == 'F') == true);
        System.out.println((pacienteC.getsexo() == 'G') == false);
        
        
        //validação dos metados engorda, getpeso e emagrece
        pacienteA.engorda(130);
        System.out.println(pacienteA.getpeso() == 244);
        pacienteA.emagrece(44);
        System.out.println(pacienteA.getpeso() == 200);
        pacienteA.engorda(-130);
        System.out.println(pacienteA.getpeso() == 200);
        pacienteA.emagrece(-44);
        System.out.println(pacienteA.getpeso() == 200);

        //validação getImc
        System.out.println(pacienteA.getImc() == 61.72839506172839);

        //validação getPercentualGordura
        System.out.println(pacienteA.getPercentualGordura() == 72.81407407407406);

        //validação getImcStatus
        
        System.out.println(pacienteA.getImcStatus() == "Obesidade");
        pacienteA.emagrece(130);
        System.out.println(pacienteA.getImcStatus() == "Regular");

        System.out.println(pacienteA.paraString());
        System.out.println(pacienteB.paraString());
        System.out.println(pacienteC.paraString());
        
    }
}