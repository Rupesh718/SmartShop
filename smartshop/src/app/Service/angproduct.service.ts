import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AngproductService {
  [x: string]: any;
// talk with the external apis
private httpCall:HttpClient;
  constructor(http:HttpClient) { 
    this.httpCall = http;
  }
  getProduct(){//external api --productservice
   return this.httpCall.get("http://localhost:8001/getAllProduct");
  }

  getProducts(){//external api --productservice
    return this.httpCall.get("http://localhost:8001/getAllProduct");
   }
//for posting data
  postProduct(data:any){
    return this.httpCall.post("http://localhost:8001/product",data);
  }
//for login user
loginUser(data:any){
    return this.httpCall.post("http://localhost:8003/Customer/login",data);
  }
//for login manager
managerlogin(data:any){
  return this.httpCall.post("http://localhost:8002/manager/login",data);
}

registerUser(data:any){
  return this.httpCall.post("http://localhost:8003/Customer/addCustomer",data);
}
//for register user
searchbypro(data:any){
  return this.httpCall.get("http://localhost:8001/getByName/"+data);
}

addToCart(data:any){
  return this.httpCall.post("http://localhost:8003/cart/addCart",{data});
}

showCart(data:any){
  return this.httpCall.get(`http://localhost:8003/cart/getCart/${data}`);
}
}
