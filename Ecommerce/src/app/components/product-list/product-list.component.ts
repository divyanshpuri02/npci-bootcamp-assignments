import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/common/product';
import { EcommService } from 'src/app/services/ecomm.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  constructor(private service : EcommService) { }
  formModel : Product = new Product(0,"","","",0,"",0,0,"","",0)
   products: Product[];

  ngOnInit(): void {
    this.listOfProducts()
  }
  onSubmit(): void{
    this.products.push(this.formModel)
  }
  listOfProducts(){
    this.service.getAllProduct().subscribe(data => {
      this.products = data
    })
  }
}
