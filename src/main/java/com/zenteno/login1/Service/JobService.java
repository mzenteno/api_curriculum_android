package com.zenteno.login1.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zenteno.login1.Entity.Job;
import com.zenteno.login1.Repository.JobRepository;


@Service
public class JobService {
    @Autowired
    JobRepository jobRepository;

    public Job createJob(Job _job) {
        return jobRepository.save(_job);
    }

    public Job updateJob(Integer _id, Job _job) {
        Job oJob = jobRepository.getReferenceById(_id);
        oJob.setDescription( _job.getDescription());
        
        return jobRepository.save(oJob);
    }

    public void deleteJob(Integer _id) {
        jobRepository.deleteById(_id);
    }

    public List<Job> getAllJob() {
        return jobRepository.findAll();
    }

    public Job getJobxId(Integer _id) {
        Optional<Job> jobOptional = jobRepository.findById(_id);

         if (jobOptional.isPresent()) {
            return jobOptional.get(); 
        } else {
            return null;
        }
    }

}