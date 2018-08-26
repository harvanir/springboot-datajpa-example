/*
 * Copyright 2018-2018 the original author or authors.
 */

package org.harvan.example.springboot.datajpa.service;

import org.harvan.example.springboot.datajpa.model.JobHistory;
import org.harvan.example.springboot.datajpa.model.JobHistoryDto;
import org.harvan.example.springboot.datajpa.model.JobHistoryRequest;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Harvan Irsyadi
 * @version 1.0.0
 * @since 1.0.0 (15 Jul 2018)
 */
@Mapper
public interface BeanMapper {
    JobHistoryDto map(JobHistory jobHistory);

    JobHistory map(JobHistoryRequest jobHistoryRequest);

    List<JobHistoryDto> map(Iterable<JobHistory> jobHistories);
}