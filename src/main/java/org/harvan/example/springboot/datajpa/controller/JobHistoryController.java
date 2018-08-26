/*
 * Copyright 2018-2018 the original author or authors.
 */

package org.harvan.example.springboot.datajpa.controller;

import org.harvan.example.springboot.datajpa.model.JobHistoryDto;
import org.harvan.example.springboot.datajpa.model.JobHistoryRequest;
import org.harvan.example.springboot.datajpa.service.JobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Harvan Irsyadi
 * @version 1.0.0
 * @since 1.0.0 (15 Jul 2018)
 */
@RestController
@RequestMapping("/jobhistory")
public class JobHistoryController {
    private JobHistoryService jobHistoryService;

    @Autowired
    public void setJobHistoryService(JobHistoryService jobHistoryService) {
        this.jobHistoryService = jobHistoryService;
    }

    @GetMapping("/{jobHistoryId}")
    public JobHistoryDto getByHistoryId(@PathVariable Long jobHistoryId) {
        return jobHistoryService.findByJobHistoryId(jobHistoryId);
    }

    @PostMapping("/")
    public JobHistoryDto create(@RequestBody JobHistoryRequest jobHistoryRequest) {
        return jobHistoryService.create(jobHistoryRequest);
    }

    @PutMapping("/")
    public JobHistoryDto update(@RequestBody JobHistoryRequest jobHistoryRequest) {
        return jobHistoryService.update(jobHistoryRequest);
    }

    @GetMapping
    public List<JobHistoryDto> findAll() {
        return jobHistoryService.findAll();
    }
}