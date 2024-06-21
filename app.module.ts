import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AboutComponent } from './about/about.component';
import { FooterComponent } from './footer/footer.component';
import { PackageComponent } from './package/package.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { PackagedetailComponent } from './packagedetail/packagedetail.component';
import { PlaceComponent } from './place/place.component';
import { BookingComponent } from './booking/booking.component';
import { MybookingComponent } from './mybooking/mybooking.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { GetnamePipe } from './getname.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AboutComponent,
    FooterComponent,
    PackageComponent,
    LoginComponent,
    SignupComponent,
    PackagedetailComponent,
    PlaceComponent,
    BookingComponent,
    MybookingComponent,
    GetnamePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
