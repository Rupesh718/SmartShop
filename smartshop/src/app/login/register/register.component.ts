import { Component, OnInit } from '@angular/core';
import { EmailValidator, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AngproductService } from 'src/app/Service/angproduct.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  private registrationService!: AngproductService;
  register = new FormGroup({
first_Name: new FormControl('',[ Validators.required]),
last_Name: new FormControl('',[ Validators.required]),
userName: new FormControl('',[ Validators.required]),
emailId: new FormControl('',[ Validators.required]),
city: new FormControl('',[ Validators.required]),
pincode: new FormControl('',[ Validators.required]),
state: new FormControl('',[ Validators.required]),
password: new FormControl('',[ Validators.required]),
  });

  constructor(Rs:AngproductService , private router: Router) {
    this.registrationService = Rs;
   }

  ngOnInit(): void {
  }

  regsiterUser(){
    console.log(this.register.value);
    this.registrationService.registerUser(this.register.value).subscribe(
      res=>{alert('Welcome'),console.log(res);
      this.router.navigate(['/login']);
    },
      err=>{
        this.register.reset();
        alert('Invalid Details'),console.log(err);}
    );
  }

}

