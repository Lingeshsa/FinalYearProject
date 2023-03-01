import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { FormsModule } from '@angular/forms';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { Router, RouterModule, Routes } from '@angular/router';
import { ViewEmployeeComponent } from './view-employee/view-employee.component';
import { AdminNavbarComponent } from './admin-navbar/admin-navbar.component';
import { SearchEmployeeComponent } from './search-employee/search-employee.component';
import { DeleteEmployeeComponent } from './delete-employee/delete-employee.component';
import { EmployeeLoginComponent } from './employee-login/employee-login.component';
import { EmployeeLeaveApplyComponent } from './employee-leave-apply/employee-leave-apply.component';
import { ViewProfileComponent } from './view-profile/view-profile.component';
import { EmployeeNavbarComponent } from './employee-navbar/employee-navbar.component';
import { ViewAllEmployeeLeaveReqComponent } from './view-all-employee-leave-req/view-all-employee-leave-req.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AddSecurityComponent } from './add-security/add-security.component';
import { ViewSecurityComponent } from './view-security/view-security.component';
import { SearchSecurityComponent } from './search-security/search-security.component';
import { SecurityLoginComponent } from './security-login/security-login.component';
import { ViewEmployeLogComponent } from './view-employe-log/view-employe-log.component';
import { SecurityNavbarComponent } from './security-navbar/security-navbar.component';
const myRouter:Routes=[{
  path:'',
  component:AdminLoginComponent
},
{
  path:'addEmployee',
  component:AddEmployeeComponent
},
{
  path:'viewEmployee',
  component:ViewEmployeeComponent
},
{
  path:'searchEmployee',
  component:SearchEmployeeComponent
},
{
  path:'deleteEmployee',
  component:DeleteEmployeeComponent
},
{
  path:'employeeLogin',
  component:EmployeeLoginComponent
},
{
  path:'leaveApply',
  component:EmployeeLeaveApplyComponent
},
{
  path:'viewProfile',
  component:ViewProfileComponent
},
{
  path:'viewAllEmployeeLeaveReq',
  component:ViewAllEmployeeLeaveReqComponent
},
{
  path:'securityLogin',
  component:SecurityLoginComponent
},
{
  path:'addSecurity',
  component:AddSecurityComponent
},
{
  path:'viewSecurity',
  component:ViewSecurityComponent
},
{
  path:'searchSecurity',
  component:SearchSecurityComponent
},
{
  path:'viewEmployeeLog',
  component:ViewEmployeLogComponent
}]
@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    AddEmployeeComponent,
    ViewEmployeeComponent,
    AdminNavbarComponent,
    SearchEmployeeComponent,
    DeleteEmployeeComponent,
    EmployeeLoginComponent,
    EmployeeLeaveApplyComponent,
    ViewProfileComponent,
    EmployeeNavbarComponent,
    ViewAllEmployeeLeaveReqComponent,
    NavbarComponent,
    AddSecurityComponent,
    ViewSecurityComponent,
    SearchSecurityComponent,
    SecurityLoginComponent,
    ViewEmployeLogComponent,
    SecurityNavbarComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,HttpClientModule,RouterModule.forRoot(myRouter)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
