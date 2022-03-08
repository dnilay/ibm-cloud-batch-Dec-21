import { Component, OnInit } from '@angular/core';
import {Employee} from "../employee";
import {EmployeeService} from "../employee.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
  employee: Employee = new Employee();
  submitted = false;
  constructor(private employeeService: EmployeeService,
              private router: Router) { }

  ngOnInit(): void {
  }
  save() {
    this.employeeService
      .createEmployee(this.employee).subscribe(data => {
        this.employee = new Employee();
        this.gotoList();
      },
      error => console.log(error));
  }
  onSubmit() {
    this.submitted = true;
    this.save();
  }
  private gotoList() {
    this.router.navigate(['/employees']);
  }
}
