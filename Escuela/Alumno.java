package Escuela;

public class Alumno extends Persona {
  private int matricula;
  private double promedio;
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
  
  // Set y Get: encapsulación del promedio
  public void setPromedio(double nuevoPromedio) {
    this.promedio = nuevoPromedio;
  }

  public double getPromedio() {
    return this.promedio;
  }
}