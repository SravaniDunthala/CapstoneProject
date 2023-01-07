import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent {
  customerList: any[]=[];

  constructor(private http:HttpClient){

  }
  ngOnInit() {
    this.getCustomerList();
  }

  getCustomerList(){
    this.http.get('http://localhost:8080/customers').subscribe((responce:any) =>{
      this.customerList = responce;
    })
  }
}
