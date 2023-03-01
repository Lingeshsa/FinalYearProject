import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-view-employe-log',
  templateUrl: './view-employe-log.component.html',
  styleUrls: ['./view-employe-log.component.css']
})
export class ViewEmployeLogComponent {
  data:any=''
  constructor(private api:ApiService){
    this.api.viewEmployeesLog().subscribe(
      (response:any)=>{
         this.data=response
      }
    )
  }

}
