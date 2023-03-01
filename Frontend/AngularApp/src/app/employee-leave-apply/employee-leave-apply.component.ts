import { Component } from '@angular/core';
import { ApiService } from '../api.service';
import { DatePipe } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee-leave-apply',
  templateUrl: './employee-leave-apply.component.html',
  styleUrls: ['./employee-leave-apply.component.css']
})

export class EmployeeLeaveApplyComponent {
  constructor(private api:ApiService,private router:Router){

let entry:any=''

    let entryCheck: any = { empid: localStorage.getItem('userInfo') };
    console.log(entryCheck);
    this.api.entryCheck(entryCheck).subscribe((response: any) => {
      console.log(response);
      if (response[0].status == 'Granted') {
        alert('You took Leave');
        this.router.navigate(['/employeeLogin'])
      } else {
      }
    });
  }
  leaveType=""
  fromDate=''
  toDate=''
  remarks=''
  today = new Date();
  currentDate:any = '';
  pipe = new DatePipe('en-US');
  readValue=()=>{
    let ChangedFormat = this.pipe.transform(this.today, 'YYYY/MM/dd');
    this.currentDate = ChangedFormat;
    let data:any={
      "empid":localStorage.getItem("userInfo"),
      "leaveType":this.leaveType,
      "fromDate":this.fromDate,
      "toDate":this.toDate,
      "remarks":this.remarks,
      "applyDate":this.currentDate,
    }
    this.api.applyLeave(data).subscribe(
      (response:any)=>{
        window.location.reload();
      }
    )
  }
  
 

}
