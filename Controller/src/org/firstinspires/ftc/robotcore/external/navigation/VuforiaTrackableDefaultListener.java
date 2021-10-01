package org.firstinspires.ftc.robotcore.external.navigation;

import org.firstinspires.ftc.robotcore.external.matrices.OpenGLMatrix;

public class VuforiaTrackableDefaultListener {
    public OpenGLMatrix getRobotLocation() {
        return OpenGLMatrix.identityMatrix();
    }

    public void setPhoneInformation(OpenGLMatrix phoneLocationOnRobot, VuforiaLocalizer.CameraDirection cameraDir) {
    }

    public boolean isVisible() {
        return false;
    }

    public OpenGLMatrix getPose() {
        return OpenGLMatrix.identityMatrix();
    }
}
