import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import {Router} from "@angular/router";
import { CustomerserviceService } from '../customerservice.service';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {

  customers: Customer[];

  constructor(private router: Router, private customerService: CustomerserviceService) { }

  ngOnInit() {
    this.customerService.getCustomers()
      .subscribe( data => {
       // console.log(data);
        this.customers= data ;
      });
  }
  add(): void {
    this.router.navigate(['add-user']);
  };

}
