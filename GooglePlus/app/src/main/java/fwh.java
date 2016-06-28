import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public final class fwh
  extends fcb
{
  private fvq a;
  
  fwh(fvq paramfvq)
  {
    this.a = paramfvq;
  }
  
  public final void a(LocationAvailability paramLocationAvailability)
  {
    this.a.a(new fvp(this, paramLocationAvailability));
  }
  
  public final void a(LocationResult paramLocationResult)
  {
    this.a.a(new fvw(this, paramLocationResult));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    fwh localfwh = (fwh)paramObject;
    return this.a.equals(localfwh.a);
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fwh
 * JD-Core Version:    0.7.0.1
 */