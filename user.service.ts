import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private currentUserSubject:BehaviorSubject<User>;
  constructor() { 
    this.currentUserSubject=new BehaviorSubject<User>(new User("","","",false))
  }
  public getCurrentUser():Observable<User>{
    return this.currentUserSubject.asObservable();
  }
  public setCurrentUser(user:User):void{
    this.currentUserSubject.next(user);
  }
}
