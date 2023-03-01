import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent {
  constructor(private api:ApiService){}
  empid = ''
  empName = ''
  designation = ''
  mail = ''
  phone = ''
  address = ''
  username = ''
  password =''

        readValue=()=>{
         let data={
          "empid" : this.empid,
          "empName" : this.empName,
          "designation" : this.designation,
          "mail" : this.mail,
          "phone" : this.phone,
          "address" : this.address,
          "username" :this.username,
          "password" : this.password
         }
         this.api.addEmployee(data).subscribe(
          (response:any)=>{
            if(response.status=="success"){
              alert("added")
              this.empid = ''
              this.empName = ''
              this.designation = ''
              this.mail = ''
              this.phone = ''
              this.address = ''
              this.username = ''
              this.password =''

            }
          }
         )

        }

}
