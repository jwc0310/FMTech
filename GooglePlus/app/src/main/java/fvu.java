import com.google.android.gms.location.LocationRequest;

public class fvu
{
  public LocationRequest a = new LocationRequest();
  
  public long a()
  {
    return this.a.c;
  }
  
  public fvu a(int paramInt)
  {
    LocationRequest localLocationRequest = this.a;
    switch (paramInt)
    {
    case 101: 
    case 103: 
    default: 
      throw new IllegalArgumentException("invalid quality: " + paramInt);
    }
    localLocationRequest.b = paramInt;
    return this;
  }
  
  public fvu a(long paramLong)
  {
    this.a.a(paramLong);
    return this;
  }
  
  public long b()
  {
    return this.a.d;
  }
  
  public fvu b(int paramInt)
  {
    this.a.a(paramInt);
    return this;
  }
  
  public fvu b(long paramLong)
  {
    LocationRequest localLocationRequest = this.a;
    LocationRequest.b(100L);
    localLocationRequest.e = true;
    localLocationRequest.d = 100L;
    return this;
  }
  
  public long c()
  {
    return this.a.f;
  }
  
  public int d()
  {
    return this.a.g;
  }
  
  public LocationRequest e()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fvu
 * JD-Core Version:    0.7.0.1
 */