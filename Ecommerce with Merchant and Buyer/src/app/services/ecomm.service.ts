import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, map } from 'rxjs' ;
import { Product } from '../common/product';
import { Category } from '../common/category';

@Injectable({
  providedIn: 'root'
})
export class EcommService {
  private producturl = "http://localhost:8080/api/product";
  private categoryurl = "http://localhost:8080/api/categories"

  constructor(private httpclient : HttpClient) { }

  getAllProduct() : Observable<Product[]>{
    return this.httpclient.get<getProductResponse>(this.producturl).pipe(map(response => response._embedded.products));
  }
  getAllCategory() : Observable<Category[]>{
    return this.httpclient.get<getCategoryResponse>(this.categoryurl).pipe(map(response => response._embedded.categories));
  }
  saveProducts(products : Product) : Observable<Product>{
    console.log(products)

  const httOptions = {
    headers : new HttpHeaders({
    'content-type' : 'application/json',
    'Authorization' : 'auth-token' ,
    'Access-Control-Allow-Origin': '*'
    })
  }

  return this.httpclient.post<Product>(this.producturl,products,httOptions)
}
}
interface getProductResponse{
  _embedded : {
    products : Product[]
  }
}

interface getCategoryResponse{
  _embedded : {
    categories : Category[]
  }
}
