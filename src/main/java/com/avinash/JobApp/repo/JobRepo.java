package com.avinash.JobApp.repo;

import com.avinash.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost (1, "java Developer", "Must have experience in core java", 2, List.of("HTML", "CSS", "JavaScript", "React", "Java")),
            new JobPost (2, "React Developer", "Must have experience in React Js", 2, List.of("HTML", "CSS", "JavaScript", "React"))


    ));

    public List<JobPost> getAllJobs(){
        return  jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
    }
}
