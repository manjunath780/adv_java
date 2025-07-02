//package com.demo.employeeapp;
//
//import com.demo.employeeapp.dto.EmployeeDto;
//import com.demo.employeeapp.repo.AllEmployeeRepo;
//import com.demo.employeeapp.repo.impl.AllEmployeeRepoImpl;
//import com.demo.employeeapp.service.EmployeeService;
//import com.demo.employeeapp.service.impl.EmpServiceImpl;
//
//
//
//
//public class EmployeeRunner {
//    public static void main(String[] args) {
//        //Scanner in = new Scanner(System.in);
//       // System.out.println("enter id");
//       // int id = in.nextInt();
//
//     EmployeeDto employeeDto =  new EmployeeDto();
//     employeeDto.setEmployeeName("Jackii");
//     employeeDto.setSalary("76957");
//
//       EmployeeService employeeService = new EmpServiceImpl();
//       //employeeService.validateEmployee(employeeDto);
//       //employeeService.updateAccountTypeById(3,employeeDto.getSalary());
//        // employeeService.fetchAccountById(1);
//
//
//
//       AllEmployeeRepo employeeRepo = new AllEmployeeRepoImpl();
//       EmployeeDto[] allEmployees = employeeRepo.fetchAllEmployee();
//
//        for(EmployeeDto employeeDto1:allEmployees){
//            System.out.println(employeeDto1);
//        }
//
//    }
//}
