export class User {
    userid:string='';
    emailid:string='';
    password:string='';
    loginstatus:Boolean=false;
    constructor(userid:string,emailid:string,password:string,loginstatus:boolean)
    {
        this.userid=userid;
        this.emailid=emailid;
        this.password=password;
        this.loginstatus=loginstatus
    }
}
