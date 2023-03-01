import { DatePipe } from '@angular/common';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-employee-login',
  templateUrl: './employee-login.component.html',
  styleUrls: ['./employee-login.component.css'],
})
export class EmployeeLoginComponent {
  constructor(private api: ApiService, private router: Router) {}
  username = '';
  password = '';
  pipe = new DatePipe('en-US');
  time = new Date();
  today = new Date();
  entry: any = '';
  currentDate: any = '';

  readValue = () => {
    let data = {
      username: this.username,
      password: this.password,
    };
    let ChangedFormat = this.pipe.transform(this.today, 'YYYY/MM/dd');
    this.currentDate = ChangedFormat;
    let timeFormat = this.pipe.transform(this.time, 'h:mm a');
    this.entry = timeFormat;
    this.api.employeeLogin(data).subscribe((response: any) => {
      if (response.status == 'success') {
        console.log(response)
        localStorage.setItem('userInfo', response.userid);
        this.entry = {
          entryDate: this.currentDate,
          entryTime: this.entry,
          empid: localStorage.getItem('userInfo'),
        };
        this.api.employeeLoginEntry(this.entry).subscribe((response: any) => {
          localStorage.setItem('entryId', response.id);
          console.log(response);
        });
        this.router.navigate(['/leaveApply']);
      } else {
        alert('Login failed !');
      }
    });
  };
}
