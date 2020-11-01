package Escuela;

public class Escuela {
  public static void main(String[] args) {
    Alumno alumno = new Alumno();

    alumno.setMatricula(12);

    alumno.caminar();

    alumno.saltar();

    alumno.setgrupo(2102);

    System.out.println(alumno.getMatricula());

    System.out.println(alumno.getgrupo());
  }
}
