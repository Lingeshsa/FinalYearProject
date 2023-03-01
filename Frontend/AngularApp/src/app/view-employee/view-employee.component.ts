import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent {
  data:any=[]
  constructor(private api:ApiService){
    this.api.viewEmployee().subscribe(
      (response:any)=>{
        console.log(response)
        this.data=response
      }
    )
  }
}
