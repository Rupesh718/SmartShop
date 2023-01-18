import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { AngproductService } from 'src/app/Service/angproduct.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  private loginService: AngproductService;
  login = new FormGroup({
userName: new FormControl(),
password : new FormControl()
  });
  route: any;


  constructor(ls:AngproductService, private router: Router) {
    this.loginService = ls;
   }

  ngOnInit(): void {
  }

  loginUser(){
    console.log("customerdata",this.login.value);
    this.loginService.loginUser(this.login.value).subscribe(
      res=>{
        console.log("res",res);
        localStorage.setItem("userData",JSON.stringify(res));
        this.router.navigate(['/producthome'])

        // if(this.login.value.userName=="Admin" && this.login.value.password=="Abcd@123"){
        //   alert("hi admin")
        //   this.router.navigate(['/manager'])
        // }
        // localStorage.setItem('customerData',);
      },
      err=>{
        this.login.reset();
        alert('Invalid Id Password'),console.log(err);}
    );
  }

}
