package com.university.forum.usermanagement.AdminManagement.Controllers;

import com.university.forum.usermanagement.ClassGroupManagement.Dtos.Request.DepartmentRequestDto;
import com.university.forum.usermanagement.ClassGroupManagement.Dtos.Response.DepartmentResponseDto;
import com.university.forum.usermanagement.ClassGroupManagement.Services.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usermanagement/admin/department/")
public class DepartmentController {

    private final DepartmentService departementService;

    public DepartmentController(DepartmentService departementService) {
        this.departementService = departementService;
    }

    @Operation(description = "create a new department")
    @PostMapping("createDepartment")
    public ResponseEntity<?> createDepartement(@Valid @RequestBody DepartmentRequestDto departementRequestDto) {

        System.out.println("dep received : "+departementRequestDto.getReference());
        DepartmentResponseDto departmentResponseDto=departementService.createDepartment(departementRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentResponseDto);
    }

}
