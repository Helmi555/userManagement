package com.university.forum.usermanagement.ClassGroupManagement.Services.Impl;

import com.university.forum.usermanagement.ClassGroupManagement.Repositories.SpecialityRepository;
import com.university.forum.usermanagement.ClassGroupManagement.Services.SpecialityService;

public class SpecialityServiceImpl implements SpecialityService {


    private final SpecialityRepository specialityRepository;

    public SpecialityServiceImpl(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }
}
