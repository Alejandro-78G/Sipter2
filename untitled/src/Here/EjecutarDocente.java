package Here;
import java.util.*;
public class EjecutarDocente {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String entradaChar;
        int tipoEmp;
        char desea;
        do{
            System.out.println("Tipos de empleados");
            System.out.println("1. Empleado por hora");
            System.out.println("2. Empleado asalariado");
            System.out.print("Ingrese el tipo: ");
            tipoEmp=teclado.nextInt();
            teclado.nextLine();
            if (tipoEmp==1) {
                DocenteHC dHC = new DocenteHC();
                System.out.println("Ingrese datos del docente HC");
                System.out.print("Nombre: ");
                dHC.setNombreDoc(teclado.nextLine());
                System.out.print("Facultad: ");
                dHC.setFacultadDoc(teclado.nextLine());
                System.out.print("CADI: ");
                dHC.setCadiDoc(teclado.nextLine());
                System.out.print("Horas trabajadas: ");
                dHC.setHorasTrab(teclado.nextInt());
                System.out.print("Valor hora: ");
                dHC.setValorHora(teclado.nextInt());
                dHC.calcularSueldo();

                System.out.println("Resultados");
                System.out.println("Nombre: " + dHC.getNombreDoc());
                System.out.println("Facultad: " + dHC.getFacultadDoc());
                System.out.println("Cadi: " + dHC.getCadiDoc());
                System.out.println("Horas trabajadas: " + dHC.getHorasTrab());
                System.out.println("Valor por hora: " + dHC.getValorHora());
                System.out.println("Sueldo mensual: " + dHC.getSueldoMesHoras());
            }else{
                DocenteTCO dTCO=new DocenteTCO();
                System.out.println("Ingrese datos del docente HC");
                System.out.print("Nombre: ");
                dTCO.setNombreDoc(teclado.nextLine());
                System.out.print("Facultad: ");
                dTCO.setFacultadDoc(teclado.nextLine());
                System.out.print("CADI: ");
                dTCO.setCadiDoc(teclado.nextLine());
                System.out.print("Sueldo basico: ");
                dTCO.setSueldoBasico(teclado.nextInt());
                System.out.print("Cantidad trabajos de grado: ");
                dTCO.setCanTrabGrado(teclado.nextInt());
                System.out.print("Valor hora asesoria: ");
                dTCO.setValorHoraAsesor(teclado.nextInt());
                dTCO.calcularSueldo();
                System.out.println("Resultados");
                System.out.println("Nombre: " + dTCO.getNombreDoc());
                System.out.println("Facultad: " + dTCO.getFacultadDoc());
                System.out.println("Cadi: " + dTCO.getCadiDoc());
                System.out.println("Sueldo basico: " + dTCO.getSueldoBasico());
                System.out.println("Trabajos de grado: " + dTCO.getCanTrabGrado());
                System.out.println("Valor hora asesoria: " + dTCO.getValorHoraAsesor());
                System.out.println("Sueldo mensual: "+dTCO.getSueldoMensual());
            }
            System.out.println("\n Desea seguir (S/N)");
            entradaChar = teclado.next();
            desea = entradaChar.charAt(0);
            teclado.nextLine();
        } while (desea=='S');
    }
}