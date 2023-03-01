import { DatePipe } from '@angular/common';
import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-employee-navbar',
  templateUrl: './employee-navbar.component.html',
  styleUrls: ['./employee-navbar.component.css']
})
export class EmployeeNavbarComponent {
  constructor(private api:ApiService){}
  pipe = new DatePipe('en-US');
  time =new Date();
  exitTime:any=''

  exit=()=>{
    let timeFormat = this.pipe.transform(this.time, 'h:mm a');
    this.exitTime = timeFormat;
    let data:any={
      "exitTime":this.exitTime,
      "id":localStorage.getItem("entryId")
  }
  this.api.employeeLoginExit(data).subscribe(
    (response)=>{
    }
  )
  

  }

}
