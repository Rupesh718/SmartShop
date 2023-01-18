import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AngproductService } from 'src/app/Service/angproduct.service';

@Component({
  selector: 'app-add-cart',
  templateUrl: './add-cart.component.html',
  styleUrls: ['./add-cart.component.css']
})
export class AddCartComponent implements OnInit {
  productsInCart: any;
  constructor(private readonly angService: AngproductService,
    private readonly router: Router) { }

  ngOnInit(): void {
    const data = JSON.parse(String(localStorage.getItem("userData")));
    this.angService.showCart(data.id).subscribe((res) => {this.productsInCart = res; console.log("cartData",this.productsInCart);
    });
  }

  orderPlaced() {
    window.alert("Your Order is Successfully Placed");
    this.router.navigate(['/home']);
  }

}
