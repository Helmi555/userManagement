package com.university.forum.usermanagement.ClassGroupManagement.Services.Impl;

import com.university.forum.usermanagement.ClassGroupManagement.Dtos.Request.DepartmentRequestDto;
import com.university.forum.usermanagement.ClassGroupManagement.Dtos.Response.DepartmentResponseDto;
import com.university.forum.usermanagement.ClassGroupManagement.Models.Department;
import com.university.forum.usermanagement.ClassGroupManagement.Repositories.DepartmentRepository;
import com.university.forum.usermanagement.ClassGroupManagement.Services.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;


    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public DepartmentResponseDto createDepartment(DepartmentRequestDto departmentRequestDto) {


        Department department = new Department();
        department.setName(departmentRequestDto.getName());
        department.setReference(departmentRequestDto.getReference());
        department=departmentRepository.save(department);
        System.out.println("dep created : "+department.getReference());

        return convertToDepartmentResponseDto(department);
    }

    private DepartmentResponseDto convertToDepartmentResponseDto(Department department) {
        DepartmentResponseDto dto = new DepartmentResponseDto();
        dto.setId(department.getId());
        dto.setName(department.getName());
        dto.setReference(department.getReference());
        return dto;
    }
}
