package Poli;
import java.util.*;
public class EjecutarEmpleado {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        String nomEmp, depto, puesto,entradaChar;
        int hrstra,tipoEmp;
        float cuoHr,sdoMen;
        char desea;
        System.out.println("\n Calcular sueldo de varios empleados");
        do {
            System.out.println("Tipo empleados");
            System.out.println("----------------");
            System.out.println("1. empleado por horas");
            System.out.println("2. empleado asalariado");
            System.out.print("ingrese tipo: ");
            tipoEmp = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Ingrese nombre: ");
            nomEmp = teclado.nextLine();

            System.out.print("Ingrese departamento: ");
            depto = teclado.nextLine();

            System.out.print("Ingrese puesto: ");
            puesto = teclado.nextLine();

            if (tipoEmp == 1) {
                EmpleadoPorHoras2 objEmpleado = new EmpleadoPorHoras2();
                System.out.print("Ingrese horas trabajadas: ");
                hrstra = teclado.nextInt();

                System.out.print("Ingrese cuota por hora: ");
                cuoHr = teclado.nextInt();

                objEmpleado.establecerNombreEmp(nomEmp);
                objEmpleado.establecerDeotoEmp(depto);
                objEmpleado.establecerHorasTrab(hrstra);
                objEmpleado.establecerPuestoEmp(puesto);
                objEmpleado.establecerCuotaHora(cuoHr);

                objEmpleado.calcularSueldoQna();

                System.out.println("Resultados:");
                System.out.println("nombre: " + objEmpleado.obtenerNombreEmp());
                System.out.println("departamento: " + objEmpleado.obtenerDeptoEmp());
                System.out.println("Puesto: " + objEmpleado.obtenerPuestoEmp());
                System.out.println("Sueldo: " + objEmpleado.obtenerSueldoQna());

            } else {
                Empleado1 objEmpleado = new Empleado1();
                System.out.print("Ingrese sueldo mensual: ");
                sdoMen = teclado.nextInt();

                objEmpleado.establecerNombreEmp(nomEmp);
                objEmpleado.establecerDeotoEmp(depto);
                objEmpleado.establecerPuestoEmp(puesto);
                objEmpleado.establecerSueldoMensual1(sdoMen);

                objEmpleado.calcularSueldoQna();

                System.out.println("Resultados");
                System.out.println("nombre: " + objEmpleado.obtenerNombreEmp());
                System.out.println("departamento: " + objEmpleado.obtenerDeptoEmp());
                System.out.println("Puesto: " + objEmpleado.obtenerPuestoEmp());
                System.out.println("Sueldo: " + objEmpleado.obtenerSueldoQna());
            }
            System.out.println("\n Desea seguir (S/N)");
            entradaChar = teclado.next();
            desea = entradaChar.charAt(0);
            teclado.nextLine();
        } while (desea=='S');
    }
}
