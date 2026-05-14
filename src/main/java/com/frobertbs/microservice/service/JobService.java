package com.frobertbs.microservice.service;

import java.util.List;
import com.frobertbs.microservice.DTO.Job;

public interface JobService {
    List<Job> getAllJobs();

    Job getJobById(Long id);

    Job createJob(Job job);
}
