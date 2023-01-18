import { Component, OnInit } from '@angular/core';
import { AngproductService } from 'src/app/Service/angproduct.service';

@Component({
  selector: 'app-managerproducts',
  templateUrl: './managerproducts.component.html',
  styleUrls: ['./managerproducts.component.css']
})
export class ManagerproductsComponent implements OnInit {
  productDetails: any;
  private products:AngproductService;

  constructor(p:AngproductService) {
    this.products=p;
   }

  ngOnInit(): void {
    this.products.getProducts()
    .subscribe(
      (Response)=>{this.productDetails= Response;},
      (error)=>{console.log(error);}
    )
  }

}
