import { Component } from '@angular/core';
import { ApiService } from '../api.service';
import { MatDialogModule } from '@angular/material/dialog';

@Component({
  selector: 'app-view-all-employee-leave-req',
  templateUrl: './view-all-employee-leave-req.component.html',
  styleUrls: ['./view-all-employee-leave-req.component.css'],
})
export class ViewAllEmployeeLeaveReqComponent {
  data: any = { empid: 0 };
  fetchedData: any = [];
  leave:any={}
  days:any
  status:any

  constructor(private api: ApiService) {
    this.api.viewAllEmployeeLeaveReq(this.data).subscribe((response: any) => {
      this.fetchedData = response;
      console.log(this.fetchedData)
    });
  }
  myModal: any = document.getElementById('myModal');
  myInput: any = document.getElementById('myInput');
  trigger = (id:any) => {
    let sendId:any={"id":id}
    this.api.checkLeave(sendId).subscribe(
      (response:any)=>{
        this.leave=response[0];
        let leaveType:any=response[0].leaveType
        if(this.leave.leaveType=="casualLeave"){
          this.days=this.leave.casualLeave
        }else if(this.leave.leaveType=="sickLeave"){
          this.days=this.leave.sickLeave
        }else if(this.leave.leaveType=="splLeave"){
          this.days=this.leave.splLeave
        }
      }
    )
    this.myModal.addEventListener('shown.bs.modal', () => {
      this.myInput.focus();
    });
  };

  leaveGranted=(id:any)=>{
    let sendId:any={"id":id}
    this.api.leaveDaysFind(sendId).subscribe(
      (response)=>{
      }
    )
    this.api.leaveDecisionGrant(sendId).subscribe(
      (response)=>{
      }
    )
    window.location.reload();
  }
  leaveRejected=(id:any)=>{
    let sendId:any={"id":id}
    this.api.leaveDecisionReject(sendId).subscribe(
      (response)=>{
      }
    )
    window.location.reload();
  }}
