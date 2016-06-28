import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Map;

class fsr
{
  private Map<fsf, efg> a = new kl();
  private Map<fry, efi> b = new kl();
  
  public <O> eew a(fsb<O> paramfsb)
  {
    if ((paramfsb instanceof fsp)) {
      return ((fsp)paramfsb).a();
    }
    return null;
  }
  
  public efd a(fsc paramfsc)
  {
    if ((paramfsc instanceof fta)) {
      return ((fta)paramfsc).e();
    }
    return null;
  }
  
  public efg a(fsf paramfsf)
  {
    if (this.a.containsKey(paramfsf)) {
      return (efg)this.a.get(paramfsf);
    }
    fss localfss = new fss(this, paramfsf);
    this.a.put(paramfsf, localfss);
    return localfss;
  }
  
  public efi a(fry paramfry)
  {
    if (this.b.containsKey(paramfry)) {
      return (efi)this.b.get(paramfry);
    }
    fst localfst = new fst(this, paramfry);
    this.b.put(paramfry, localfst);
    return localfst;
  }
  
  public frs a(ConnectionResult paramConnectionResult)
  {
    return new fsq(paramConnectionResult);
  }
  
  public fsg<fsk> a(efk<Status> paramefk)
  {
    return new fsg(paramefk, fsx.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fsr
 * JD-Core Version:    0.7.0.1
 */