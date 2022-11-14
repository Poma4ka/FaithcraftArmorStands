package com.zloyclop;

import org.bukkit.entity.ArmorStand;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.EulerAngle;

import java.util.List;

public class Stand {

    public static void setPose(ArmorStand stand,Pose pose) {
        stand.setArms(true);
        stand.setLeftArmPose(new EulerAngle(pose.LeftArm[0],pose.LeftArm[1],pose.LeftArm[2]));
        stand.setRightArmPose(new EulerAngle(pose.RightArm[0],pose.RightArm[1],pose.RightArm[2]));
        stand.setLeftLegPose(new EulerAngle(pose.LeftLeg[0],pose.LeftLeg[1],pose.LeftLeg[2]));
        stand.setRightLegPose(new EulerAngle(pose.RightLeg[0],pose.RightLeg[1],pose.RightLeg[2]));
        stand.setHeadPose(new EulerAngle(pose.Head[0],pose.Head[1],pose.Head[2]));
        stand.setBodyPose(new EulerAngle(pose.Body[0],pose.Body[1],pose.Body[2]));
    }

    public static void nextPose(ArmorStand stand) {
        int currentPose = getCurrentPose(stand);
        int newPose = ((currentPose + 1) % Pose.poses.length);
        stand.setMetadata("pose",new FixedMetadataValue(Main.getInstance(),newPose));
        setPose(stand,Pose.poses[newPose]);
    }

    private static int getCurrentPose(ArmorStand stand) {
        if (stand.hasMetadata("pose")) {
            List<MetadataValue> metadata = stand.getMetadata("pose");
            return metadata.get(0).asInt();
        } else {
            stand.setMetadata("pose",new FixedMetadataValue(Main.getInstance(),1));
            return 1;
        }

    }

}
