import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-delete-employee',
  templateUrl: './delete-employee.component.html',
  styleUrls: ['./delete-employee.component.css']
})
export class DeleteEmployeeComponent {
  constructor(private api:ApiService){}
  delete=''
  readValue=()=>{
    let data={"empid":this.delete}
    this.api.deleteEmployee(data).subscribe(
      (response:any)=>{
        console.log(response.status=="employee deleted")
        if(response.status=="employee deleted"){
          this.delete=''
        }else{
          alert("Delete valid employee")
        }
      }
    )
  }

}
