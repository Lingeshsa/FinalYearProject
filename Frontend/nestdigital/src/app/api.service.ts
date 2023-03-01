import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }
  addEmployee=(data:any)=>{
    return this.http.post('http://localhost:8080/addEmployee',data)
  }
  viewEmployee=()=>{
    return this.http.get('http://localhost:8080/viewEmployees')
  }
  searchEmployee=(data:any)=>{
    return this.http.post('http://localhost:8080/searchEmployee',data)
  }
  deleteEmployee=(data:any)=>{
    return this.http.post('http://localhost:8080/deleteEmployee',data)
  }
  employeeLogin=(data:any)=>{
    return this.http.post('http://localhost:8080/employeeLogin',data)
  }
  applyLeave=(data:any)=>{
    return this.http.post('http://localhost:8080/addLeaveForm',data)
  }
  viewAllEmployeeLeaveReq=(data:any)=>{
    return this.http.post('http://localhost:8080/viewAllEmployeeLeaveReq',data)
  }
  checkLeave=(data:any)=>{
    return this.http.post('http://localhost:8080/checkLeave',data)
  }
  leaveDaysFind=(data:any)=>{
    return this.http.post('http://localhost:8080/leaveHandle',data)
  }
  leaveDecisionGrant=(data:any)=>{
    return this.http.post('http://localhost:8080/leaveDecisionGrant',data)
  }
  leaveDecisionReject=(data:any)=>{
    return this.http.post('http://localhost:8080/leaveDecisionReject',data)
  }
  employeeLoginEntry=(data:any)=>{
    return this.http.post('http://localhost:8080/employeeEntry',data)
  }
  employeeLoginExit=(data:any)=>{
    return this.http.post('http://localhost:8080/employeeExit',data)
  }
  addSecurity=(data:any)=>{
    return this.http.post('http://localhost:8080/addSecurity',data)
  }
  viewSecurity=()=>{
    return this.http.get('http://localhost:8080/viewSecurity')
  }
  searchSecurity=(data:any)=>{
    return this.http.post('http://localhost:8080/searchSecurity',data)
  }
  securityDelete=(data:any)=>{
    return this.http.post('http://localhost:8080/deleteSecurity',data)
  }
  entryCheck=(data:any)=>{
    return this.http.post('http://localhost:8080/employeeLoginEntry',data)
  }
  securityLogin=(data:any)=>{
    return this.http.post('http://localhost:8080/securityLogin',data)
  }
  viewEmployeesLog=()=>{
    return this.http.get('http://localhost:8080/viewEmployeesLog')
  }

}


