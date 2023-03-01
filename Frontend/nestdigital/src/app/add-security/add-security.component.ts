import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-add-security',
  templateUrl: './add-security.component.html',
  styleUrls: ['./add-security.component.css']
})
export class AddSecurityComponent {
  constructor(private api:ApiService){}
  secID = ''
  secName = ''
  mail =''
  phone = ''
  address = ''
  username =''
  password = ''


readValue=()=>{
  let data={
    "secID" : this.secID,
    "secName" :this.secName,
    "mail":this.mail,
    "phone" :this.phone,
    "address" :this.address,
    "username" :this.username,
    "password" :this.password
  }
  this.api.addSecurity(data).subscribe(
    (response)=>{
      console.log(response)
      window.location.reload()
    }
  )
}

}
