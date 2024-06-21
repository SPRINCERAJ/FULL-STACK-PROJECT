import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class SigninService {
  private baseUrl="http://localhost:8080/signup";
  constructor(private http:HttpClient) { }
  
  signin(user:User):Observable<any>
  {
    return this.http.post(this.baseUrl,user);
  }
}
