import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'getname'
})
export class GetnamePipe implements PipeTransform {

  transform(email: string): string {
    if(!email) return '';
    return email.split('@')[0];
  }

}
