package com.frobertbs.microservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.frobertbs.microservice.DTO.Job;
import com.frobertbs.microservice.service.JobService;

@Service
public class JobServiceImpl implements JobService {

    private static List<Job> jobList = new ArrayList<>();
    private static Long nextId = 1L;

    @Override
    public List<Job> getAllJobs() {
        return jobList;
    }

    @Override
    public Job getJobById(Long id) {
        return jobList.stream().filter(job -> job.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Job createJob(Job job) {
        job.setId(nextId++);
        jobList.add(job);
        return job;
    }
}
