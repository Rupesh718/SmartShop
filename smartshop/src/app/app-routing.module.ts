
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddproductComponent } from './products/addproduct/addproduct.component';
import { LoginComponent } from './login/login/login.component';
import { ManagerloginComponent } from './login/managerlogin/managerlogin.component';
import { RegisterComponent } from './login/register/register.component';
import { ShowproductComponent } from './products/showproduct/showproduct.component';
import { ProducthomeComponent } from './products/producthome/producthome.component';
import { ManagerComponent } from './manager/manager.component';
import { UserComponent } from './user/user.component';
import { AddCartComponent } from './products/add-cart/add-cart.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { HomeComponent } from './home/home.component';
import { ManagerproductsComponent } from './products/managerproducts/managerproducts.component';

const routes: Routes = [
  {path:'showproduct', component:ShowproductComponent},
  {path:'addproduct', component:AddproductComponent},
  {path:'login', component:LoginComponent},
  {path:'register', component:RegisterComponent},
  {path:'managerlogin', component:ManagerloginComponent},
  {path:'producthome', component:ProducthomeComponent},
  {path:'manager',component:ManagerComponent},
  {path:'user',component:UserComponent},
  {path:'cart',component:AddCartComponent},
  {path:'search',component:SearchproductComponent},
  {path:'home',component:HomeComponent},
  {path:'show',component:ManagerproductsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
