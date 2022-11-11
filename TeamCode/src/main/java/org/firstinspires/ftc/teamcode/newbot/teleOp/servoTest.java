package org.firstinspires.ftc.teamcode.newbot.teleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;



@TeleOp
public class servoTest extends LinearOpMode {
    public Servo baseLeft = null;
    public Servo baseRight = null;
    public Servo elbow = null;


    public void runOpMode() {
        baseRight = hardwareMap.get(Servo.class, "baseRight");//port 1
        baseLeft = hardwareMap.get(Servo.class, "baseLeft");//port 0
        elbow = hardwareMap.get(Servo.class, "elbow");//port 2
        baseRight.setDirection(Servo.Direction.REVERSE);

        waitForStart();

        while (opModeIsActive()){
            if (gamepad1.b) {
                baseRight.setPosition(0);
                baseLeft.setPosition(0);
            }
            //open
            if (gamepad1.x) {
                baseRight.setPosition(0.5);
                baseLeft.setPosition(0.5);
            }
            if (gamepad1.a){
                elbow.setPosition(0); //Expand
            }

            if (gamepad1.y){
                elbow.setPosition(0.5); //Fold
            }
        }



    }
}



