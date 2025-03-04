package com.university.forum.usermanagement.ClassGroupManagement.Services.Impl;

import com.university.forum.usermanagement.ClassGroupManagement.Services.ClassGroupService;

public class ClassGroupServiceImpl implements ClassGroupService {

    private final ClassGroupService classGroupService;

    public ClassGroupServiceImpl(ClassGroupService classGroupService) {
        this.classGroupService = classGroupService;
    }
}
