import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class BookingService {
  private baseUrl="http://localhost:8080/booking";
  constructor(private http:HttpClient) { }
  
  dobook(bookingdetails:any):Observable<any>
  {
    console.log(bookingdetails)
    return this.http.post(this.baseUrl,bookingdetails);
  }
  getbookingdetailsbyid(userid: string): Observable<any> {
    const url = this.baseUrl+"/"+userid;
    //console.log(url); // Log the constructed URL for debugging
    return this.http.get(url);
  }

  deletebookingsbyid(bookingid: string): Observable<any> {
    const url = this.baseUrl+"/"+bookingid;
    console.log(url); // Log the constructed URL for debugging
    return this.http.delete(url);
  }
}
