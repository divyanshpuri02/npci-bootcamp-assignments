import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router';
import { CategoryListComponent } from './components/category-list/category-list.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import {HttpClientModule} from '@angular/common/http';
import { ProductformComponent } from './components/productform/productform.component';

const route : Routes = [
  {path : '',component : WelcomeComponent},
  {path : 'product', component : ProductListComponent},
  {path : 'categories', component : CategoryListComponent},
  {path : 'productform', component : ProductListComponent }

]
@NgModule({
  declarations: [
    AppComponent,
    CategoryListComponent,
    ProductListComponent,
    WelcomeComponent,
    ProductformComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(route),
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
