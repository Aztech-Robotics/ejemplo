package Robot;

@TeleOp
public class Robot extends LinearOpMode {
  // Declarar los atributos del robot
  DcMotor motor0;
  DcMotor motor1;

  @Override // el método runOpMode es el punto de entrada para ejecutar el código
  public void runOpMode() {
    // Hacer un mapero de Hardware para ideentificar los puertos de los motores
    motor0 = hardwareMap.get(DcMotor.class, "motor0");
    motor1 = hardwareMap.get(DcMotor.class, "motor1");

    // Esperar a que se presione el botón de start en la DriverStation
    waitForStart();

    // Mientras esté activo el programa se va a ejecutar el ciclo while
    while (opModeIsActive()) {
      motor0.setPower(1);
      motor1.setPower(1);
    }
  }
}
