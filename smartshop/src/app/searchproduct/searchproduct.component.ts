import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AngproductService } from '../Service/angproduct.service';

@Component({
  selector: 'app-searchproduct',
  templateUrl: './searchproduct.component.html',
  styleUrls: ['./searchproduct.component.css']
})
export class SearchproductComponent implements OnInit {
  getForm = new FormGroup({
    pName:new FormControl('',[
      Validators.required] ),
  })

  private products:AngproductService
  response: any=[];
  constructor(p:AngproductService,private route:Router) {
    this.products = p;
   }

  ngOnInit(): void {
  }

  pName(){
    console.log("pName", this.getForm.value.pName);
    
    this.products.searchbypro(this.getForm.value.pName)
    .subscribe((res)=>{this.response=res;
              if (!res) {
      alert('Product Is Not Available')
    }},);
  }


}
