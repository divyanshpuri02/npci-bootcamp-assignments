import { Component, OnInit } from '@angular/core';
import { SalesPerson } from '../salesperson';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

  constructor() { }

  salesPersonList: SalesPerson[] =[
    new SalesPerson("Div","Puri","divpuri@gmail.com",47000,"200"),
    new SalesPerson("Tommy","Shelby","tommy@gmail.com",42000,"400"),
    new SalesPerson("Arthur", "Shelby","arthurshelby@gmail.com", 45000,"340"),
    new SalesPerson("Shubh", "Shri","shubh@gmail.com", 46000,"290"),
    new SalesPerson("Rishi", "tiwari","tiwari@gmail.com", 33000,"140"),
    new SalesPerson("Kaif", "johnny","Kaif@gmail.com", 34000,"175"),
  ]

  formModel: SalesPerson = new SalesPerson("","","",0,"")

  ngOnInit(): void {
    console.log(this.formModel)

  }
  onSubmit():void{
    this.salesPersonList.push(this.formModel)
  }

}
