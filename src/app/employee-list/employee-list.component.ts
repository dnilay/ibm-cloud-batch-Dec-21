import { Component, OnInit } from '@angular/core';
import {Employee} from "../employee";
import {Observable} from "rxjs";
import {EmployeeService} from "../employee.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Observable<Employee[]> | undefined;
  constructor(private employeeService: EmployeeService,private router: Router) {}

  ngOnInit(): void {

    this.reloadData();
  }

  private reloadData() {
    this.employees = this.employeeService.getEmployeesList();

  }

  employeeDetails(id: number){
    this.router.navigate(['details', id]);
  }
}
