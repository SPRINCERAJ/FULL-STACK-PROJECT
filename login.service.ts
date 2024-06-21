import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class LoginService {
    private baseUrl="http://localhost:8080/login";
    constructor(private http:HttpClient) { }

    login(user:User):Observable<any>
    {
      return this.http.post(this.baseUrl,user);
    }
}
