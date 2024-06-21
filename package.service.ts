import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PackageService {
  private baseUrl = "http://localhost:8080/getpackage/";

  constructor(private http: HttpClient) { }

  getpackagedetails(placename: string): Observable<any> {
    const url = `${this.baseUrl}${placename}`;
    return this.http.get(url);
  }


  private baseUrl1 = "http://localhost:8080/getpackagebyid/";

  getpackagedetailsbyid(packageid: string): Observable<any> {
    const url = this.baseUrl1+""+packageid
    console.log(url)
    return this.http.get(url);
  }
}
