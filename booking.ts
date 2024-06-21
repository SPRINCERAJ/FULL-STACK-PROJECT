export class Booking {
        //bookingid:String= "";
        name:String="";
        emailid:String ="";
        tripdate:String= "";
        //bookingdate:String= "";
        phoneno:Number=0;
        elderscount:Number= 0;
        childrencount:Number= 0;
        splreq:String= "";
        userid:String= "";
        packageid:String= ""
        constructor(
            name:String,
            emailid:String,
            tripdate:String,
            phoneno:Number,
            elderscount:Number,
            childrencount:Number,
            splreq:String,
            userid:String,
            packageid:String)
            {
                name=this.name
                emailid=this.emailid
                tripdate=this.tripdate
                phoneno=this.phoneno
                elderscount=this.elderscount
                childrencount=this.childrencount
                splreq=this.splreq
                userid=this.userid
                packageid=this.packageid
            }
}
