import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from 'src/app/common/category';
import { Product } from 'src/app/common/product';
import { EcommService } from 'src/app/services/ecomm.service';

@Component({
  selector: 'app-productform',
  templateUrl: './productform.component.html',
  styleUrls: ['./productform.component.css']
})
export class ProductformComponent implements OnInit {

  product : Product = new Product(0,"","","",0,"",0,0,"","",0)
  categories : Category[]
  constructor(private service : EcommService, private route : Router) { }

    ngOnInit(): void {
      this.listCategory()
    }
    listCategory(){
      this.service.getAllCategory().subscribe(data=>{
        this.categories=data;
      })
    }
    onSubmit(): void{
      this.service.saveProducts(this.product).subscribe(() =>{
        this.route.navigateByUrl("/shop")
      })
    }

    gotoHome(){
      this.route.navigateByUrl("/")
    }

    viewProduct(){
      this.route.navigateByUrl("/shop")
    }
  }

