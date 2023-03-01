import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-search-employee',
  templateUrl: './search-employee.component.html',
  styleUrls: ['./search-employee.component.css']
})
export class SearchEmployeeComponent {
  constructor(private api:ApiService){}
  style='d-none '
  search=''
  fetchedData:any={}
  readValue=()=>{
    let data={"empid":this.search}
    this.api.searchEmployee(data).subscribe(
      (response:any)=>{
        console.log(response)
        if(response.length!=0){
          this.style='d-flex'
          this.fetchedData=response[0]
        }else{
          alert("Search valid employee!")
          this.style='d-none'
          this.search=''
        }
      }
    )
  }

  deleteEmp=()=>{
      let data={"empid":this.search}
      this.api.deleteEmployee(data).subscribe(
        (response:any)=>{
          console.log(response.status=="employee deleted")
          if(response.status=="employee deleted"){
            this.search=''
            window.location.reload()
          }else{
            alert("Delete valid employee")
          }
        }
      )
    }
  }

