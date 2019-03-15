package frc.robot.sensors;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoSink;
import edu.wpi.first.wpilibj.CameraServer;

public class Cameras {
    private UsbCamera firstCam;
    private UsbCamera secondCam;
    private VideoSink server;

    public boolean currentCam;

    public Cameras() {
        CameraServer cs = CameraServer.getInstance();
        firstCam = cs.startAutomaticCapture("cam0", 0);
        secondCam = cs.startAutomaticCapture("cam1", 1);

        firstCam.setResolution(320, 240);
        firstCam.setFPS(5);

        secondCam.setResolution(320, 240);
        secondCam.setFPS(5);

        cs.addCamera(firstCam);
        cs.addCamera(secondCam);

        // server = cs.getServer();
        // server.setSource(firstCam);
    }

}