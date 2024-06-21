import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlaceService {
  private baseUrl = "http://localhost:8080/getplace/";

  constructor(private http: HttpClient) { }

  getplacedetails(placename: string): Observable<any> {
    const url = `${this.baseUrl}${placename}`;
    console.log(url); // Log the constructed URL for debugging
    return this.http.get(url);
  }
}
