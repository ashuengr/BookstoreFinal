import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerserviceService {

  constructor(private http: HttpClient) { }
  baseUrl: string = 'http://localhost:8781/';
  getAllCustomerUrl='getAllCustomerDetails';
  acceptustomerUrl='acceptCustomerDetails';
  getCustomers() {
    return this.http.get<Customer[]>(this.baseUrl+this.getAllCustomerUrl);
  }
  createCustomer(customer: Customer) {
    return this.http.post(this.baseUrl+this.acceptustomerUrl, customer);
  }
}
