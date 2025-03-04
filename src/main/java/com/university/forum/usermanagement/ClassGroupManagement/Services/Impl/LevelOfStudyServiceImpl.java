package com.university.forum.usermanagement.ClassGroupManagement.Services.Impl;

import com.university.forum.usermanagement.ClassGroupManagement.Repositories.LevelOfStudyRepository;
import com.university.forum.usermanagement.ClassGroupManagement.Services.LevelOfStudyService;

public class LevelOfStudyServiceImpl implements LevelOfStudyService {

    private final LevelOfStudyRepository levelOfStudyRepository;

    public LevelOfStudyServiceImpl(LevelOfStudyRepository levelOfStudyRepository) {
        this.levelOfStudyRepository = levelOfStudyRepository;
    }
}
