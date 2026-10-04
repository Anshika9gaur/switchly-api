package com.switchly.api.model;

import java.util.UUID;

public class Project {
    private final UUID projId;
    private final UUID orgId;
    private final String name;
    public Project(UUID projId,UUID orgId,String name){
        this.projId=projId;
        this.orgId=orgId;
        this.name=name;
    }
    public UUID getProjId(){ return projId;}
    public UUID getOrgId(){ return orgId;}
    public String getName(){ return name;}
}
