import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { AngproductService } from '../../Service/angproduct.service';
import { ProducthomeComponent } from '../producthome/producthome.component';

@Component({
  selector: 'app-showproduct',
  templateUrl: './showproduct.component.html',
  styleUrls: ['./showproduct.component.css'],
})
export class ShowproductComponent implements OnInit {
  productDetails: any;
  private productService: AngproductService;
  Id = localStorage.getItem('customerData');

  constructor(ps: AngproductService, private router: Router) {
    this.productService = ps;
  }

  addToCart(product: any, quantity: any) {
    console.log('quantity', quantity);
    const customerData = JSON.parse(String(localStorage.getItem('userData')));
    console.log('customerData', customerData);
    const data = {
      pId: product.pId,
      pPrice: product.pPrice,
      pName: product.pName,
      customer: {
        id: customerData.id,
        first_Name: customerData.first_Name,
        last_Name: customerData.last_Name,
        userName: customerData.userName,
        emailId: customerData.emailId,
        city: customerData.city,
        pincode: customerData.pincode,
        state: customerData.state,
        password: customerData.password,
      },
      pQuantity: quantity,
    };
    this.productService.addToCart(data).subscribe(
      (res) => {
        this.router.navigate(['/cart']);
      },
      (error) => {
        console.warn(error);
      }
    );
  }

  ngOnInit(): void {
    this.productService.getProduct().subscribe(
      (response) => {
        this.productDetails = response;
      },
      (error) => {
        console.log(error);
      }
    );
  }
}
