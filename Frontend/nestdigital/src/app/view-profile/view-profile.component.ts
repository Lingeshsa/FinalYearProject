import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-view-profile',
  templateUrl: './view-profile.component.html',
  styleUrls: ['./view-profile.component.css']
})
export class ViewProfileComponent {
   fetchedData:any={}

  constructor(private api:ApiService){
    let data={"empid":localStorage.getItem("userInfo")}
    console.log(data)
    this.api.searchEmployee(data).subscribe(
      (response:any)=>{
        console.log(response)
          this.fetchedData=response[0]
      }
    )
  }
  readValue=()=>{
    
  }


}
