import { Component, OnInit } from '@angular/core';
import { ApiService } from '../services/api.service';
import { Employee } from '../models/employee.model';
import { Department } from '../models/department.model';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  employees: Employee[] = [];
  departments: Department[] = [];

  newEmployee: Employee = { name: '', email: '', salary: 0, departmentId: 0 };

  constructor(private apiService: ApiService) {}

  ngOnInit() {
    this.fetchData();
  }

  fetchData() {
    this.apiService.getEmployees().subscribe(data => this.employees = data);
    this.apiService.getDepartments().subscribe(data => this.departments = data);
  }

  addEmployee() {
    this.apiService.addEmployee(this.newEmployee).subscribe(() => {
      this.fetchData();
      this.newEmployee = { name: '', email: '', salary: 0, departmentId: 0 };
    });
  }

  deleteEmployee(id: number) {
    this.apiService.deleteEmployee(id).subscribe(() => this.fetchData());
  }
}
