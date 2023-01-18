import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { AngproductService } from 'src/app/Service/angproduct.service';

@Component({
  selector: 'app-managerlogin',
  templateUrl: './managerlogin.component.html',
  styleUrls: ['./managerlogin.component.css']
})
export class ManagerloginComponent implements OnInit {
private managerService: AngproductService;
managerlogin = new FormGroup({
  managerUserName: new FormControl(),
  managerPassword: new FormControl()
})
  constructor(ml:AngproductService , private router: Router) {
    this.managerService = ml;
   }

  ngOnInit(): void {
  }
loginManager(){
  console.log(this.managerlogin.value);
    this.managerService.managerlogin(this.managerlogin.value).subscribe(
      res=>{alert('Welcome'),
      this.router.navigate(['/manager']),
      console.log(res);
    },
      err=>
      {this.managerlogin.reset();
        alert('Invalid Id Password'),console.log(err);}
    );
}

}
