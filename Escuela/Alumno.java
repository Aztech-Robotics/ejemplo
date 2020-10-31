package Escuela;

public class Alumno extends Persona {
  private int matricula;
  public double promedio;
  public int grupo;

  public void estudiar() {
    System.out.println("Estoy estudiando...");
  }

  // Set y Get: encapsulación de la Matricula
  public void setMatricula(int nuevaMatricula) {
    this.matricula = nuevaMatricula;
  }

  public int getMatricula() {
    return this.matricula;
  }
}
