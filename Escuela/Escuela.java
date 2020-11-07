package Escuela;

public class Escuela {
  public static void main(String[] args) {
    Alumno alumno = new Alumno();

    alumno.setMatricula(12);

    alumno.caminar();

    alumno.saltar();

    alumno.setGrupo(2102);

    System.out.println(alumno.getMatricula());
    alumno.setPromedio(10);
    System.out.println(alumno.getPromedio());
    System.out.println(alumno.getGrupo());
  }
}
