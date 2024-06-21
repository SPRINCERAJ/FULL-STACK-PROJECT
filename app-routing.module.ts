import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { PackageComponent } from './package/package.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { PackagedetailComponent } from './packagedetail/packagedetail.component';
import { BookingComponent } from './booking/booking.component';
import { PlaceComponent } from './place/place.component';
import { MybookingComponent } from './mybooking/mybooking.component';
const routes: Routes = [{path:'',component:AboutComponent},
                        {path:'home',component:AboutComponent},
                        {path:'package',component:PackageComponent},
                        {path:'login',component:LoginComponent},
                        {path:'signin',component:SignupComponent},
                        {path:'package/:id',component:PackagedetailComponent},
                        {path:'place',component:PlaceComponent},
                        {path:'package/:id/booking',component:BookingComponent},
                        {path:'mybooking',component:MybookingComponent}
                      ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
