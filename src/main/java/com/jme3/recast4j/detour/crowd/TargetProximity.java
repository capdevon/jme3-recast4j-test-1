package com.jme3.recast4j.detour.crowd;

import com.jme3.math.Vector3f;
import org.recast4j.detour.crowd.CrowdAgent;

/**
 * 
 * @author capdevon
 */
public class TargetProximity implements Proximity {

    protected float distanceThreshold;

    /**
     * Constructor.
     * 
     * @param distanceThreshold
     */
    public TargetProximity(float distanceThreshold) {
        this.distanceThreshold = distanceThreshold;
    }

    @Override
    public boolean isInTargetProximity(CrowdAgent agent, Vector3f agentPos, Vector3f targetPos) {
        return targetPos.distanceSquared(agentPos) < distanceThreshold * distanceThreshold;
    }

    public float getDistanceThreshold() {
        return distanceThreshold;
    }

    public void setDistanceThreshold(float distanceThreshold) {
        this.distanceThreshold = distanceThreshold;
    }

}
