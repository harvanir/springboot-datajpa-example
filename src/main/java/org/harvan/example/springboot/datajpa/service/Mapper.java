/*
 * Copyright 2018-2018 the original author or authors.
 */

package org.harvan.example.springboot.datajpa.service;

import org.mapstruct.factory.Mappers;

/**
 * @author Harvan Irsyadi
 * @version 1.0.0
 * @since 1.0.0 (27 Aug 2018)
 */
public class Mapper {
    private Mapper() {
        // hide
    }

    public static final BeanMapper INSTANCE = Mappers.getMapper(BeanMapper.class);
}