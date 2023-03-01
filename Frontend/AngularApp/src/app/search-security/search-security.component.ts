import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-search-security',
  templateUrl: './search-security.component.html',
  styleUrls: ['./search-security.component.css']
})
export class SearchSecurityComponent {
  constructor(private api:ApiService){}
  search:any=''
  style='d-none'
  fetchedData:any=''
  readValue=()=>{
    let data:any={"secID":this.search}
    this.api.searchSecurity(data).subscribe(
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
  deletesec=()=>{
    let data={"secID":this.search}
    console.log(data)
    this.api.securityDelete(data).subscribe(
      (response)=>{
        console.log(response)
      }
    )
    
  }

}
