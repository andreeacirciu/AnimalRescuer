package org.example;

public class RecreationalActivities {
    private String activityName;
    private ToolsForActivities toolsForActivities;


    public RecreationalActivities(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public ToolsForActivities getToolsForActivities() {
        return toolsForActivities;
    }

    public void setToolsForActivities(ToolsForActivities toolsForActivities) {
        this.toolsForActivities = toolsForActivities;
    }


}
