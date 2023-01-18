import { HttpClient, HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AngproductService } from './Service/angproduct.service';
import { ShowproductComponent } from './products/showproduct/showproduct.component';
import { AddproductComponent } from './products/addproduct/addproduct.component';
import { FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './login/login/login.component';
import { RegisterComponent } from './login/register/register.component';
import { ManagerloginComponent } from './login/managerlogin/managerlogin.component';
import { ProducthomeComponent } from './products/producthome/producthome.component';
import { ManagerComponent } from './manager/manager.component';
import { UserComponent } from './user/user.component';
import { RouterModule } from '@angular/router';
import { AddCartComponent } from './products/add-cart/add-cart.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { HomeComponent } from './home/home.component';
import { ManagerproductsComponent } from './products/managerproducts/managerproducts.component';

@NgModule({
  declarations: [
    AppComponent,
    ShowproductComponent,
    AddproductComponent,
    LoginComponent,
    RegisterComponent,
    ManagerloginComponent,
    ProducthomeComponent,
    ManagerComponent,
    UserComponent,
    AddCartComponent,
    SearchproductComponent,
    HomeComponent,
    ManagerproductsComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
  ],
  providers: [AngproductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
