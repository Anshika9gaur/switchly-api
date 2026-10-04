package com.switchly.api.repository;

import com.switchly.api.model.Project;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryProjectRepository implements ProjectRepository{
    private final Map<UUID,Project> store= new ConcurrentHashMap<>();
    @Override
    public Project save(Project project){
        store.put(project.getProjId(), project);
        return project;
    }
    @Override
    public Optional<Project> findById(UUID id){
        return Optional.ofNullable(store.get(id));
    }
    @Override
    public List<Project> findByOrgId(UUID id){
        return store.values().stream()
                .filter(project->project.getOrgId().equals(id))
                .toList();
    }
}
