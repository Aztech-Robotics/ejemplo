package Robot;

import sun.tools.tree.DoStatement;

@TeleOp
public class Robot extends LinearOpMode {
  // Declarar los atributos del robot
  DcMotor driveMotorLeft;
  DcMotor driveMotorRight;

  @Override // el método runOpMode es el punto de entrada para ejecutar el código
  public void runOpMode() {
    // Esperar a que se presione el botón de start en la DriverStation
    waitForStart();

    // Mientras esté activo el programa se va a ejecutar el ciclo while
    while (opModeIsActive()) {
      drive();
    }
  }

  // Método para la tracción
  public void drive() {
    // Hacer un mapero de Hardware para ideentificar los puertos de los motores
    driveMotorLeft = hardwareMap.get(DcMotor.class, "motor0");
    driveMotorRight = hardwareMap.get(DcMotor.class, "motor1");

    // Obtener los valores del stick
    double drive_y = this.gamepad1.left_stick_y;
    double turn_x = this.gamepad1.left_stick_x;

    // Sumar las componentes en x, y para generar el libre movimiento del robot
    double leftPower = Range.clip(turn_x + drive_y, -1.0, 1.0);
    double rightPower = Range.clip(turn_x - drive_y, -1.0, 1.0);

    // Dar energía a los motores
    driveMotorLeft.setPower(leftPower);
    driveMotorRight.setPower(rightPower);
  }
}
