package org.firstinspires.ftc.teamcode.newbot.teleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;



@TeleOp
public class servoTest extends LinearOpMode {
    public Servo baseLeft = null;
    public Servo baseRight = null;
    public Servo elbow = null;
    public Servo base = null;





    public void runOpMode() {
        baseRight = hardwareMap.get(Servo.class, "baseRight");//port 1
        baseLeft = hardwareMap.get(Servo.class, "baseLeft");//port 0
        elbow = hardwareMap.get(Servo.class, "elbow");//port 2
        baseRight.setDirection(Servo.Direction.REVERSE);

        baseRight = hardwareMap.get(Servo.class, "baseRight");
        baseLeft = hardwareMap.get(Servo.class, "baseLeft");
        elbow = hardwareMap.get(Servo.class, "elbow");
        base = hardwareMap.get(Servo.class, "base");
        baseRight.setDirection(Servo.Direction.REVERSE);
        elbow.setDirection(Servo.Direction.REVERSE);


        waitForStart();

        while (opModeIsActive()){
            double leftHome = baseLeft.getPosition();
            double rightHome= baseRight.getPosition();
            double elbowHome = elbow.getPosition();

            double leftHome1 = baseLeft.getPosition();
            double rightHome1= baseRight.getPosition();
            double elbowHome1 = elbow.getPosition();


            if (gamepad1.b) {
                baseLeft.setPosition(leftHome);
                baseRight.setPosition(rightHome);
            }
            //open
            if (gamepad1.x) {
                leftHome += 0.5;
                rightHome += 0.5;
                baseRight.setPosition(rightHome);
                baseLeft.setPosition(leftHome);
            }

            if(gamepad1.a){
                elbow.setPosition(elbowHome);
            }

            if(gamepad1.y){
                elbowHome += 0.8;
                elbow.setPosition(elbowHome);
            }



        }



    }
}



