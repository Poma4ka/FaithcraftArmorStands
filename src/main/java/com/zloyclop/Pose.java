package com.zloyclop;

import javax.annotation.Nullable;

public class Pose {

    static public Pose[] poses = new Pose[]{
            new Pose(
                    new double[]{351, 0, 340},
                    new double[]{351, 0, 20},
                    new double[]{0, 0, 0},
                    new double[]{0, 0, 0},
                    new double[]{0, 0, 0},
                    new double[]{0, 0, 0}
            ),
            new Pose(
                    new double[]{330, 18, 0},
                    new double[]{303, 338, 0},
                    new double[]{0, 0, 0},
                    new double[]{0, 0, 0},
                    new double[]{16, 0, 0},
                    new double[]{0, 0, 0}
            ),
            new Pose(
                    new double[]{16, 18, 0},
                    new double[]{303, 11, 12},
                    new double[]{0, 0, 0},
                    new double[]{0, 0, 0},
                    new double[]{0, 0, 0},
                    new double[]{0, 0, 0}
            ),
            new Pose(
                    new double[]{16, 18, 0},
                    new double[]{241, 31, 12},
                    new double[]{10, 352, 0},
                    new double[]{351, 11, 0},
                    new double[]{357, 0, 0},
                    new double[]{0, 0, 0}
            ),
            new Pose(
                    new double[]{241, 38, 0},
                    new double[]{241, 318, 0},
                    new double[]{10, 352, 0},
                    new double[]{351, 11, 0},
                    new double[]{357, 0, 0},
                    new double[]{0, 0, 0}
            ),
            new Pose(
                    new double[]{241, 318, 0},
                    new double[]{241, 38, 0},
                    new double[]{10, 352, 0},
                    new double[]{351, 11, 0},
                    new double[]{357, 0, 0},
                    new double[]{0, 0, 0}
            ),
            new Pose(
                    new double[]{16, 0, 0},
                    new double[]{296, 318, 0},
                    new double[]{0, 0, 0},
                    new double[]{0, 0, 0},
                    new double[]{0, 0, 0},
                    new double[]{0, 0, 0}
            ),
            new Pose(
                    new double[]{16, 0, 0},
                    new double[]{248, 38, 0},
                    new double[]{38, 353, 0},
                    new double[]{3, 243, 0},
                    new double[]{0, 0, 0},
                    new double[]{0, 0, 0}
            ),
            new Pose(
                    new double[]{180, 86, 60},
                    new double[]{282, 331, 0},
                    new double[]{38, 353, 0},
                    new double[]{10, 11, 6},
                    new double[]{16, 11, 0},
                    new double[]{0, 0, 0}
            ),
            new Pose(
                    new double[]{255, 4, 360},
                    new double[]{255, 352, 0},
                    new double[]{16, 0, 0},
                    new double[]{330, 0, 0},
                    new double[]{351, 345, 0},
                    new double[]{0, 0, 0}
            ),
            new Pose(
                    new double[]{173, 52, 53},
                    new double[]{201, 113, 319},
                    new double[]{255, 45, 0},
                    new double[]{3, 21, 0},
                    new double[]{357, 106, 12},
                    new double[]{4, 6, 0}
            ),
            new Pose(
                    new double[]{160, 120, 53},
                    new double[]{201, 0, 299},
                    new double[]{351, 31, 6},
                    new double[]{228, 331, 46},
                    new double[]{357, 79, 360},
                    new double[]{0, 0, 353}
            )
    };

    public double[] LeftArm = new double[]{0, 0, 0};
    public double[] RightArm = new double[]{0, 0, 0};
    public double[] LeftLeg = new double[]{0, 0, 0};
    public double[] RightLeg = new double[]{0, 0, 0};
    public double[] Head = new double[]{0, 0, 0};
    public double[] Body = new double[]{0, 0, 0};

    public Pose(
            @Nullable double[] LeftArm,
            @Nullable double[] RightArm,
            @Nullable double[] LeftLeg,
            @Nullable double[] RightLeg,
            @Nullable double[] Head,
            @Nullable double[] Body
    ) {
        if (LeftArm != null)
            this.LeftArm = new double[]{Math.toRadians(LeftArm[0]), Math.toRadians(LeftArm[1]), Math.toRadians(LeftArm[2])};
        if (RightArm != null)
            this.RightArm = new double[]{Math.toRadians(RightArm[0]), Math.toRadians(RightArm[1]), Math.toRadians(RightArm[2])};
        if (LeftLeg != null)
            this.LeftLeg = new double[]{Math.toRadians(LeftLeg[0]), Math.toRadians(LeftLeg[1]), Math.toRadians(LeftLeg[2])};
        if (RightLeg != null)
            this.RightLeg = new double[]{Math.toRadians(RightLeg[0]), Math.toRadians(RightLeg[1]), Math.toRadians(RightLeg[2])};
        if (Head != null)
            this.Head = new double[]{Math.toRadians(Head[0]), Math.toRadians(Head[1]), Math.toRadians(Head[2])};
        if (Body != null)
            this.Body = new double[]{Math.toRadians(Body[0]), Math.toRadians(Body[1]), Math.toRadians(Body[2])};
    }

}
