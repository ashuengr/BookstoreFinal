import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import { CustomerserviceService } from '../customerservice.service';
@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,private router: Router, private customerService: CustomerserviceService) { }

  addForm: FormGroup;

  ngOnInit() {

    this.addForm = this.formBuilder.group({
      customerId: [],
      customerEmailId: ['', Validators.required],
      customerFullName: ['', Validators.required],
      customerPassword: ['', Validators.required],
      customerMobileNumber: ['', Validators.required],
      city: ['', Validators.required],
      zipCode: ['', Validators.required],
      country: ['', Validators.required],

    });

  }

  onSubmit() {
    if(!this.addForm.invalid){
      this.customerService.createCustomer(this.addForm.value)
      .subscribe( data => {
        this.router.navigate(['list-user']);
        alert('Customer Succesfully added')
      });
    }
    
  }


}
