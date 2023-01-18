import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { AngproductService } from '../../Service/angproduct.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  private productService:AngproductService;

  addProduct = new FormGroup({
    pId:new FormControl(' ' ,[Validators.required]),
    pName:new FormControl(' ' ,[Validators.required]),
    pPrice:new FormControl(' ' ,[Validators.required]),
    pQuantity:new FormControl(' ' ,[Validators.required])
  });
  constructor(ps:AngproductService) {
    this.productService =ps;
   }

  ngOnInit(): void {
    // console.log("form details are: ");
    // console.log("this.addProduct");
  }

  registerProduct(){
    console.log(this.addProduct.value);
    this.productService.postProduct(this.addProduct.value).subscribe(
      res=>{alert('Product Added Successfully'),console.log(res);},
      err=>{alert('Error Is There'),console.log(err)}
    );
    this.productService.getProduct();
  }

}
